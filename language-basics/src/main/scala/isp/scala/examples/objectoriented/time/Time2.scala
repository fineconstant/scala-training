package isp.scala.examples.objectoriented.time

class Time2 {

  //private[scope] - accessible only by this particular instance
  private[this] var h = 12
  private[this] var m = 0

  //similar to .net property
  def hour: Int = h

  def hour_=(x: Int): Unit = {
    h = x
  }

  def minute: Int = m

  def minute_=(x: Int): Unit = {
    m = x
  }

  //private vs. private[this]
  //def copyFrom(other: Time2): Unit = {
  //  h = other.h
  //  m = other.m
  //}

  override def toString = s"Time2($h, $m)"
}
