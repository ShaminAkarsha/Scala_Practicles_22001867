import scala.io.StdIn.readInt
object q82 extends App {
  val mul3 = (num: Int) => num % 3 == 0
  val mul5 = (num: Int) => num % 5 == 0
  val mul3n5 = (num: Int) => num % 5 == 0 && num % 3 == 0

  def categorize(num: Int): Unit =
    num match {
      case num if (mul3n5(num)) => println("Multiple of Both Three and Five")
      case num if (mul3(num))   => println("Multiple of Three")
      case num if (mul5(num))   => println("Multiple of Five")
      case _                    => println("Not a Multiple of Three or Five")
    }
  var continue = true
  while (continue) {
    printf("Input an Intiger: ")
    val num = readInt()
    if (num == -1) {
      continue = false
    } else {
      categorize(num);
    }
  }

}
