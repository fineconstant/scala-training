package isp.scala.examples.objectoriented

import isp.scala.examples.objectoriented.rational.RationalImpl

object RationalExamples extends App {
  val x = new RationalImpl(2)
  val y = new RationalImpl(3, 4)

  println(s"x.add(y) = ${x.add(y)}")
  println(s"x.+(y) = ${x.+(y)}")
  println(s"x + y = ${x + y}")
  println(s"x + x * y = ${x + x * y}")
  println(s"x + (x * y) = ${x + (x * y)}")
  println(s"x / x = ${x / x}")

  //using companion object's apply factory method
  val a = RationalImpl(5)
  val b = RationalImpl(1, 3)
  println(s"a * b = ${a * b}")
}
