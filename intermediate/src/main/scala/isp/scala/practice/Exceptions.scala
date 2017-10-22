package isp.scala.practice

import scala.util.{Failure, Try}

object Exceptions {

  /**
    * Throw an IllegalArgumentException with a proper messages for Int and Double.
    *
    * Let String pass through.
    */
  def throwException(arg: Any): String = {
    ???
  }

  /**
    * Execute the 'throwsException' method, catch the exception and return the message
    *
    * @param throwsException method that throws IllegalStateException
    */
  def catchException(throwsException: => String): String = {
    throwsException
    ???
  }

  /**
    * Multiply the value returned by passed dataSource by ten or else provide with the default (0)
    *
    * @param dataSource function that may return Int or throw an exception
    */
  def timesTen(dataSource: => Int): Int = {
    ???
  }

  /**
    * Apply both argument functions to every item on the collection.
    * Be careful - 'mayFailFunction sometimes throws an exception, filter out these and only then apply the second functions.
    *
    * @param numbers         a collection of integers
    * @param mayFailFunction this function may throw an exception
    * @param safeFunction    this function is always safe
    */
  def safelyTransform(numbers: List[Int])(mayFailFunction: Int => Int, safeFunction: Int => Int): List[Int] = {
    ???
  }
}
