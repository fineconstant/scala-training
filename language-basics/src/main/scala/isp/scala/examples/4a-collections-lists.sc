/** List */
//list of type String
//create list
val fruits = List("apple", "orange", "banana", "grape")
val others = "bread" :: "tea" :: "juice" :: Nil

//concatenate two lists
val shoppingBasket = fruits ::: others

//filter list
val onlyJuice = shoppingBasket.filter(item => item == "juice")

//add a single element at the end
val juiceAndYogurt = onlyJuice :+ "yogurt"
//add a single element at the beginning
"shaving cream" +: juiceAndYogurt
"shaving cream" :: juiceAndYogurt //the same

//an empty collection
val empty: List[Int] = Nil
val anotherEmpty = List()
