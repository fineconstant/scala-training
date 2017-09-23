package isp.scala.practice


object ForComprehension {

  /**
    * @param xs     collection with integer argument
    * @param factor multiplier
    * @return a new collection with values multiplied
    */
  def multiply(xs: Seq[Int], factor: Int): Seq[Int] = {
    //xs map (_ * factor)

    //xs.map(x => x * factor)

    //for {x <- xs
    //     multiplied = x * factor}
    //  yield multiplied

    for (x <- xs)
      yield x * factor
  }

  /**
    *
    * @param xs collection of string arguments
    * @param threshold
    * @return a new collection with strings that are longer than threshold upper cased
    */
  def longStringsToUpper(xs: Seq[String], threshold: Int): Seq[String] = {
    //xs filter (_.length > threshold) map (_.toUpperCase())

    for (x <- xs if x.length > threshold)
      yield x toUpperCase
  }

  /**
    * @param start   start of the range (inclusive)
    * @param end     end of the range (inclusive)
    * @param divisor (divisor to check
    * @return a range between start and end containing only integers that are divisible by the divisor
    */
  def rangeDivisibleBy(start: Int, end: Int)(divisor: Int): Seq[Int] = {
    //Range(start, end) filter (x => x % divisor == 0)

    for {x <- start to end if x % divisor == 0}
      yield x
  }
}
