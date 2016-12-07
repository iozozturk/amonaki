

/**
  * Created by trozozti on 12/6/16.
  */
object Application extends App {
  def main = {
    ammonite.Main(
      predef = "println(\"Starting Debugging!\")"
    )
  }

  println("started")
  val x  ="marine"
  val y  ="lord"
  def z = println("ismet")
  main.run(
    "x" -> x
  )

//  import ammonite.sshd._
//  val replServer = new SshdRepl(
//    SshServerConfig(
//      address = "localhost", // or "0.0.0.0" for public-facing shells
//      port = 22222, // Any available port
//      username = "repl", // Arbitrary
//      password = "your_secure_password" // or ""
//    )
//  )
//  replServer.start()



}


