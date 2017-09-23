package isp.scala.practice

object IfStatements {

  /**
    * @param x a number to check
    * @return true if a number is event, otherwise false
    */
  def isEven(x: Int): Boolean = x % 2 == 0

  /**
    * @param a first number
    * @param b second number
    * @return the highest of the two numbers
    */
  def greatest(a: Int, b: Int): Int = if (a > b) a else b

  /**
    * @return compares the two number and return -1 if the first one is smaller, 0 if they are equal, 1 if the second is smaller
    */
  def compare(a: Int, b: Int): Int = {
    if (a > b) 1
    else if (a == b) 0
    else -1
  }

}
