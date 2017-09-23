package isp.scala.examples.objectoriented

import isp.scala.examples.objectoriented.time.{Time1, Time2, Time3}

object TimeExamples extends App {
  val time1 = new Time1
  time1.minute = 90
  println(s"time1 = $time1")

  val time2 = new Time2
  time2.minute = 90
  println(s"time2 = $time2")

  val time3 = new Time3
  //time3.minute = 90
  time3.minute = 35
  println(s"time3 = $time3")

}
