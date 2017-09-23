package isp.scala.practice

import scala.collection.immutable

object ForComprehension {

  /**
    * @param xs     collection with integer argument
    * @param factor multiplier
    * @return a new collection with values multiplied
    */
  def multiply(xs: Seq[Int], factor: Int): Seq[Int] = {
    ???
  }

  /**
    *
    * @param xs collection of string arguments
    * @param threshold
    * @return a new collection with strings that are longer than threshold upper cased
    */
  def longStringsToUpper(xs: Seq[String], threshold: Int): Seq[String] = {
    ???
  }

  /**
    * @param start   start of the range (inclusive)
    * @param end     end of the range (inclusive)
    * @param divisor (divisor to check
    * @return a range between start and end containing only integers that are divisible by the divisor
    */
  def rangeDivisibleBy(start: Int, end: Int)(divisor: Int): Seq[Int] = {
    ???
  }
}
