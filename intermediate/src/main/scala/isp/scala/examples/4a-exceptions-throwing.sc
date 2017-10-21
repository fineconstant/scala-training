
case class MyInformativeException(message: String) extends Exception(message)

def throwsException(): Nothing = {
  throw MyInformativeException("Whoops! Sth wrong happened!")
}

val x: Nothing = throwsException()
