package isp.scala.implicits

import scala.language.implicitConversions

object ImplicitConversion extends App {

  implicit def stringToInt(value: String): Int = Integer.valueOf(value)

  def timesTen(x: Int) = x * 10

  val y = timesTen("5")

  println(y)

}
