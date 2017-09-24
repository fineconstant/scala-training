val integers = Seq(1, 3, 3, 4, 5)

/** def function_name[type_parameters](arguments)[(arguments)] [:return_type] */
def timesTen(x: Int) = {
  x * 10
}

timesTen(2)

def reduceCollection[T](xs: Seq[T])(reducer: (T, T) => T): T = xs.reduce(reducer)

reduceCollection(integers)(_ * _)
reduceCollection(Seq("a", "B", "c", "ZZ"))(_ + _)



/** anonymous function - assign a function into a variable */
val intToString: Int => String = _.toString
//val intToString = _.toString //does not compile

intToString(123)

val toIntList: (Int, Int, Int, Int) => List[Int] = List(_, _, _, _)
//val toList: (Int, Int, Int, Int) => List[Int] = List(_, _, _, _, _) //does not compile

toIntList(5, 4, 3, 2)

val toStringList = (a: String, b: String, c: String) => List(a, b, c)

toStringList("orange", "apple", "grape")


/** function as a parameter */
def transform[A, B](xs: Seq[A], transformation: A => B): Seq[B] = {
  xs map transformation
}

transform(integers, intToString)


/** define a function inside another function */
def multiplyCollections(xs: Seq[Int], multipliers: Seq[Int]) = {
  def multiply(multiplier: Int) = {
    for {x <- xs
         y = x * multiplier}
      yield y
  }

  for {mul <- multipliers
       y = multiply(mul)}
    yield y
}

multiplyCollections(integers, Seq(1, 10, 100))
