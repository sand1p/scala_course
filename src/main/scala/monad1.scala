trait Monad[A] {
  def flatMap[B](f: A => Monad[B]): Monad[B]
}



object monad1 {
  def main(args: Array[String]): Unit = {
    val f = (i: Int) => List(i - 1, 1, i + 1)

  }
}
