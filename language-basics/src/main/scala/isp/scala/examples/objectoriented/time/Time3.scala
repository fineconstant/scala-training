package isp.scala.examples.objectoriented.time

class Time3 {

  private[this] var h = 12
  private[this] var m = 0

  def hour: Int = h

  def hour_=(x: Int) {
    require(0 <= x && x < 24, "must be between 0 and 24")
    h = x
  }

  def minute: Int = m

  def minute_=(x: Int) {
    require(0 <= x && x < 60, "must be between 0 and 60")
    m = x
  }

  override def toString = s"Time3($h, $m)"
}
