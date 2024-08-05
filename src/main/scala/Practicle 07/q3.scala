/* Write a Scala function called filterPrime that takes a list of integers as input and uses a lambda
function to filter out the prime numbers from the list. The function should return a new list
containing only the prime numbers
 */
object q73 extends App{

    val filterPrime = (numSet: List[Int]) => {
        var primList: List[Int] = List()
        numSet.foreach(i => 
            if(i%2 == 0){
                primList = primList :+ i
            })
        primList
    }

    val inputList = List(1,2,3,4,5,6,7,8,9,10)
    val outPutList = filterPrime(inputList)
    println(outPutList)

}