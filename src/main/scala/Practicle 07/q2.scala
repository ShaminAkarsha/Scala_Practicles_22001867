/* Write a Scala function called calculateSquare that takes a list of integers as input and uses a
lambda function to calculate the square of each number in the list. The function should return a
new list containing the squares of the input numbers in the same order
*/
object q72 extends App{

    val calculateSquare = (numSet: List[Int]) => numSet.map(n => n*n)

    val inputList = List(1,2,3,4,5)
    val outPutList = calculateSquare(inputList)
    println(outPutList)

}