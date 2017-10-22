
trait Notification

case class Email(sender: String, title: String, body: String) extends Notification

case class SMS(caller: String, message: String) extends Notification

def createNotificationMsg(notification: Notification): String = {
  notification match {
    //not interested in email's body
    case Email(email, title, _) => s"Email from $email with title: $title"
    case SMS(number, message)   => s"SMS from $number! Message: $message"
  }
}

def extractMsg(notification: Notification): String = {
  notification match {
    //interested only in msgs
    case Email(_, _, body) => s"Email: $body"
    case SMS(_, message)   => s"SMS: $message"
  }
}

val someSms = SMS("123-456-789", "Are you there?")
val someEmail = Email("tom@email.com", "A 20% raise", "Just joking")

createNotificationMsg(someEmail)
createNotificationMsg(someSms)

extractMsg(someEmail)
extractMsg(someSms)

