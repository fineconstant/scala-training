package isp.scala.practice

import isp.scala.practice.model.CarPart

object Collections {

  /**
    * Concatenate xs and ys collections (the same operation as :::)
    * HOWEVER, DO NOT USE ':::' OPERATOR!
    *
    * hint: 'cons', pattern matching, recursion
    */
  def concatenate[T](xs: List[T], ys: List[T]): List[T] = {
    xs match {
      case Nil        => ys
      case x :: xRest => x :: concatenate(xRest, ys)
    }
  }

  /**
    * Reverse a collection of integers.
    * DO NOT USE '.reverse' METHOD!
    *
    * hint: 'cons', folding
    */
  def reverse(xs: List[Int]): List[Int] = {
    xs.foldLeft(List.empty[Int])((a, b) => b :: a)
    //(List.empty[Int] /: xs) ((a, b) => b :: a) //alternative syntax for foldLeft
  }

  /**
    * Function should only return every second item from the collections.
    * These items should be strings formatted as in ([index] - [item])
    * Index should start from 1
    */
  def everySecondItem[T](xs: Vector[T]): Vector[String] = {
    xs.zipWithIndex
    .map { case (item, idx) => (item, idx + 1) }
    .filter(_._2 % 2 == 0)
    .map { case (item, idx) => s"$idx - $item" }
  }

  /**
    * 'Reduce' the collection to a single list where each element is separated by the passed separator
    */
  def collectionToString[T](xs: Vector[T], separator: String): String = xs.mkString(separator)

  /**
    * Return a collection with only elements that are in bots xs an ys collection
    */
  def commonPart[T](xs: List[T], ys: List[T]): List[T] = xs.intersect(ys)

  /**
    * Return the number of string that starts with the passed prefix
    *
    * DO NOT USE '.filter' METHOD!
    */
  def howManyStartsWith(xs: List[String], prefix: String): Int = xs.count(_.startsWith(prefix))

  /**
    * Return a list of car parts but stop taking elements when their quality is less than 0.5
    *
    * hint: do not filter
    */
  def whileHighQuality(parts: List[CarPart]): List[CarPart] = parts.takeWhile(_.quality > .5)

  /**
    * Return a collection of different car prices, no duplicates
    */
  def partsByPrice(parts: List[CarPart]): Set[Int] = parts.groupBy(_.price).keySet

  /**
    * Return product of collection item - every item of the collection multiplied by another (also with seed)
    */
  def productWithSeed(xs: List[Int], seed: Int): Int = xs.fold(seed)(_ * _)

  /**
    * Divide a collection of integers into two groups: odd and even with keys: 'odd' and 'even'
    *
    * DO NOT USE '.filter' METHOD!
    *
    * hint: grouping, mapping
    */
  def integersByParity(xs: List[Int]): Map[String, List[Int]] = {
    xs.groupBy(x => x & 1)
    .map {
      case (1, items) => ("odd", items)
      case (0, items) => ("even", items)
    }
  }

}
