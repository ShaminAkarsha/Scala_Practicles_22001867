package practice

object prob2 extends App {
    def tax(gross: Int):Double = 
        gross match {
            case gross if gross <= 50000 => gross*0
            case gross if gross <= 100000 => gross*0.1
            case _ => gross*0.2
        }
    
    def grosspay(h: Int) = h*500
    def netpay(h: Int) = 
        grosspay(h) - tax(grosspay(h))

    println("netpay of working 200 hours - "+netpay(200))
}