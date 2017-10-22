package isp.scala.practice.model

trait User {
  def firstName: String
  def lastName: String
  def age: Int
}

case class BasicUser(firstName: String, lastName: String, age: Int, upgradeProbability: Double) extends User

case class PremiumUser(firstName: String, lastName: String, age: Int, premiumPoints: Int) extends User
