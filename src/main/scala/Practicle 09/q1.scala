object q91 extends App{
    val depositInterest = (deposit: Double) =>
        deposit match {
            case deposit if deposit <= 20000 => deposit*0.02
            case deposit if deposit <= 200000 => deposit*0.04
            case deposit if deposit <= 2000000 => deposit*0.035
            case deposit if deposit > 2000000 => deposit*0.065
            case _ => -1
        }
    
    println(depositInterest(100000))
}
