object SquareRoot {

  def sqrt(x: Double): Double = {
    //x value sis visible everywhere

    val abs = (x: Double) => if (x < 0) -x else x

    val improve = (guess: Double) => (guess + x / guess) / 2

    val isGoodEnough = (guess: Double) => abs(guess * guess - x) / x < 0.001

    def sqrtIter(guess: Double): Double = {
      println(s"guess: $guess")
      if (isGoodEnough(guess)) guess else sqrtIter(improve(guess))
    }

    sqrtIter(1.0)
  }

  //  sqrtIter(1.0, 1e-6)
  //  sqrtIter(1.0, 1e60)
  def main(args: Array[String]): Unit = {
    println(s"sqrt : ${sqrt(23)}")
  }
}