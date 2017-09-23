val items = Array("apple", "pear", "banana", "orange")

/*
Java or C#
for(int i = 0; i < items.lenght(); i++) {
  println(items(i))
}
*/

for (x <- items) {
  println(x)
}

// filter items for banana
val filtered = for {x <- items if x == "banana"}
  yield x

/** FOR NOW USE IT AS A FOR LOOP */
