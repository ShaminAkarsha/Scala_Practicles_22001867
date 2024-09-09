// Implement the countLetterOccurrences function using the map and reduce methods.
object q105 extends App{
 def countLetterOccurrences(names: List[String]): Int = {
    val counts = names.map(_.length())
    counts.reduce((x, y) => x+y)
 }

 val names = List("apple", "banana", "cherry", "date")
 println(countLetterOccurrences(names))
}