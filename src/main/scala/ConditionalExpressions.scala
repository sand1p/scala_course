object  ConditionalExpressions {
  def main(args: Array[String]): Unit = {
    val x= -10
    println(s" -10 ${abs(x)}")
  }
  def abs(x: Int) = if (x >=0 ) x else -x
  /*
  boolean expressions are called as predicate
   if expression is
   short circuit evaluation
   rewrite rules
   if (b) e1 else e2
   if (!b) e2 else e1



   */
}
