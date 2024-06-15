/*
I run 2 km at an easy pace (8 min per km), then 3 km at Tempo (7
min per km) and 2 km at easy pace again to reach home. What is the
total running time? 
*/

object q5 extends App {
    val runTime = totalTime()
    println("Total run Time is " + runTime + " Mins.")
}

def timeToRunEasy(d: Int): Double = 
    d*8.0
def timeToRunTempo(d: Int): Double = 
    d*7.0

def totalTime(): Double = 
    timeToRunEasy(4) + timeToRunTempo(3)