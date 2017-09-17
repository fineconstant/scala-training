package isp.scala.practice

import org.scalatest.{FlatSpec, Matchers}

class IfStatementsSpec extends FlatSpec with Matchers {
  "isEven" should "be true for 2" in {
    val actual = IfStatements.isEven(2)

    actual shouldBe true
  }

  it should "be true for 2000" in {
    val actual = IfStatements.isEven(200)

    actual shouldBe true
  }

  it should "be false for 1" in {
    val actual = IfStatements.isEven(1)

    actual shouldBe false
  }

  "greatest" should "return a higher number (-100, 100) -> 100" in {
    val actual = IfStatements.greatest(-100, 100)

    val expected = 100

    actual shouldEqual expected
  }

  it should "return a higher number (10000, 0) -> 10000" in {
    val actual = IfStatements.greatest(10000, 0)

    val expected = 10000

    actual shouldEqual expected
  }

  "compare" should "should tell that the first number is bigger" in {
    val actual = IfStatements.compare(1, 0)

    val expected = 1

    actual shouldEqual expected
  }

  it should "should tell that the numbers are equal" in {
    val actual = IfStatements.compare(0, 0)

    val expected = 0

    actual shouldEqual expected
  }

  it should "should tell that the second number is bigger" in {
    val actual = IfStatements.compare(0, 1)

    val expected = -1

    actual shouldEqual expected
  }

}
