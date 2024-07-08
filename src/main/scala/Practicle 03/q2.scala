/*
Write a function in Scala that takes a list of strings as input and returns a new list
containing only the strings that have a length greater than 5 
*/
// In scala to make list List(type), should be same type, act as an linked list

object q32 extends App {
    def filter(strArr: List[String]):List[String] = {
        strArr.isEmpty match {
            case true => List()
            case false => strArr.head.length <= 5  match {
                case true => filter(strArr.tail)
                case false => strArr.head :: filter(strArr.tail) 
                // can use concat List,List or :: to add element to the linked list
            }  
        }
    }

    val nameList: List[String] = List("Alveen", "Elon", "MrTrumpet", "John")
    val lenthMoreThan5 = filter(nameList)
    println(lenthMoreThan5)
}