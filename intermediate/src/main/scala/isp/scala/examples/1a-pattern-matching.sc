import scala.util.Random

val x: Int = Random.nextInt(10)

//similar to 'switch case from Java or C#

x match {
  case 0 => "zero"
  case 1 => "one"
  case 2 => "two"
  case 3 => "three"
  case 4 => "four"
  case _ => "many"
}
