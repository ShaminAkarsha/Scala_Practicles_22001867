object Main extends App {
  
  // Defining a value
  val meaningOfLife: Int = 42 // Cons int meaningOfLife = 42;

  // Int, Boolean, Char, Double, Float, String
  val aBoolean = false // type is optional

  // string and string operations
  val aString = "I love Scala"
  val aComposedString = "I" + " " + "love" + "Scala"
  val anInterpolatedString = s"The meaning of life is $meaningOfLife"

  // expressions = structues that can be reduced to a value
  val anExpression = 2 + 3

  // if-expression
  val ifExpression = if (meaningOfLife > 43) 56 else 999 // in other languages: meaningOfLife > 43 ? 56 : 999
  val chainedIfExpression = 
    if (meaningOfLife > 43) 56
    else if (meaningOfLife < 0) -2
    else if (meaningOfLife > 999) 78
    else 0

  // Code block
  val aCodeBlock = {
    // definitions
    val aLocalValue = 67

    // value of block is the value of the last expression
    aLocalValue + 3
  }

  // defining a function
  def myFunction(x: Int, y:String): String = {
    y + " " + x
  } 

  // recursive function
  def factorial(n: Int): Int = 
    if (n <= 1) 1
    else n* factorial(n-1)
  // In scala we doont use loops or iterations, we use RECURTIONS

  // The Unit Type = no meaningful value === "Void" in other language
  // Type of side effects
  println("I love scala 2x") // system.out.println, printf, print, console.log

  def myUnitReturningFunction(): Unit = {
    println("I don't love returining Unit")
  }
  
}
