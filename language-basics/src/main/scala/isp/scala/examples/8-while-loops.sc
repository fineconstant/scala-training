
/**
  * Avoid while loops, for they are considered as "code - smells" in a functional world
  * and they are signs of a mutability
  */

// while(condition) {statement}

/**
  * In order to terminate the loop we need to change the condition to false
  */
var a = 0
while (a < 5) {
  println(a)
  a += 1 // a = a +1
}

var b = 10
do {
  println(b * 10)
  b -= 2
} while (b > 0)

/** AVOID WHILE AND DO-WHILE LOOPS */
