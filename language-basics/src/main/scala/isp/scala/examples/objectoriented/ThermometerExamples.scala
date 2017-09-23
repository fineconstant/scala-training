package isp.scala.examples.objectoriented

import isp.scala.examples.objectoriented.thermometer.Thermometer

object ThermometerExamples extends App {
  val thermometer = new Thermometer()

  thermometer.fahrenheit = 100
  println(s"thermometer.celsius = ${thermometer.celsius}")
  println(s"thermometer.fahrenheit = ${thermometer.fahrenheit}")

  thermometer.celsius = 100
  println(s"thermometer.celsius = ${thermometer.celsius}")
  println(s"thermometer.fahrenheit = ${thermometer.fahrenheit}")
}
