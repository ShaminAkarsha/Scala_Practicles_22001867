/* 
The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, . .
. Each subsequent number is the sum of the previous two. Write a recursive
function print fist n Fibonacci numbers for given n
 */

object q53 extends App{
    def fibonacci(n: Int): Int = {
        if (n <= 1) n
        else fibonacci(n - 1) + fibonacci(n - 2)
    }

    def printFibonacciNumbers(n: Int): Unit = {
        for (i <- 0 until n) {
            print(s"${fibonacci(i)} ")
        }
        println()
    }

    printFibonacciNumbers(5)
}