
/**
  * An extractor object is an object with an 'unapply' method.
  * 'apply' method is like a constructor which takes arguments and creates an object,
  * the 'unapply' takes an object and tries to give back the arguments.
  */

object EMail {
  def apply(user: String, domain: String): String = s"$user@$domain"

  def unapply(arg: String): Option[(String, String)] = arg.split("@") match {
    case Array(user, domain) => Some((user, domain))
    case _                   => None
  }
}

EMail.apply("john.smith", "inbox.com")
EMail("john.smith", "inbox.com")
EMail.unapply("john.smith@inbox.com")


// returning 0 or 1 values
object Twice {
  // duplicate string
  def apply(x: String): String = x + x

  // from string that has both halves the same, take only one half
  def unapply(x: String): Option[String] = {
    val length = x.length / 2
    val half = x.substring(0, length)
    // if they are the same then return it
    if (half == x.substring(length)) Some(half)
    else None
  }
}

Twice("a")
Twice.unapply("123123")
Twice.unapply("ab")


//match only email address that user consists of 2 occurrences of same string in uppercase
def userTwice(x: String) = {
  x match {
    // "user" variable is bind to DI
    case EMail(Twice(user), domain) => s"match: $user in domain: $domain"
    case _                          => "no match"
  }
}
userTwice("AdamAdam@email.com")
userTwice("John@email.com")
