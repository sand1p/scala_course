object session {

  def sqrt(x: Double): Double = {
    val abs = (x: Double) => if (x < 0) -x else x

    val improve = (guess: Double, x: Double) => (guess + x / guess) / 2

    val isGoodEnough = (guess: Double, x: Double) => abs(guess * guess - x) / x < 0.001

    def sqrtIter(guess: Double, x: Double): Double = {
      println(s"guess: $guess")
      if (isGoodEnough(guess, x)) guess else sqrtIter(improve(guess, x), x)
    }

    sqrtIter(1.0, x)
  }

  //  sqrtIter(1.0, 1e-6)
  //  sqrtIter(1.0, 1e60)
  def main(args: Array[String]): Unit = {
    println(s"sqrt : ${sqrt(23)}")
  }
}