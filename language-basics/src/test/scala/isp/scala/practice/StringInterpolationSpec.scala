package isp.scala.practice

import org.scalatest.{FlatSpec, Matchers}

class StringInterpolationSpec extends FlatSpec with Matchers {

  "apply method" should "return formatted string with values 100 and 'test'" in {
    val actual = StringInterpolation.apply(100, "test")

    val expected = "Int: 100, String: test"

    actual shouldEqual expected
  }

  it should "return formatted string with values 2048 and 'potatoes'" in {
    val actual = StringInterpolation(2048, "potatoes")

    val expected = "Int: 2048, String: potatoes"

    actual shouldEqual expected
  }

  "format method" should "format value 12345.12345 up to 4 decimal places" in {
    val actual = StringInterpolation.formatDouble(12345.12345D)

    val expected = "12345,1235"

    actual shouldEqual expected
  }

  it should "format value 1.55555 up to 4 decimal places" in {
    val actual = StringInterpolation.formatDouble(1.55555)

    val expected = "1,5556"

    actual shouldEqual expected
  }
}
