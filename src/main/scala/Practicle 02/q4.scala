/* 
Imagine the owner of a movie theater who has complete freedom in setting
ticket prices. The more he charges, the fewer the people who can afford tickets.
In a recent experiment the owner determined a precise relationship between the
price of a ticket and average attendance.
At a price of Rs 15.00 per ticket, 120 people attend a performance. Decreasing
the price by 5 Rupees increases attendance by 20 and increasing the price by 5
Rupees decreases attendance by 20.
Unfortunately, the increased attendance also comes at an increased cost. Every
performance costs the owner Rs.500. Each attendee costs another 3 Rupees.
The owner would like to know the exact relationship between profit and ticket
price so that he can determine the price at which he can make the highest profit.
Implement a functional program to find out the best ticket price. */

object q24 extends App {
    def attendance(ticketPrice: Int): Int = 
        ticketPrice >= 15.0 match {
            case true => 120 - 20*(ticketPrice - 15)/5
            case false => 120 + 20*(15 - ticketPrice)/5
        } 

    def performanceCost(ticketPrice: Int) = 
        500 + attendance(ticketPrice)*3
    
    def profit(ticketPrice: Int) = 
        attendance(ticketPrice)*ticketPrice - performanceCost(ticketPrice)

    println("When a ticket 15 profit: " + profit(15))
    println("When a ticket 10 profit: " + profit(10))
    println("When a ticket 5 profit: " + profit(5))
    println("When a ticket 20 profit: " + profit(20))
    println("When a ticket 25 profit: " + profit(25))
    println("When a ticket 30 profit: " + profit(30))
    println("When a ticket 35 profit: " + profit(35))
}