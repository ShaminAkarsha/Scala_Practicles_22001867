/* 
Write a program in PatternMatching, takes the integer input from the command line. Based on the
input, write a code using match to print Negative/Zero is input when input is less than or equal to
0.Print Even number is given when input is even, and print Odd number is given when input is odd
*/

object q42 extends App{
    print("Input an Int value: ")
    var input = scala.io.StdIn.readInt()
    input match {
        case input if input <= 0 => println(s"Negative/Zero ${input}")
        case input if input%2 == 0 => println(s"Even number is given ${input}")
        case input if input%2 == 1 =>println(s"Odd number is given ${input}")
    }
}