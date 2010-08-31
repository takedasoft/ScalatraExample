package scalatohoku

import org.scalatra._
import scalate.ScalateSupport

trait App extends ScalatraServlet with ScalateSupport {
  before {contentType = "text/html"}
}
