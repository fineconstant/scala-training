package isp.scala.implicits

object ImplicitParamsDemo extends App {

  implicit val multiplier: Int = 2
  implicit val anotherMultiplier: String = "string value"

  def multiply(x: Int)(implicit y: Int) = x * y

  val y = multiply(10)(20)

  println(y)

  println(multiply(3))
  println(multiply(500))

}
