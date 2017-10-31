package isp.scala.kata.leapyear

import org.scalatest.{FlatSpec, Matchers}


class LeapYearSpec extends FlatSpec with Matchers {

  "check" should "say that 2001 is common year" in {
    val actual = LeapYear.check(2001)

    val expected = false

    actual shouldEqual expected
  }

  it should "say that 1996 is leap year" in {
    val actual = LeapYear.check(1996)

    val expected = true

    actual shouldEqual expected
  }



  it should "say that 1900 is common year" in {
    val actual = LeapYear.check(1900)

    val expected = false

    actual shouldEqual expected
  }


  it should "say that 2000 is common year" in {
    val actual = LeapYear.check(2000)

    val expected = true

    actual shouldEqual expected
  }



}
