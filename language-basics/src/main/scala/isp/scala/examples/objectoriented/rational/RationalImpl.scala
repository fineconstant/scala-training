package isp.scala.examples.objectoriented.rational

/**
  * Class representing rational numbers (eg. 1, 3/4, numerator / denominator)
  *
  * @param n numerator
  * @param d denominator
  */
class RationalImpl(n: Int, d: Int) extends Rational {
  //constructor

  require(d != 0, "must not equal 0")

  //greatest common divisor
  private val g = gcd(n.abs, d.abs)

  val numerator: Int = n / g
  val denominator: Int = d / g

  //logging
  println(s"Created $this")

  //auxiliary constructor
  //all additional constructors must call another constructor (any other)
  def this(n: Int) = this(n, 1)

  override def add(that: Rational) = new RationalImpl(numerator * that.denominator + that.numerator * denominator,
                                                      denominator * that.denominator)

  override def +(i: Int) = new RationalImpl(numerator + i * denominator, denominator)

  override def -(that: Rational) = new RationalImpl(numerator * that.denominator - that.numerator * denominator,
                                                    denominator * that.denominator)

  override def -(i: Int) = new RationalImpl(numerator - i * denominator, denominator)

  override def *(that: Rational) = new RationalImpl(numerator * that.numerator, d * that.denominator)

  override def *(i: Int) = new RationalImpl(numerator * i, denominator)

  override def /(that: Rational) = new RationalImpl(numerator * that.denominator, denominator * that.numerator)

  override def /(i: Int) = new RationalImpl(numerator, denominator * i)

  override def toString: String = if (denominator == 1) numerator.toString else s"$numerator / $denominator"

  override def lessThan(that: Rational): Boolean = this.numerator * that.denominator < that.numerator * this.denominator

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}

//companion object
object RationalImpl {
  def apply(n: Int): RationalImpl = new RationalImpl(n)

  def apply(n: Int, d: Int): RationalImpl = new RationalImpl(n, d)
}
