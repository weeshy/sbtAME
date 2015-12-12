trait Test { // only traits fails, classes are ok.
  private[Test] object NextInt {
    def apply(x : Int) = x + 1
  }

  private[Test] def nextInt(x : Int) = x + 1

  class Base {
    val x = nextInt(0) // ok
    val y = NextInt(0) // fail
  }
}
