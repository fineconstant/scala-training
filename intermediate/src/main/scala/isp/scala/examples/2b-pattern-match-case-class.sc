
case class City(name: String)

case class Street(name: String, number: Int)

case class Address(city: City, street: Street)

val katowice = City("Katowice")
val kond = Street("Konduktorska", 35)

val address = Address(katowice, kond)


address match {
  case Address(city, Street(name, number)) => s"$name $number, ${city.name}"
}
