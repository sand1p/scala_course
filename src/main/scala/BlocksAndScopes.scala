object BlocksAndScopes {

  // modular

  // though
  // sqrtIter , improve , isGoodEnough we do not want to access this functions from outside of square root function

  // we want to avoid namespace pollution

  // blocks are limited by braces
  def main(args: Array[String]): Unit = {


    val x = 0

    def f(y: Int): Int = y + 1


    val result = {
      val x = f(3)
      x * x
    } + x
    println(result)

  }
}