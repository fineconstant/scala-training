package isp.scala.practice

import isp.scala.practice.api.FlatSpecMatchers

class ForComprehensionSpec extends FlatSpecMatchers {

  trait SampleCollections {
    lazy val SampleIntegers = Seq(0, 1, 2, 3, 4, 5)
    lazy val SampleStrings = Seq("a", "aa", "aaa", "aaaa", "aaaaaa", "aaaaaaaa")
  }

  "multiply" should "multiply every item in the collection by 10" in new SampleCollections {
    val actual = ForComprehension.multiply(SampleIntegers, 10)

    val expected = Seq(0, 10, 20, 30, 40, 50)
    actual should contain theSameElementsInOrderAs expected
  }

  it should "multiply every item in the collection by -100" in new SampleCollections {
    val actual = ForComprehension.multiply(SampleIntegers, -100)

    val expected = Seq(0, -100, -200, -300, -400, -500)
    actual should contain theSameElementsInOrderAs expected
  }

  "longStringsToUpper" should "make string longer that 5 upper cased" in new SampleCollections {
    val actual = ForComprehension.longStringsToUpper(SampleStrings, 5)

    val expected = Seq("AAAAAA", "AAAAAAAA")
    actual should contain theSameElementsInOrderAs expected

  }

  it should "make string longer that 3 upper cased" in new SampleCollections {
    val actual = ForComprehension.longStringsToUpper(SampleStrings, 3)

    val expected = Seq("AAAA", "AAAAAA", "AAAAAAAA")
    actual should contain theSameElementsInOrderAs expected
  }

  "rangeDivisibleBy" should "return a collections of integers between 0 and 100 that are divisible by 2" in {
    val actual = ForComprehension.rangeDivisibleBy(0, 100)(2)

    val expectedSize = 51

    actual should have size expectedSize
    actual forall (x => x % 2 == 0) shouldBe true
  }

  it should "return a collections of integers between 256 and 1000000 that are divisible by 7" in {
    val actual = ForComprehension.rangeDivisibleBy(256, 1000000)(7)

    val expectedSize = 142821

    actual should have size expectedSize
    actual forall (x => x % 7 == 0) shouldBe true
  }
}
