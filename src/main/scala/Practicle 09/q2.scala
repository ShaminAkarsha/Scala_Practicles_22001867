import scala.io.StdIn.readInt
object q92 extends App{
    val isEven = (n: Int) => {
        n match {
            case 0 => println("Zero")
            case n if n<0 => println("Negative") 
            case n if n%2==0 => println("Even")
            case n if n%2==1 => println("Odd")
        }
    }

    // main
    var continoue = true
    while(continoue){
        printf("Input a number: ")
        val number = readInt()
        if(number == -1){
            continoue = false
        }else{
            isEven(number)
        }
    }
}