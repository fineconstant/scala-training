
object FizzBuzz {

  def apply(x: Int): String = {
    var result = ""
    if (x % 3 == 0)
      result += "Fizz"
    if (x % 5 == 0)
      result += "Buzz"
    if (result.isEmpty)result += x.toString

    result
  }
}
