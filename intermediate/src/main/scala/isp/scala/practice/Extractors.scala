package isp.scala.practice

object Extractors {

  /**
    * Square extractor object
    */
  object IntegerSquare {
    /**
      * @return square of the number
      */
    def apply(x: Int): Int = x * x

    /**
      * @return square root of the number
      */
    def unapply(x: Int): Option[Int] = Option(Math.sqrt(x).toInt)
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
    def apply(a: Int, b: Int, c: Int): String = s"$a-$b-$c"

    /**
      * Parses a string representation of phone number into three int parts
      *
      * @return a tuple of three integers
      */
    def unapply(x: String): Option[(Int, Int, Int)] = x.split("-") match {
      case Array(a, b, c) => Option((a.toInt, b.toInt, c.toInt))
      case _              => None
    }
  }

  object TimesTwo {
    /**
      * Multiply x times 2
      */
    def apply(x: Double): Double = x * 2

    /**
      * return back the original value
      */
    def unapply(x: Double): Option[Double] = Option(x / 2)
  }

}
