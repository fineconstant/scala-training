val numbers = Seq(5, 4, 3, 2, 1, 1, 0, 0, 0)

numbers.map(x => x * 10)

Seq(2, 1, 0, -1, -2) filter (_ > 0)

Seq(2, 1, 0, -1, -2) filterNot (_ > 0)

numbers.zipWithIndex

numbers.sorted

numbers.min

numbers.max

numbers.reverse

numbers.head

numbers.tail

numbers.contains(100)

numbers.mkString

numbers.mkString("-")

numbers.distinct

numbers.zip(numbers.map(_ * 100))

numbers.toSet

numbers.intersect(Seq(4, 5, 6, 7, 8, 9))

numbers.diff(Seq(4, 5, 6, 7, 8, 9))

//count even
numbers.count(x => (x & 1) == 0)

numbers.take(2)
numbers.takeRight(2)
numbers.takeWhile(x => x > 1)

numbers.drop(2)
numbers.dropRight(2)
numbers.dropWhile(x => x > 1)

//numbers.reduce(_ + _)
numbers.sum
//numbers.reduce(_ * _)
numbers.product

// val numbers = Seq(5, 4, 3, 2, 1, 1, 0, 0, 0)
numbers.reduceLeft((a: Int, b: Int) => {
  println(s"a = $a")
  println(s"b = $b")
  a + b
})

// val numbers = Seq(5, 4, 3, 2, 1, 1, 0, 0, 0)
numbers.reduceRight((a: Int, b: Int) => {
  println(s"a = $a")
  println(s"b = $b")
  a + b
})

// fold([start value]])([reduce function]
numbers.fold(500)(_ + _)

// val numbers = Seq(5, 4, 3, 2, 1, 1, 0, 0, 0)
numbers.foldLeft(500)((a: Int, b: Int) => {
  println(s"a = $a")
  println(s"b = $b")
  a + b
})
//same as
(500 /: numbers) (_ + _)

numbers.foldRight(500)(_ + _)
//same as
(numbers :\ 500) (_ + _)

numbers.groupBy((i: Int) => i)
