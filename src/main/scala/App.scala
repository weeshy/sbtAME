object Holder {
  class Run extends Test {
    val base = new Base
  }
}

object Main extends App {
  println("begin")
  val holder = Holder
  val run = new holder.Run()
  println("end")
}
