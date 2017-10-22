package isp.scala.practice

import isp.scala.practice.api.FlatSpecMatchers
import isp.scala.practice.model.CarPart

class CollectionsSpec extends FlatSpecMatchers {

  "concatenate" should "merge two empty lists" in {
    val empty = List.empty[Int]
    val actual = Collections.concatenate(empty, empty)

    val expected = empty

    actual shouldEqual expected
  }

  it should "merge one empty and non empty list" in {
    val actual = Collections.concatenate(List(), List(1, 2, 3))

    val expected = List(1, 2, 3)

    actual shouldEqual expected
  }

  it should "merge one non empty lists" in {
    val actual = Collections.concatenate(List("a", "b"), List("1", "2", "3"))

    val expected = List("a", "b", "1", "2", "3")

    actual shouldEqual expected
  }

  it should "same as ::: operator" in {
    val actual = Collections.concatenate(List("a", "b"), List("1", "2", "3"))

    val expected = List("a", "b") ::: List("1", "2", "3")

    actual shouldEqual expected
  }

  "reverse" should "reverse an empty list of integers" in {
    val actual = Collections.reverse(List.empty[Int])

    val expected = Nil
    actual shouldEqual expected
  }

  it should "reverse a list of integers (-100 to 100)" in {
    val numbers = (-100 to 100).toList
    val actual = Collections.reverse(numbers)

    val expected = numbers.reverse
    actual shouldEqual expected
  }

  it should "reverse a list of integers (1 to 5)" in {
    val numbers = (1 to 5).toList
    val actual = Collections.reverse(numbers)

    val expected = numbers.reverse
    actual shouldEqual expected
  }

  "everySecondItem" should "assign an index (counting from 1) to each item and return only every second of them properly formatted (Strings)" in {
    val people = Vector("John", "Annie", "Robert", "Tom", "Will", "Bob")

    val actual = Collections.everySecondItem(people)

    val expected = Vector("2 - Annie", "4 - Tom", "6 - Bob")

    actual should contain theSameElementsInOrderAs expected
  }

  it should "assign an index (counting from 1) to each item and return only every second of them properly formatted (Integers)" in {
    val people = Vector(500, 600, 700, 800, 900, 1000)

    val actual = Collections.everySecondItem(people)

    val expected = Vector("2 - 600", "4 - 800", "6 - 1000")

    actual should contain theSameElementsInOrderAs expected
  }

  "collectionToString" should "convert a collection if Integers into one string and separate each element with '|'" in {
    val actual = Collections.collectionToString(Vector(1, 2, 3, 4, 5), "|")

    val expected = "1|2|3|4|5"
    actual shouldEqual expected
  }

  it should "convert a collection if Integers into one string and separate each element with '<!>'" in {
    val actual = Collections.collectionToString(Vector("first", "second", "third"), "<!>")

    val expected = "first<!>second<!>third"
    actual shouldEqual expected
  }

  "commonPart" should "find a common part in Integer collections" in {
    val actual = Collections.commonPart((1 to 100).toList, (50 to 1000).toList)

    val expected = (50 to 100).toList
    actual shouldEqual expected
  }

  it should "find a no common part in String collections" in {
    val actual = Collections.commonPart(List("a", "b"), List("c", "d"))

    val expected = List()
    actual shouldEqual expected
  }

  "howManyStartsWith" should "count the number of elements that starts with 'ne'" in {
    val actual = Collections.howManyStartsWith(List("near", "neck", "navy", "negative", "nation"), "ne")

    val expected = 3
    actual shouldEqual expected
  }

  it should "count the number of elements that starts with 'a'" in {
    val actual = Collections.howManyStartsWith(List("a", "bab", "aa", "ay", "ca", "ac"), "a")

    val expected = 4
    actual shouldEqual expected
  }

  "whileHighQuality" should "should stop taking parts when their quality is less than 0.5" in {
    val parts = List(CarPart(100, 1), CarPart(100, .9), CarPart(10, .87), CarPart(100, .48), CarPart(60, .87), CarPart(100, 1),
                     CarPart(60, .87))
    val actual = Collections.whileHighQuality(parts)

    val expected = List(CarPart(100, 1), CarPart(100, .9), CarPart(10, .87))
    actual should contain theSameElementsInOrderAs expected
  }

  "partsByPrice" should "return a map that contains parts with same price for each key" in {
    val parts = List(CarPart(100, 1), CarPart(100, .9), CarPart(10, .87), CarPart(100, .48), CarPart(10, .87), CarPart(60, 1),
                     CarPart(60, .87))

    val actual = Collections.partsByPrice(parts)

    val expected = Set(100, 10, 60)
    actual should contain theSameElementsAs expected
  }

  it should "return a map that contains parts with same price for each key (empty collection)" in {
    val actual = Collections.partsByPrice(List.empty[CarPart])

    val expected = Set()
    actual should contain theSameElementsAs expected
  }

  "productWithSeed" should "return a product of all integers in collection and starting value of 100" in {
    val actual = Collections.productWithSeed(List(1, 2, 3, 4), 100)

    val expected = 2400

    actual shouldEqual expected
  }

  it should "return a product of all integers in collection and starting value of -10" in {
    val actual = Collections.productWithSeed(List(1, 2, 3, 4), -10)

    val expected = -240

    actual shouldEqual expected
  }

  "integersByParity" should "divide a collection of integers into two groups: odd and even (-100 to 100)" in {
    val numbers = (-100 to 100).toList

    val actual = Collections.integersByParity(numbers)

    val expected = Map("odd" -> (-99 to 99 by 2), "even" -> (-100 to 100 by 2))

    actual shouldEqual expected
  }

  it should "divide a collection of integers into two groups: odd and even (50 to 100)" in {
    val numbers = (50 to 100).toList

    val actual = Collections.integersByParity(numbers)

    val expected = Map("odd" -> (51 to 99 by 2), "even" -> (50 to 100 by 2))

    actual shouldEqual expected
  }
}
