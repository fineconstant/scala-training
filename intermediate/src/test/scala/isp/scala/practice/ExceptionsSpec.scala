package isp.scala.practice

import isp.scala.practice.api.FlatSpecMatchers

class ExceptionsSpec extends FlatSpecMatchers {

  trait ExceptionFunctions {
    def canThrowException(x: Int): Int = if (x < 0) throw new IllegalArgumentException("x is less than 0 (x < 0)") else x
  }

  "throwException" should "throw an IllegalArgumentException with a proper message for an Int argument" in {
    val thrown = the[IllegalArgumentException] thrownBy Exceptions.throwException(123)

    val expectedMessage = "Wrong argument: Int(123)"

    thrown.getMessage shouldEqual expectedMessage
  }

  it should "throw an IllegalArgumentException with a proper message for a Double  argument" in {
    val thrown = the[IllegalArgumentException] thrownBy Exceptions.throwException(3.14)

    val expectedMessage = "Wrong argument: Double (3.14)"

    thrown.getMessage shouldEqual expectedMessage
  }


  it should "should return exactly the same String argument with no exceptions thrown" in {
    val actual = Exceptions.throwException("Some String argument")

    val expected = "Some String argument"

    actual shouldEqual expected
  }


  "catchException" should "extract and return only the exception message" in {
    val expectedMessage = "Everything is ok!"

    def throwsException(): String = throw new IllegalStateException(expectedMessage)

    val actualMessage = Exceptions.catchException(throwsException())

    actualMessage shouldEqual expectedMessage
  }

  "timeTen" should "multiply the value returned by passed function (5) by ten" in new ExceptionFunctions {
    val actual = Exceptions.timesTen(canThrowException(5))

    val expected = 50

    actual shouldEqual expected
  }

  "timeTen" should "multiply the value returned by passed function (50) by ten" in new ExceptionFunctions {
    val actual = Exceptions.timesTen(canThrowException(50))

    val expected = 500

    actual shouldEqual expected
  }

  it should "provide with default (0) when exception for -10 is thrown" in new ExceptionFunctions {
    val actual = Exceptions.timesTen(canThrowException(-10))

    val expected = 0

    actual shouldEqual expected
  }

  it should "provide with default (0) when exception for -1 is thrown" in new ExceptionFunctions {
    val actual = Exceptions.timesTen(canThrowException(-1))

    val expected = 0

    actual shouldEqual expected
  }

  "safelyTransform" should "apply both functions to the each element of the collection an filter out fails for (-3 to 3)" in new ExceptionFunctions {
    val numbers = (-3 to 3) toList

    val actual = Exceptions.safelyTransform(numbers)(canThrowException, (x: Int) => x + 100)

    val expected = List(100, 101, 102, 103)
    actual shouldEqual expected
  }

  it should "apply both functions to the each element of the collection an filter out fails for (-100 to -1)" in new ExceptionFunctions {
    val numbers = (-100 to -1) toList

    val actual = Exceptions.safelyTransform(numbers)(canThrowException, (x: Int) => x + 100)

    val expected = List()
    actual shouldEqual expected
  }

  it should "apply both functions to the each element of the collection an filter out fails for (5 to 10)" in new ExceptionFunctions {
    val numbers = (5 to 10) toList

    val actual = Exceptions.safelyTransform(numbers)(canThrowException, (x: Int) => x + 100)

    val expected = List(105, 106, 107, 108, 109, 110)
    actual shouldEqual expected
  }

}
