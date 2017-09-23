package isp.scala.practice

import isp.scala.practice.api.FlatSpecMatchers

class FunctionsSpec extends FlatSpecMatchers {

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
}
