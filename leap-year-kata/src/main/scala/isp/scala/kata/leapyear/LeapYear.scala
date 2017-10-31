package isp.scala.kata.leapyear

object LeapYear {
  def check(year: Int) = {
    if (year % 400 == 0) true
    else if (year % 4 == 0 && year % 100 != 0) true
    else false
  }
}
