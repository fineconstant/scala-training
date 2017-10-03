
/** List */
//list of type String
//create list
val fruits = List("apple", "orange", "banana", "grape")
val others = "bread" :: "tea" :: "juice" :: Nil

//get an element
fruits(2)

//concatenate two lists
val shoppingBasket = fruits ::: others

//filter list
val onlyJuice = shoppingBasket.filter(item => item == "juice")

//add a single element at the end
val juiceAndYogurt = onlyJuice :+ "yogurt"
//add a single element at the beginning
"shaving cream" +: juiceAndYogurt
"shaving cream" :: juiceAndYogurt

List("shaving cream") +: juiceAndYogurt
List("shaving cream") :: juiceAndYogurt
List("shaving cream") ::: juiceAndYogurt


//an empty collection
val empty: List[Int] = Nil
val anotherEmpty = List()
val yetAnotherEmpty = List.empty[String]
