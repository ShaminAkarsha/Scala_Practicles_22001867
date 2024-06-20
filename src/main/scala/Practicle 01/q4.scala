/* 
Suppose the cover price of a book is Rs. 24.95, but bookstores get
a 40% discount. Shipping costs Rs. 3 for the first 50 copies and 75
cents for each additional copy. What is the total wholesale cost for 60
copies?
*/

object q4 extends App {
    val cost = totalCost(60, 24.95, 40)
    println(cost);


    def initialCost(q: Int, unitPrice: Double): Double =
        q * unitPrice

    def costAfterDiscount(cost: Double, rate: Int): Double = 
        cost - cost*(rate/100.0)

    def shippingCost(q: Int): Double = 
        if (q > 50) 50*3 + (q-50)*0.75
        else q*3

    def totalCost(q: Int,unitPrice: Double, rate: Int): Double = {
        costAfterDiscount(initialCost(q, unitPrice), rate) + shippingCost(q)
    }

}