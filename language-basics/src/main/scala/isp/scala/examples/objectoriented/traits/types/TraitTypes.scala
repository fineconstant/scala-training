package isp.scala.examples.objectoriented.traits.types

trait X {
  def foo(s: String)
}

trait Y {
  def bar(i: Int)
}

class Z {
  def baz() {
    println("Hello, world!")
  }
}

class A {
  def bazFooBar(xyz: Z with X with Y) {
    xyz.foo("hello")
    xyz.bar(42)
    xyz.baz()
  }
}
