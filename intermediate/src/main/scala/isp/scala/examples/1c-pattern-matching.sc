
val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

//declare variables and extract values form 'numbers'
val a :: b :: c :: rest = numbers

a
b
c
rest


//useful for 'head tail recursion'
def matchCollection(xs: List[Int]) = {
  xs match {
    case first :: second :: third :: _ => s"first: $first, second:$second, third: $third"
    case head :: tail                  => s"head: $head, tail: $tail"
    case Nil                           => s"empty"
  }
}

matchCollection(List(1, 2))
matchCollection(List(1, 2, 3))
matchCollection(List(1, 2, 3, 4, 5))
matchCollection(List())


val x :: y :: z = List(1, 2)
//x - first element
//y - second element
//z - is the rest


val i :: j :: k :: l = List(0, 1)
//i - first element
//j - second element
//k - third element (THERE IS NO THIRD ELEMENT!)
//l - is the rest
