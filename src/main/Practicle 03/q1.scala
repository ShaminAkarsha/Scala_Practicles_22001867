/* Write a function in Scala that takes a string as input and returns the reverse of the string
using a recursive approach. 
*/


object q31 extends App{
    // using the reverse function itself
    def reverseString1(text: String) = text.reverse

    //using a for loop
    def reverseString2(str: String): String = {
        var reversedStr = ""
        for(i <- str.length - 1 to 0 by -1){
            reversedStr += str(i)
        }
        reversedStr
    }

    //using recursions
    def reverseString3(str: String): String = {
        str match {
            case str if str.length == 0 => ""
            case _ => reverseString3(str.tail) + str.head
        }
    }
    

    println(reverseString1("123Scala"))
    println(reverseString2("1234Scala"))
    println(reverseString3("Scala"))
       
}
