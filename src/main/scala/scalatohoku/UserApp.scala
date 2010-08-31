package scalatohoku

trait UserApp extends App {
  get("/user") { 
    <html><body><h1>User管理</h1></body></html>
  }
}
