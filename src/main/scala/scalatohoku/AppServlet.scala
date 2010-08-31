package scalatohoku

import org.scalatra._
import scalate.ScalateSupport

class AppServlet extends ScalatraServlet with ScalateSupport {

  before {contentType = "text/html"}
  
  get("/") { 
    <html><body><h1>Hello!</h1></body></html>
  }
  
  get("/next") {
    templateEngine.layout("/WEB-INF/next.mustache" )
  }
  
  protected def contextPath = request.getContextPath
}
