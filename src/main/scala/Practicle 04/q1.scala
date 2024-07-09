import scala.io.StdIn.readLine

object store extends App{
    val itemName = Array("Pen", "Pencil", "book", "cupcake")
    val itemQuantity = Array(10, 2, 8, 1)

    def displayInventory(itemName: Array[String], itemQuantity: Array[Int]): Unit =
        if(itemName.isEmpty){
            println("-------------")
        }else{
            println(f"${itemName.head}%-10s : ${itemQuantity.head}")
            displayInventory(itemName.tail, itemQuantity.tail)
        }
    
    def restockItem(name:String, quantity: Int): Unit =
        if(itemName.isEmpty){
            println("The stock is empty")
        } else{
            var found = false
            for(n <- 0 until itemName.length){
                if(itemName(n) == name){
                    found = true
                    itemQuantity(n) += quantity 
                    println("Successfully updated")
                }
            }
            if(!found) println(s"Invalid Item name: $name")
            
        }

    def sellItem(name:String, quantity: Int): Unit = 
        if(itemName.isEmpty){
            println("The stock is empty")
        }else{
            var found = false
            for(n <- 0 until itemName.length){
                if(itemName(n) == name){
                    found = true
                    if(itemQuantity(n) >= quantity){
                        itemQuantity(n) -= quantity
                        println("Successfully updated")
                    }else{
                        var q = itemQuantity(n)
                        println(s"Not enough quanitiy: only available $q")
                    }
                }
            }
            if(!found) println(s"Invalid Item name: $name")
        }

    // Main program
    var loop = true
    while(loop){
        println("1 - To display stock")
        println("2 - To restock an item")
        println("3 - To sell an item")
        println("4 - To Exit")
        print("select: ")
        val option = readLine().toInt
        option match {
            case 1 => displayInventory(itemName, itemQuantity)
            case 2 => {
                print("Input itemName: ")
                val name = readLine()
                print("Input quantity: ")
                val quantity = readLine().toInt
                restockItem(name, quantity)
            }
            case 3 => {
                print("Input itemName: ")
                val name = readLine()
                print("Input quantity: ")
                val quantity = readLine().toInt
                sellItem(name, quantity)
            }
            case _ => loop = false 
        }
    }
}