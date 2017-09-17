
/** Map */
//key - value store (dictionary)
val people = Map("John" -> 15, "Anna" -> 20, "John" -> 0, "Robert" -> 100)
people("John")
people("Robert")

people.getOrElse("robert", Int.MaxValue)
//people("robert") //Error: no key found


//only keys
people.keys

//only values
people.values
