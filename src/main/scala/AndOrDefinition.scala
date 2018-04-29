class AndOrDefinition {

  def and(x: Boolean, y: Boolean): Boolean = {
    if (x) y else false
  }

  def or(x: Boolean, y: Boolean): Boolean = {
    if (x) true else y
  }

  def loop: Boolean = loop
}

object Main{
  def main(args: Array[String]): Unit = {
    val operator= new AndOrDefinition
    println(s"${operator.and(true,false)}")
    println(s"${operator.and(true,operator.loop)}")
    println(s"${operator.or(true,false)}")
 }
}