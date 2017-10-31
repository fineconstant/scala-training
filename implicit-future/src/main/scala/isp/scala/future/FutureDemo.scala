package isp.scala.future

import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}


object FutureDemo extends App {
  implicit val ec = ExecutionContext.global

  val f: Future[Double] = Future {
    Thread.sleep(500)
    10.0 / 3.0
  }

  f.map(_ * 100)
  .onComplete {
    case Success(x) => println(x)
    case Failure(e) => println(e.getMessage)
  }



  val future30 = Future {
    Thread.sleep(600)
    30
  }

  val future2 = Future {
    Thread.sleep(300)
    2
  }


  val result = for {
    x <- future30
    y <- future2
  } yield x / y

  result.foreach(println)

  Thread.sleep(2000)

}
