package isp.scala.practice

object Extractors {

  /**
    * Square extractor object
    */
  object IntegerSquare {
    /**
      * @return square of the number
      */
    def apply(x: Int): Int = ???

    /**
      * @return square root of the number
      */
    def unapply(x: Int): Option[Int] = ???
  }

  /**
    * Phone number extractor object
    */
  object PhoneNumber {
    /**
      * Formats three integer numbers into phone number
      *
      * @return formatted phone number e.g. 790-100-100
      */
    def apply(a: Int, b: Int, c: Int): String = ???

    /**
      * Parses a string representation of phone number into three int parts
      *
      * @return a tuple of three integers
      */
    def unapply(x: String): Option[(Int, Int, Int)] = ???
  }

  object TimesTwo {
    /**
      * Multiply x times 2
      */
    def apply(x: Double): Double = ???

    /**
      * return back the original value
      */
    def unapply(x: Double): Option[Double] = ???
  }

}
