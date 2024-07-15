import scala.io.StdIn.readLine

object q51 extends App{
    
    def getProductList(): List[String] = {
        var productList: List[String] = List()
        var input = true
        while(input){
            val product: String = readLine("Enter product name (type 'Done' to finish): ").toLowerCase()
            if(product == "done"){
                input = false
            }
            productList = productList :+ product
        }
        productList
    }

    def printProductList(productList: List[String], startIndex: Int): Unit = {
        if(productList.isEmpty || productList(0) == "done"){
            println("--End--")
        }else{
            val product = productList.head
            println(s"$startIndex - $product")
            printProductList(productList.tail, startIndex+1)
        }
        
    }

    def getTotalProducts(productList: List[String]): Int = {
        if(productList.isEmpty || productList(0) == "done"){
            0
        }else{
            getTotalProducts(productList.tail) + 1;
        }
    }

    val list = getProductList()
    val startIndex = 1
    printProductList(list, startIndex)
    println(getTotalProducts(list))

}