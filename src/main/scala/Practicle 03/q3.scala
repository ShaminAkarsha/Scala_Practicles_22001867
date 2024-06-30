/* 
You are given two integers, num1 and num2. Write a function in Scala to determine the
arithmetic mean (average) of the two numbers, rounded to two decimal places. Return
the result as a floating-point number.
*/

object q33 extends App{
    def average(num1: Int, num2: Int) :Float = {
        ((num1 + num2)/2.00).toFloat
    }
    
    println(average(12,11))
}

