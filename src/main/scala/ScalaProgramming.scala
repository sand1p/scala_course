object ScalaProgramming {
  /*
    substitution model
      REPL -> read eval- print -loop
      sbt ->  sbt console
       type of defeinition

    Evaluation
     1. Take the leftmost
     2. eval operands
     3. apply the operator to the operands

     eval name -> applying right hand value to the left hand

     expression ->
     (2 * pi )  * radius
     (2 * 3.14) * radius
        6 .28   * radius
        6.28    * 10
        62.8318
  */


  def main(args: Array[String]): Unit = {
    val x = 4
    val y = 5
    println(s" Square of Number: ${square(square(x))}")
    println(s" Sum of Squares: ${sumOfSquares(x, y)}")
    println(s" Sum of Squares: ${sumOfSquares(x, y)}")

  }

  //parameterise definitions

  def square(x: Double) = x * x

  def sumOfSquares(x: Double, y: Double): Double = square(x) + square(y)

//  def power(x: Double, y: Double): Double =


  //side effect of expressions -> c++  assigns values c and increment it to use next time -> c++ has side effect in assignment
  //substitution model is as powerful as turing machine ->
  //lamda calculus
  // substitution model
  //
}
