/*
Area of a disk with radius r is Pi r*r. What is the area of a disk with
radius 5? 
*/

object q1 extends App {
    println(diskArea(5))
}

def diskArea(r: Double): Double = {
    val PI = 3.14
    PI * r * r 
}