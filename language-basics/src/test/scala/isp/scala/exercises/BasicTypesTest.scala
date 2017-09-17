package isp.scala.exercises

import org.scalatest.{FlatSpec, Matchers}

class BasicTypesTest extends FlatSpec with Matchers {

  "defineBoolean" should "return a boolean value of true" in {
    val actual = BasicTypes.defineBoolean()

    actual shouldBe true
  }

  "defineByte" should "return a byte value of 16" in {
    val actual = BasicTypes.defineByte()

    val expected = -16 toByte

    actual shouldEqual expected
  }

  "defineInteger" should "return an Int value of 42" in {
    val actual = BasicTypes.defineInteger()

    val expected = 42

    actual shouldEqual expected
  }

  "defineLong" should "return an Int value of 1 500 250" in {
    val actual = BasicTypes.defineLong()

    val expected = 1500250L

    actual shouldEqual expected
  }

  "defineFloat" should "return a Float value of 1.5" in {
    val actual = BasicTypes.defineFloat()

    val expected = 1.5 toFloat

    assert(actual == expected)
  }

  "defineDouble" should "return a Float value of 1" in {
    val actual = BasicTypes.defineDouble()

    val expected = 1.toDouble

    actual shouldEqual expected
  }
}
