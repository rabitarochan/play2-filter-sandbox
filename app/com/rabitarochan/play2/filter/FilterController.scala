package com.rabitarochan.play2.filter

import play.api.mvc._
import play.api.mvc.Results.Status
import scala.collection.concurrent.TrieMap

/**
 * フィルター処理の Result を AttributedRequest で保持するためのキー。
 * ライブラリ内でのみ利用することを想定している。
 */
private[filter] case object ResultKey extends AttributeKey[Result]

/**
 * フィルター処理を提供するトレイト。
 * play.api.mvc.Controller に mixin して利用する。
 */
trait FilterController { self: Controller =>
    
  /**
   * 次のフィルター処理に移るための Result を生成する。
   */
  def continue: Result = new ContinueResult()
  
  /**
   * 属性を設定し、次のフィルター処理に移るための Result を生成する。
   */
  def continueWith[A](pair: Pair[AttributeKey[A], A]): Result = new ContinueWithValueResult(pair)
  
  /**
   * フィルター処理を定義する。
   */
  def Filter[A](f: AttributedRequest[A] => Result): FilterAction[A] = new FilterAction(
    request => {
      val beforeResult = request.get(ResultKey)
      
      if (isUseNextResult(request, beforeResult)) {
        request.set(ResultKey, f(request))
      }

      request
    }
  ) 
  
  /**
   * フィルター処理後のActionを定義する。
   */
  def WithAction[A](parser: BodyParser[A])(f: AttributedRequest[A] => Result): Action[A] = Action(parser) { request =>
    val ar = request.asInstanceOf[AttributedRequest[A]]
    val beforeResult = ar.get(ResultKey)
      
    if (isUseNextResult(ar, beforeResult)) {
      f(ar)
    } else {
      beforeResult.get
    }
  }
  
  def WithAction(f: AttributedRequest[AnyContent] => Result): Action[AnyContent] = WithAction(parse.anyContent)(f)

  /**
   * 次の Filter もしくは Action の結果を利用するかを判定する。
   * 
   * Result が存在しない場合:
   *   次のFilter, Action処理に移る。
   * Result が存在し、ContinueResult, ContinueWithValueResultのどちらかの場合:
   *   次のFilter, Action処理に移る。
   * Result が存在し、上記以外の Result の場合:
   *   その Result をリクエストの結果として利用する。
   */
  private[this] def isUseNextResult[A](request: AttributedRequest[A], resultOpt: Option[Result]): Boolean = resultOpt match {
    case Some(result) => result match {
      case _: ContinueResult                =>
        true
      case cwvr: ContinueWithValueResult[_] =>
        request.set(cwvr.value._1, cwvr.value._2)
        true
      case _                                =>
        false
    }
    case None         => true
  }

}

/**
 * Filter 処理を保持するクラス。
 */
class FilterAction[A](private val f: AttributedRequest[A] => AttributedRequest[A]) {
  
  /**
   * Filter 処理を実行する。
   */
  def apply(request: AttributedRequest[A]) = f(request)

  /**
   * 別の Filter を結合する。
   */
  def >>(nextFilter: FilterAction[A]): FilterAction[A] = new FilterAction(
    f andThen nextFilter.f 
  )
  
  /**
   * Filter と Action を結合する。
   */
  def >>(action: Action[A]): Action[A] = Action[A](action.parser) { request =>
    val attributedRequest = new AttributedRequest(request, new TrieMap)
    action( f(attributedRequest) )
  }
  
}

/**
 * Filter 処理でリクエストの結果が決まらなかった場合に利用する Result クラス。
 */
class ContinueResult() extends Status(500)

/**
 * Filter 処理でリクエストの結果が決まらなかった場合に利用する Result クラス。
 * 以降の Filter, Action に引き渡す属性を保持する。
 */
class ContinueWithValueResult[A](val value: Pair[AttributeKey[A], A]) extends Status(500)