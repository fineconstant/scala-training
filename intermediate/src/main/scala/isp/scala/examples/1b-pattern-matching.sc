
//def matchStringNumber(x:String) = { x match {
//same as
def matchStringNumber: String => Int = {
  case "one"     => 1
  case "two"     => 2
  case _: String => Integer.MAX_VALUE //everything else of type String
}

matchStringNumber("one")
matchStringNumber("two")
matchStringNumber("TWO")
matchStringNumber("sth other")


def matchType(x: AnyVal) = {
  x match {
    case _: Int               => "an Integer"   //not interested in a value
    case d: Double            => s"a Double $d" //interested in a value
    case f: Float if f > 0.5F => s"a Float $f"
    //scala.MatchError: 0.25 (of class java.lang.Float)
    //case sth => s"Sth else: $sth"
  }
}

matchType(100)
matchType(1.5)
matchType(0.75F)
matchType(0.25F)
