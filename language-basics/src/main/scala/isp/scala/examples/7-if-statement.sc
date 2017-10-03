
// if (condition) { expression } else { expression }

if (true) {
  "value is true"
}


val animal = "zebra"
if ((animal startsWith "z") && (animal endsWith "a"))
  "definitely a zebra"
else "not a zebra"

// value of the expression is always returned
val x = 7
val y = if (x > 0) "positive" else "negative"


def foo = {
  println("foo")
  true
}

def bar = {
  println("bar")
  false
}

def baz = {
  println("baz")
  true
}

if (foo && bar && baz) true else false

if (bar || foo || baz) true else false
