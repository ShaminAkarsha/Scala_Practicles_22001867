class Item(
    var ID: String = "000",
    var name: String = "-",
    var quantity: Int = 1,
    var price: Double = 0.0
    )

object inventorySystem{
    val inventory01 = Map("100" -> new Item("100","book",10,240),
                            "101" -> new Item("101","tape",20,40),
                            "102" -> new Item("102","bluepen",100,80),
                            "103" -> new Item("103","redpen",40,80),
                            "104" -> new Item("104","a4bundle",10,2400)
                        )
    val inventory02 = Map("105" -> new Item("105","glue",20,180),
                            "106" -> new Item("106","icecream",10,150),
                            "102" -> new Item("102","bluepen",40,100));

    def printItem(item: Item): Unit = {
        println(s"ID: ${item.ID}")
        println(s"  Name: ${item.name}")
        println(s"  Quantity: ${item.quantity}")
        println(s"  Price: ${item.price}")
    }
    def printInventory(inventory: Map[String, Item]): Unit = {
        inventory.keys.foreach(i => {printItem(inventory(i))})
    }

    def getTotalValue(inventory: Map[String, Item]): Double = {
        var totalValue: Double = 0
        inventory.keys.foreach(i => {totalValue += inventory(i).price * inventory(i).quantity})
        totalValue
    }

    def checkEmpty(inventory: Map[String, Item]): Boolean = {
        inventory.isEmpty
    }

    def mergeToinventory(inventory1: Map[String, Item], inventory2: Map[String, Item]): Unit = {
        inventory2.keys.foreach(i => {
            if(inventory1.contains(i)){
                if(inventory2(i).price > inventory1(i).price){
                    inventory1(i).price = inventory2(i).price
                }
                inventory1(i).quantity += inventory2(i).quantity
            }else{
                inventory1 + (i -> inventory2(i))
            }
        })
    }

    def checkItem(inventory: Map[String, Item], id: String): Unit = {
        if(inventory.contains(id)){
            printItem(inventory(id))
        }else{
            println("Item ID does not exists")
        }
    }

    def main(args: Array[String]) = {
        printInventory(inventory01)
        val totValue01 = getTotalValue(inventory01)
        println(s"Total value of products in inventory 1: ${totValue01}")
        if(checkEmpty(inventory01)){
            println("Inventory is empty!")
        }else{
            println("Inventory is not empty :)")
        }
        println("Merge inventory 1 and 2 ...")
        mergeToinventory(inventory01, inventory02)
        printInventory(inventory01)
        println("Check ID-102 exists in the inventory 1 ...")
        checkItem(inventory01,"102")
    }
}
