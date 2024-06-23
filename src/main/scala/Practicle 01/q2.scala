/* 
The temperature is 35C; convert this temperature into Fahrenheit.
ºF =ºC * 1.8000 + 32.00
*/

object q12 extends App {
    
    def convertToFarenhite(c: Double): Double = 
    (c * 1.8)+ 32

    println(convertToFarenhite(35)); 
}

