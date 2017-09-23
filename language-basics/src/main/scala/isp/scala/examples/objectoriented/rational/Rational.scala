package isp.scala.examples.objectoriented.rational

trait Rational {
  val numerator: Int
  val denominator: Int

  def lessThan(that: Rational): Boolean

  def add(that: Rational): Rational

  def +(that: Rational): Rational = add(that)

  def +(i: Int): Rational

  def -(that: Rational): Rational

  def -(i: Int): Rational

  def *(that: Rational): Rational

  def *(i: Int): Rational

  def /(that: Rational): Rational

  def /(i: Int): Rational

  def max(that: Rational): Rational = if (this.lessThan(that)) that else this
}
