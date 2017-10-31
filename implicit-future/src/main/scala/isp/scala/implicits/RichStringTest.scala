package isp.scala.implicits

/**
  * Implicit conversion
  */
object RichStringTest extends App {
  val x: String = "100"

  implicit class StringOpts(val s: String) {
    def plusOne(x: String): String = (Integer.valueOf(x) + 1).toString
  }

  val y = x.plusOne(x)

  println(y)
}
