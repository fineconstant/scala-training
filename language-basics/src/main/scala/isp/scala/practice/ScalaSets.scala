package isp.scala.practice

/**
  * Documentation: http://www.scala-lang.org/api/2.12.3/scala/collection/immutable/Set.html
  */
object ScalaSets {

  /**
    * @param elem an item to be added
    * @return "xs" set with additional "elem" added
    */
  def addElem[T](xs: Set[T], elem: T): Set[T] = xs + elem

  /**
    * @param xs a list to convert
    * @return converts a list into a set
    */
  def listToSeq[T](xs: List[T]): Set[T] = xs toSet

}
