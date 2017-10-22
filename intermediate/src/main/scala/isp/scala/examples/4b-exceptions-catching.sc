
import java.net.{MalformedURLException, URL}

import scala.io.Source
import scala.util.{Failure, Success, Try}


//classic style
try {
  new URL("some garbage")
}
catch {
  case e: MalformedURLException => s"Some error: ${e.getMessage}"
  case other: Exception         => other printStackTrace()
}


//functional style - Try type
//http://www.scala-lang.org/api/2.12.4/scala/util/Try.html
val parsed = Try(new URL("some garbage"))

parsed match {
  case Success(x)  => s"Result is: $x"
  case Failure(ex) => s"Some error: ${ex.getMessage}"
}

//Some advantages
def parseUrlWithDefault(x: String): URL =
  Try(new URL(x)) getOrElse new URL("https://google.com")

parseUrlWithDefault("https://www.ing.pl")
parseUrlWithDefault("some garbage")


//It supports all the higher-order methods you know from other types of collections
def parseUrl(x: String): Try[URL] = Try(new URL(x))

parseUrl("https://www.ing.pl:8080")
.map(url => (url.getProtocol, url.getPort))



//combined with for comprehension
def getURLContent(url: String): Try[Iterator[String]] =
  for {
    url <- parseUrl(url)
    connection <- Try(url.openConnection())
    is <- Try(connection.getInputStream)
    source = Source.fromInputStream(is)
  } yield source.getLines()

getURLContent("https://google.com")



//an alternative to getOrElse
getURLContent("garbage").recover {
  case _: MalformedURLException => Iterator("Please make sure to enter a valid URL")
  case _                        => Iterator("An unexpected error has occurred. We are so sorry!")
}
.map(_.mkString)
.foreach(println)


