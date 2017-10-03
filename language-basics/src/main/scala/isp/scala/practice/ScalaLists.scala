package isp.scala.practice

/**
  * Documentation: http://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html
  */
object ScalaLists {

  /**
    * @return a List of Integers containing values 5, 50, 500
    */
  def createList(): List[Int] = {
    List(5, 50, 500)
  }

  /**
    * @return a list containing passed parameters
    */
  def createListFrom(a: Double, b: Double, c: Double): List[Double] = {
    //List(a, b, c)
    a :: b :: c :: Nil
  }

  /**
    * @param xs     element to prepend
    * @param number collection of Integers
    * @return an "xs" collection with the "number" as a first element
    */
  def prependToList(xs: List[Int], number: Int): List[Int] = {
    number +: xs
  }

  /**
    * @param xs     element to prepend
    * @param number collection of Integers
    * @return an "xs" collection with the "number" as a last element
    */
  def appendToList(xs: List[Int], number: Int): List[Int] = {
    xs :+ number
  }

  /**
    * @param xs first list
    * @param ys seconds list
    * @return a list that consists of first and second list
    */
  def concatenateLists(xs: List[Int], ys: List[Int]): List[Int] = {
    xs ::: ys
  }

  /**
    * @param xs some integer collection
    * @param ys some integer collection
    * @param zs some integer collection
    * @return a single collection containing all argument collections (not their elements)
    */
  def aggregateLists(xs: List[Int], ys: List[Int], zs: List[Int]): List[List[Int]] = {
    //List(xs) :+ ys :+ zs
    //xs +: ys +: List(zs)
    List(xs, ys, zs)
  }
}
