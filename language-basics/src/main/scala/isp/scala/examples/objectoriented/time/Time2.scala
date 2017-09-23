package isp.scala.examples.objectoriented.time

class Time2 {

  private[this] var h = 12
  private[this] var m = 0

  def hour: Int = h

  def hour_=(x: Int): Unit = {
    h = x
  }

  def minute: Int = m

  def minute_=(x: Int): Unit ={
    m = x
  }

  override def toString = s"Time2($h, $m)"
}
