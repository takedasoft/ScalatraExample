package scalatohoku

import org.scalatra._
import scalate.ScalateSupport

class SimpleServlet extends ScalatraServlet with ScalateSupport {

  before {contentType = "text/html"}
  
  get("/") { 
    <html><body><h1>Hello!</h1></body></html>
  }
  
  get("/time") {
    templateEngine.layout("/WEB-INF/time.mustache", Map( "time" -> new java.util.Date ))
  }
  
  get("/hackers") {
    val hackers = Seq(
      Map("name"->"keisuke_n","site"->"http://cappuccino.jp/keisuken/logbook/"),
      Map("name"->"kmizu","site"->"http://d.hatena.ne.jp/kmizushima/"),
      Map("name"->"yuroyoro","site"->"http://d.hatena.ne.jp/yuroyoro/")
    )
    templateEngine.layout("/WEB-INF/hackers.mustache", Map( "list" -> hackers ))
  }
  
}
