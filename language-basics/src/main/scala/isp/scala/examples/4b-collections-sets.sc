
/** Set */
//set of integers
//set contains only unique values
val numbers = Set(1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7)
numbers.contains(7)
numbers.contains(100)

//same as
numbers(7)
numbers(100)

//add an element and check again
numbers + 100 contains 100


//convert List to Set
List(1, 1, 1, 2, 3, 4, 5) toSet
