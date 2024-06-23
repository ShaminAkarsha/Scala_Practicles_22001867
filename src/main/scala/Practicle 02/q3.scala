/* 
Company XYZ & Co. pays all its employees Rs.250 per normal working hour
and Rs. 85 per OT hour. A typical employee works 40 (normal) and 30(OT) hours
per week has to pay 12% tax.
Develop a functional program that determines the take home salary of an
employee from the number of working hours and OT hours given
 */


object q23 extends App {
    val hourly_rate =  250
    val ot_rate = 40
    val tax_rate = 0.12

    def normalAmount(hour: Int): Double = 
        hour*hourly_rate

    def otAmount(hour: Int): Double = 
        hour*ot_rate
    
    def taxAmount(salary: Double): Double = 
        salary*tax_rate

    def takeHomeSal(wHour: Int, otHour: Int): Double = 
        normalAmount(wHour) + otAmount(otHour) - taxAmount(normalAmount(wHour)+otAmount(otHour))

    println("Take home salary for 40hours and 30h OT: " + takeHomeSal(40, 30))

}