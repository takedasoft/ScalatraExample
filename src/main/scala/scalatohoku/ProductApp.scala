package scalatohoku

trait ProductApp extends App {
  get("/product") { 
    <html><body><h1>Product管理</h1></body></html>
  }
}
