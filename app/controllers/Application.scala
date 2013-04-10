package controllers

import play.api._
import play.api.mvc._
import com.rabitarochan.play2.filter._
import play.Logger
import views.html.defaultpages.badRequest

object Application extends Controller with FilterController {
  
  def index = LoggingFilter >> WithAction { req =>
    Ok(views.html.index("Your new application is ready."))
  }
  
  case class User(name: String, password: String)
  
  case object UserKey extends AttributeKey[User]

  /**
   * 認証もどきのフィルター。
   * 
   * QueryString に user と password が設定されていて、
   * その値が同じであれば User を作成して次の処理へ進む。
   * それ以外の場合は認証エラー (Unauthorized) を返す。 
   */
  def AuthFilter = Filter { req: AttributedRequest[AnyContent] =>
    val userOpt = req.getQueryString("user")
    val passwordOpt = req.getQueryString("password")
    
    (userOpt, passwordOpt) match {
      case (Some(user), Some(password)) if user == password => {
        continueWith(UserKey -> User(user, password))
      }
      case _ => Unauthorized("user is not equal password.")
    }
  }
  
  /**
   * ログを出力するだけのフィルター
   */
  def LoggingFilter = Filter { req: AttributedRequest[AnyContent] =>
    Logger.debug(s"[${req.method}] ${req.path}")
    continue
  }
  
  
  def test = 
    LoggingFilter >>
    AuthFilter >>
    WithAction { implicit request =>
      val user = UserKey.get
      Ok(s"Action: ${user}")
    }
  
}