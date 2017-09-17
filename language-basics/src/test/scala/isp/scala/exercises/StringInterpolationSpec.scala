package isp.scala.exercises

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

}
