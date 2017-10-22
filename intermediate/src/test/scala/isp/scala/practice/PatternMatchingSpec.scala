package isp.scala.practice

import isp.scala.practice.api.FlatSpecMatchers
import isp.scala.practice.model.{BasicUser, PremiumUser}

import scala.language.postfixOps

class PatternMatchingSpec extends FlatSpecMatchers {

  "matchString" should "map string 'one' to 1" in {
    val actual = PatternMatching.matchString("one")

    val expected = 1

    actual shouldEqual expected
  }

  it should "map string 'two' to 2" in {
    val actual = PatternMatching.matchString("two")

    val expected = 2

    actual shouldEqual expected
  }

  it should "map string 'three' to 2" in {
    val actual = PatternMatching.matchString("three")

    val expected = 3

    actual shouldEqual expected
  }

  it should "map every other value to Int.MinValue" in {
    val actualFour = PatternMatching.matchString("four")
    val actualEmpty = PatternMatching.matchString("")
    val actualGarbage = PatternMatching.matchString("garbage")

    val expected = Int.MinValue

    actualFour shouldEqual expected
    actualEmpty shouldEqual expected
    actualGarbage shouldEqual expected
  }

  "sumIntegerCollection" should "calculate a sum of all elements (1 to 10)" in {
    val numbers = 1 to 10 toList

    val actual = PatternMatching.sumIntegerCollection(numbers)

    val expected = (1 to 10).sum
    actual shouldEqual expected
  }

  it should "calculate a sum of all elements (-100 to 100)" in {
    val numbers = -100 to 100 toList

    val actual = PatternMatching.sumIntegerCollection(numbers)

    val expected = (-100 to 100).sum
    actual shouldEqual expected
  }

  it should "calculate a sum of all elements (0)" in {
    val numbers = List(0)

    val actual = PatternMatching.sumIntegerCollection(numbers)

    val expected = 0
    actual shouldEqual expected
  }

  "personalizedGreeting" should "should generate the greeting for a basic user" in {
    val basicUser = BasicUser("Tom", "Sawyer", 20, .6D)

    val actual = PatternMatching.personalizedGreeting(basicUser)

    val expected = "Hello Tom, glad to see you again!"
    actual shouldEqual expected
  }

  it should "should generate the greeting for a premium user" in {
    val basicUser = PremiumUser("John", "Doe", 45, 160)

    val actual = PatternMatching.personalizedGreeting(basicUser)

    val expected = "Welcome John, you have 160 premium points!"
    actual shouldEqual expected
  }


  "freePremiumForThirdUser" should "should give every third basic user a free premium account" in {
    val users = Vector(BasicUser("Tom", "Sawyer", 20, .6D),
                       BasicUser("Tom", "Sawyer", 20, .6D),
                       BasicUser("Tom", "Sawyer", 20, .6D),
                       BasicUser("Tom", "Sawyer", 20, .6D),
                       PremiumUser("John", "Doe", 45, 160),
                       PremiumUser("John", "Doe", 45, 160),
                       PremiumUser("John", "Doe", 45, 160))

    val actual = PatternMatching.freePremiumForThirdUser(users)

    val expected = Vector("Hello Tom, glad to see you again!",
                          "Hello Tom, glad to see you again!",
                          "Hello Tom, we're giving you a free premium account!",
                          "Hello Tom, glad to see you again!",
                          "Welcome John, you have 160 premium points!",
                          "Welcome John, you have 160 premium points!",
                          "Welcome John, you have 160 premium points!")

    actual should contain theSameElementsInOrderAs expected
  }
}
