/*
Area of a disk with radius r is Pi r*r. What is the area of a disk with
radius 5? 
*/

object q11 extends App {
    def diskArea(r: Double): Double = {
    val PI = 3.14
    PI * r * r 
    }
    println(diskArea(5))
}

