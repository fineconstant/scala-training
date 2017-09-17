package isp.scala.exercises

import org.scalatest.{FlatSpec, Matchers}

class ScalaMapsSpec extends FlatSpec with Matchers {

  // fixture
  // http://www.scalatest.org/user_guide/sharing_fixtures
  trait SampleMap {
    val sampleMap = Map("key1" -> 100, "key2" -> 200, "key3" -> 300)
  }

  "createMap" should "return a map with passed key and value ['apple', 100]" in {
    val actual = ScalaMaps.createMap("apple", 100)

    val expected = "apple" -> 100

    actual should contain(expected)
  }

  it should "return a map with passed key and value ['pear', 50]" in {
    val actual = ScalaMaps.createMap("pear", 50)

    val expected = ("pear", 50)

    actual should contain(expected)
  }

  "getValue" should "return a value that corresponds to a key 'key1'" in new SampleMap {
    val actual = ScalaMaps.getValue(sampleMap, "key1")

    val expected = 100

    actual shouldEqual expected
  }

  it should "return a value that corresponds to a key 'key3'" in new SampleMap {
    val actual = ScalaMaps.getValue(sampleMap, "key3")

    val expected = 300

    actual shouldEqual expected
  }

  "getKeys" should "return a collection of keys from the given map" in new SampleMap {
    val actual = ScalaMaps.getKeys(sampleMap)

    val expected = Seq("key1", "key2", "key3")

    actual should contain allElementsOf expected
  }

}
