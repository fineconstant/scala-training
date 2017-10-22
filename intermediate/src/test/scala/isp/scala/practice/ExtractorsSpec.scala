package isp.scala.practice

import isp.scala.practice.Extractors.{IntegerSquare, PhoneNumber, TimesTwo}
import isp.scala.practice.api.FlatSpecMatchers

class ExtractorsSpec extends FlatSpecMatchers {

  "Extractors IntegerSquare object" should "return a square of 4" in {
    val actual = Extractors.IntegerSquare(4)

    val expected = 16
    actual shouldEqual expected
  }

  it should "return a square of 5" in {
    val actual = Extractors.IntegerSquare(5)

    val expected = 25
    actual shouldEqual expected
  }

  it should "extract a square root of 49" in {
    val actual = 49 match {
      case IntegerSquare(x) => x
    }

    val expected = 7
    actual shouldEqual expected
  }

  it should "extract a square root of 81" in {
    val actual = 81 match {
      case IntegerSquare(x) => x
    }

    val expected = 9
    actual shouldEqual expected
  }

  "Extractors PhoneNumber object" should "format a phone number 123-123-123" in {
    val actual = Extractors.PhoneNumber(123, 123, 123)

    val expected = "123-123-123"
    actual shouldEqual expected
  }

  it should "format a phone number 111-111-111" in {
    val actual = Extractors.PhoneNumber(111, 111, 111)

    val expected = "111-111-111"
    actual shouldEqual expected
  }

  it should "extract phone number parts 111, 111, 111" in {
    val actual = "111-111-111" match {
      case PhoneNumber(a, b, c) => (a, b, c)
    }

    val expected = (111, 111, 111)
    actual shouldEqual expected
  }

  it should "extract phone number parts 333, 333, 333" in {
    val actual = "333-333-333" match {
      case PhoneNumber(a, b, c) => (a, b, c)
    }

    val expected = (333, 333, 333)
    actual shouldEqual expected
  }

  "Extractors TimesTwo object" should "multiply 10 by 2" in {
    val actual = Extractors.TimesTwo(10)

    val expected = 20
    actual shouldEqual expected
  }

  it should "multiply 3 by 2" in {
    val actual = Extractors.TimesTwo(3)

    val expected = 6
    actual shouldEqual expected
  }

  it should "extract the half of from the 5" in {
    val actual = 5D match {
      case TimesTwo(x) => x
    }

    val expected = 2.5
    actual shouldEqual expected
  }

  it should "extract the half of from the 3" in {
    val actual = 3D match {
      case TimesTwo(x) => x
    }

    val expected = 1.5
    actual shouldEqual expected
  }
}
