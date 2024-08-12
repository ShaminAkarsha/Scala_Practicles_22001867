/* Write a Scala function called filterEvenNumbers that takes a list of integers as input and uses a
lambda function to filter out the even numbers from the list. The function should return a new
list containing only the even numbers.
*/

object q71 extends App{

    val filterEvenNumbers = (numSet: List[Int]) => numSet.filter(n => n%2 != 0)

    val inputList = List(0,1,2,3,4,5,6,7,8,9,10,-1,-2,-3,-4)
    val outPutList = filterEvenNumbers(inputList)
    println(outPutList)

}

