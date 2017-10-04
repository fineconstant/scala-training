package isp.scala.practice

import isp.scala.practice.api.FlatSpecMatchers

class FunctionsSpec extends FlatSpecMatchers {

  // fixture
  // http://www.scalatest.org/user_guide/sharing_fixtures
  trait SampleFunctions {
    val plusFive: Int => Int = _ + 5
    val timesTen: Int => Int = _ * 10
    val minusTwo: Int => Int = _ - 2
  }

  "applyFunctions" should "apply _ * 100 and _ - 3 functions to each element" in {
    val actual = Functions.applyFunctions(_ * 100, x => x - 3)(Seq(1, 2, 3, 4, 5))

    val expected = Seq(97, 197, 297, 397, 497)

    actual should contain theSameElementsInOrderAs expected
  }

  it should "apply _ - 3 and _ * 100 functions to each element" in {
    val actual = Functions.applyFunctions(_ - 3, _ * 100)(Seq(1, 2, 3, 4, 5))

    val expected = Seq(-200, -100, 0, 100, 200)

    actual should contain theSameElementsInOrderAs expected
  }

  "composeFunctions" should "return a function that is composed of passed functions - h(g(f(a))) - result 148" in new SampleFunctions {
    val actualFunction: (Int) => Int = Functions.composeFunctions(plusFive, timesTen, minusTwo)

    val actual = actualFunction(10)

    val expected = 148

    actual shouldEqual expected
  }

  it should "return a function that is composed of passed functions - h(g(f(a))) - result " in new SampleFunctions {
    val actualFunction: (Int) => Int = Functions.composeFunctions(timesTen, minusTwo, plusFive)

    val actual = actualFunction(10)

    val expected = 103

    actual shouldEqual expected
  }
}
