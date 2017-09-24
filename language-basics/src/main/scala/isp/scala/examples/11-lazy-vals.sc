/** Lazy vals */

class Foo {
  lazy val number = {
    println("Initializing")
    100
  }

}

val obj = new Foo

obj.number

obj.number
