import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzSpec extends FlatSpec with Matchers {
  "apply" should "return 1 for 1" in {
    val actual: String = FizzBuzz(1)

    val expected = "1"

    actual shouldBe expected
  }

  it should "return Fizz for 3" in {
    val actual : String = FizzBuzz(3)
    val expected = "Fizz"
    actual shouldBe expected
  }


  it should "return Buzz for 5" in {
    val actual : String = FizzBuzz(5)
    val expected = "Buzz"
    actual shouldBe expected
  }

  it should "return Buzz for 4" in {
    val actual : String = FizzBuzz(4)
    val expected = "4"
    actual shouldBe expected
  }

  it should "return FizzBuzz for 15" in {
    val actual : String = FizzBuzz(15)
    val expected = "FizzBuzz"
    actual shouldBe expected
  }

  it should "return Fizz for 9" in {
    val actual : String = FizzBuzz(9)
    val expected = "Fizz"
    actual shouldBe expected
  }
}
