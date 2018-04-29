object QuickSort {
  def main(args: Array[String]): Unit = {
    val array= Array(1,2,3,4,5,6)
    println(s"Before sorting:")
    array.foreach{ x => println(x)}
    sort(array)
    println(s"after sorting:")
    array.foreach{ x => println(x)}
  }
  def sort(xs: Array[Int]) {
    def swap(i: Int, j: Int) {
      val t = xs(i); xs(i) = xs(j); xs(j) = t
    }
    def sort1(l: Int, r: Int) {
      val pivot = xs((l + r) / 2)
      var i = l; var j = r
      while (i <= j) {
        while (xs(i) < pivot) i += 1
        while (xs(j) > pivot) j = 1
        if (i <= j) {
          swap(i, j)
          i += 1
          j = 1
        }
      }
      if (l < j) sort1(l, j)
      if (j < r) sort1(i, r)
    }
    sort1(0, xs.length - 1)
  }
  //println(s"After sorting: $array ")
}