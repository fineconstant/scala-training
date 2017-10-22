package isp.scala.practice

import isp.scala.practice.model.{BasicUser, PremiumUser, User}

object PatternMatching {

  /**
    * Use pattern matching to map string representation of a number (word) into the number.
    * Provide a default value of Int.MaxValue
    */
  def matchString(str: String): Int = {
    ???
  }

  /**
    * Calculate the sum of all the integers inside collection.
    * USE ONLY PATTERN MATCHING AND RECURSION!
    *
    * hint: 'cons' notation
    *
    * @return a sum of all integers inside numbers collection
    */
  def sumIntegerCollection(numbers: List[Int]): Int = {
    ???
  }

  /**
    * Generate personalized greeting for Basic and Premium user type
    *
    * USE ONLY PATTERN MATCHING!
    *
    * @return Personalized greeting message
    */
  def personalizedGreeting(user: User): String = {
    ???
  }

  /**
    * Every third basic user should get a premium account
    * Eg. basic, basic, basic gets premium, basic, basic, basic gets premium
    *
    * Premium users do not get premium
    *
    * hint: pattern matching, zipWithIndex and personalizedGreeting
    *
    * @return Vector of greetings for each user
    */
  def freePremiumForThirdUser(users: Vector[User]): Vector[String] = {
    ???
  }

}
