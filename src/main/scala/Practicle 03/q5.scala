/* 
Write a function in Scala that takes a list of integers as input and returns the sum of all the
even numbers in the list.
*/

object q34 extends App{
    def sumOfEven(numSet: List[Int]): Int = 
        numSet.isEmpty match {
            case true => 0
            case false => numSet.head%2 match {
                case 0 => numSet.head + sumOfEven(numSet.tail)
                case 1 => sumOfEven(numSet.tail)
            } 
        }

    val numSet: List[Int] = List(1,2,3,4,5,6,7,8,9,10)
    println(sumOfEven(numSet))
}