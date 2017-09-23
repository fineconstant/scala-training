package isp.scala.practice

/**
  * Documentation: http://www.scala-lang.org/api/2.12.3/scala/collection/Map.html
  */
object ScalaMaps {

  /**
    * @return a Map containing the given key and value
    */
  def createMap(key: String, value: Int): Map[String, Int] = Map(key -> value)

  /**
    * @param dict a source Map
    * @param key  key to get a value for
    * @return a value from the "dict" that corresponds to the "key"
    */
  def getValue(dict: Map[String, Int], key: String): Int = dict(key)

  /**
    * @return a collections of keys from the given map
    */
  def getKeys(dict: Map[String, Int]): Seq[String] = dict.keys.toSeq
}
