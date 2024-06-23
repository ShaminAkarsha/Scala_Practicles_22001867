package practice

object prob1 extends App {

    //The bank pays a flat 5% for deposits of up to Rs. 1000,
    //a flat 6% per year for deposits of up to Rs. 10000,
    //a flat 7% per year for deposits of up to Rs. 100000,
    //and a flat 8% for deposits of more than Rs. 100000.

    def interest(deposit: Double):Double = 
       deposit match{
        case deposit if deposit > 100000 => deposit*0.08
        case deposit if deposit > 10000 => deposit*0.07
        case deposit if deposit > 1000 => deposit*0.06
        case _ => deposit*0.05 
       }

    def balance(deposit: Double):Double = 
        deposit + interest(deposit)

    println(balance(12000));
}