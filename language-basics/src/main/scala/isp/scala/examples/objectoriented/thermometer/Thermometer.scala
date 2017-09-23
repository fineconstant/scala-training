package isp.scala.examples.objectoriented.thermometer

class Thermometer {

  var celsius: Float = _

  //getter
  def fahrenheit: Float = celsius * 9 / 5 + 32

  //setter
  def fahrenheit_=(f: Float) {
    celsius = (f - 32) * 5 / 9
  }

  override def toString: String = fahrenheit + "F/" + celsius + "C"
}
