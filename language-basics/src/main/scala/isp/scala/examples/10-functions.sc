val integers = Seq(1, 3, 3, 4, 5)

//def function_name[type_parameters](arguments)[(arguments)] [:return_type]
def foo(x: Int) = {
  x * 10
}

foo(2)

def bar[T](xs: Seq[T])(reducer: (T, T) => T): T = xs.reduce(reducer)

bar(integers)(_ * _)
bar(Seq("a", "B", "c", "ZZ"))(_ + _)



//anonymous function - assign a function into a variable
val intToString: Int => String = _.toString
//val intToString = _.toString //does not compile

intToString(123)


//function as a parameter
def transform[A, B](xs: Seq[A], transformation: A => B): Seq[B] = {
  xs map transformation
}

transform(integers, intToString)


//define a function inside another function
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
