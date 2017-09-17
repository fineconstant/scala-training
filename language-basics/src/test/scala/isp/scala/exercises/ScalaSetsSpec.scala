package isp.scala.exercises

import org.scalatest.{FlatSpec, Matchers}

class ScalaSetsSpec extends FlatSpec with Matchers {

  "listToSeq" should "convert a list [1, 1, 5, 10, 10] to set" in {
    val actual = ScalaSets.listToSeq(List(1, 1, 5, 10, 10))

    val expected = Seq(1, 5, 10)

    actual should contain allElementsOf expected
  }

  it should "convert a list ['apple','apple','pear'] to set" in {
    val actual = ScalaSets.listToSeq(List("apple", "apple", "pear"))

    val expected = Seq("apple", "pear")

    actual should contain allElementsOf expected
  }

  "addElem" should "add 100 into set" in {
    val actual = ScalaSets.addElem(Set[Int](), 100)

    actual(100) shouldBe true
  }

  it should "add 1 into set" in {
    val actual = ScalaSets.addElem(Set(5, 6), 1)

    actual(1) shouldBe true
  }
}
