trait Monad[A] {
  def flatMap[B](f: A => Monad[B]): Monad[B]
}

//def unit[A](x: A): Monad[A]

val f = (i: Int) => List("pred=" + (i - 1), "succ=" + (i + 1))

val fun = (i: Int) => List(i - 1, i, i + 1)


trait IGift[Book] {
  def flatMap[PDF](f: Book => IGift[PDF]): IGift[PDF]
}

val upperCase = (s: String) => Gift(s.toUpperCase())

case class Gift[T](x: T) extends IGift[T] {
  override def flatMap[K](f: T => IGift[K]): IGift[K] = f(x)
}

def unit[T](x: T): Gift[T] = Gift(x)

val unit1 = unit(Gift("Gopi"))
val value: IGift[String] = unit1
  .flatMap(a => upperCase(a.x))

val list = List(1)
val gift = Gift("Some Book")

list.flatMap((a) => "gopi")
gift.flatMap((s) => Gift(s, "s1 = " + s))
