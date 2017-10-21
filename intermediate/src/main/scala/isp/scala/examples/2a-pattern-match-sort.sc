
// with pattern matching
def insertSort(xs: List[Int]): List[Int] = {
  def insert(x: Int, xs: List[Int]): List[Int] = {
    xs match {
      case List()  => List(x) // Nil
      case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys) // y is xs.head
    }
  }

  xs match {
    case List()    => Nil
    case x :: rest => insert(x, insertSort(rest))
  }
}

insertSort(List(5, 6, 0, 4, 2, 1, 7, 9))
