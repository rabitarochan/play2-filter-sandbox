package com.rabitarochan.play2.filter

import play.api.mvc.{ Request, WrappedRequest }
import scala.collection.concurrent.TrieMap

/**
 * AttributedRequest に設定するキーを定義するトレイト。
 */
trait AttributeKey[A] {
  
  /**
   * AttributedRequest から、このキーに該当する値を取得する。
   * 
   * {{{
   * case object NameKey extends AttributedKey[String]
   * 
   * Filter { request =>
   *   continueWith(NameKey -> "hoge")
   * } >> WithAction { implicit request =>
   *   val nameOpt = NameKey.get
   *   nameOpt match {
   *     case Some(name) => Ok(s"Name is ${name}!")
   *     case None       => Ok("Name is None...")
   *   }
   * }
   * }}}
   */
  def get[B](implicit attributes: AttributedRequest[B]): Option[A] = {
    attributes.get(this)
  }
  
}

/**
 * 属性を保持できるようにした Request クラス。
 * 
 * Filter 処理の結果を後続の Filter, Action に渡すために利用する。
 */
class AttributedRequest[A](request: Request[A], val attributes: TrieMap[AttributeKey[_], Any]) extends WrappedRequest[A](request) {
  
  /**
   * AttributedKey に該当する値を取得する。
   */
  def get[B](key: AttributeKey[B]): Option[B] =
    attributes.get(key).flatMap { value =>
      try {
        Some(value.asInstanceOf[B])
      } catch {
        case _: ClassCastException => None
      }
    }
  
  /**
   * AttributedKey に該当する値を設定する。
   */
  def set[B](key: AttributeKey[B], value: B): AttributedRequest[A] = {
    attributes.put(key, value)
    this
  }
  
}