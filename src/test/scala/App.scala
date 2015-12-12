object THolder {
  class Run extends Test {
    val base = new Base
  }
}

object TMain extends App {
  println("begin")
  val holder = THolder
  val run = new holder.Run()
  println("end")
}
