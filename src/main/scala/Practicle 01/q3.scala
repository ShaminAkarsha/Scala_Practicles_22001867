/* 
The volume of a sphere with radius r is 4/3 Pi r3. What is the
volume of a sphere
with radius 5? 
*/

object q13 extends App {

    def volumeOfSphere(r: Double): Double = {
    val PI = 3.14
    (4.0/3)*PI*r*r*r
    }

    println(volumeOfSphere(5))
}


