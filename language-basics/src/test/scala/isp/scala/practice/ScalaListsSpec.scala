package isp.scala.practice

import org.scalatest.{FlatSpec, Matchers}

class ScalaListsSpec extends FlatSpec with Matchers {

  "createList" should "return a list of Integers" in {
    val actual = ScalaLists.createList()

    actual shouldBe a[List[Int]]
  }

  it should "contain 5, 50 and 500" in {
    val actual = ScalaLists.createList()

    val expected = Seq(5, 50, 500)

    actual should contain allElementsOf expected
  }

  "createListFrom" should "create list from passed elements: 20.0, 3.14, 360.0" in {
    val actual = ScalaLists.createListFrom(20.0, 3.14, 360.0)

    val expected = Seq(20.0, 3.14, 360.0)

    actual should contain allElementsOf expected
  }

  it should "create list from passed elements: 0.0, 1.0, 2.0" in {
    val actual = ScalaLists.createListFrom(0.0, 1.0, 2.0)

    val expected = Seq(0.0, 1.0, 2.0)

    actual should contain allElementsOf expected
  }

  "prependToList" should "prepend value 10" in {
    val actual = ScalaLists.prependToList(List(1, 2, 3), 10)

    val expected = Seq(10, 1, 2, 3)

    actual should contain theSameElementsInOrderAs expected
  }

  it should "prepend value 100" in {
    val actual = ScalaLists.prependToList(List(20, 30, 40), 100)

    val expected = Seq(100, 20, 30, 40)

    actual should contain theSameElementsInOrderAs expected
  }

  "appendToList" should "append value 10" in {
    val actual = ScalaLists.appendToList(List(1, 2, 3), 10)

    val expected = Seq(1, 2, 3, 10)

    actual should contain theSameElementsInOrderAs expected
  }

  it should "append value 100" in {
    val actual = ScalaLists.appendToList(List(20, 30, 40), 100)

    val expected = Seq(20, 30, 40, 100)

    actual should contain theSameElementsInOrderAs expected
  }

  "concatenateLists" should "merge two lists: [1, 2, 3] and [5, 6]" in {
    val actual = ScalaLists.concatenateLists(List(1, 2, 3), List(5, 6))

    val expected = Seq(1, 2, 3, 5, 6)

    actual should contain theSameElementsInOrderAs expected
  }

  it should "merge two lists: [100] and [5,10]" in {
    val actual = ScalaLists.concatenateLists(List(100), List(5, 10))

    val expected = Seq(100, 5, 10)

    actual should contain theSameElementsInOrderAs expected
  }

  "aggregateLists" should "aggregate two lists: [1, 2, 3], [5, 6] and [7, 9]" in {
    val actual = ScalaLists.aggregateLists(List(1, 2, 3), List(5, 6), List(7, 8))

    val expected = List(List(1, 2, 3), List(5, 6), List(7, 8))

    actual should contain theSameElementsInOrderAs expected
  }

  it should "merge two lists: [1], [2] and [3]" in {
    val actual = ScalaLists.aggregateLists(List(1), List(2),List(3))

    val expected = List(List(1), List(2),List(3))

    actual should contain theSameElementsInOrderAs expected
  }
}
