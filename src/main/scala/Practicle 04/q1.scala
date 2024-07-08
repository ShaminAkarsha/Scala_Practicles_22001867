object store extends App{
    val itemName = Array("Pen", "Pencil", "book", "cupcake")
    val itemQuantity = Array(10, 2, 8, 1)

    def displayInventory(itemName: Array[String], itemQuantity: Array[Int]): Unit =
        if(itemName.isEmpty){
            println("-------------")
        }else{
            println(s"${itemName.head} : ${itemQuantity.head}")
            displayInventory(itemName.tail, itemQuantity.tail)
        }
    
    def restockItem(name:String, quantity: Int): Unit =
        if(itemName.isEmpty){
            
        }     

    displayInventory(itemName, itemQuantity)
}