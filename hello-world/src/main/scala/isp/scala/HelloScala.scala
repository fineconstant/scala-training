package isp.scala               // package name

object HelloScala extends App {
  val greeting = "Hello"        // declare greeting value
  val y = "Scala"               // declare y value

  println(s"$greeting $y")      // prints "Hello Scala"

  println("Arguments:")         // prints "Arguments:"
  args foreach println          // prints every argument in a new line
}
