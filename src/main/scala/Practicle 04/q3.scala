object q43 extends App{
    def toUpper(str:String): String = str.toUpperCase()

    def toLower(str:String): String = str.toLowerCase()

    def formatName(name: String): String =  name.head.toString().toUpperCase()+name.tail.toLowerCase()

    println(formatName("BEnnY"))
    println(formatName("NIroshan"))
    println(formatName("saman"))

}