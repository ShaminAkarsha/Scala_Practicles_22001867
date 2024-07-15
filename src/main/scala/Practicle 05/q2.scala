
import scala.io.StdIn.readLine

class Book(val title: String = "-"
        , val author: String = "-"
        , val isbn: String = "-")
        {}

object libSystem{
    val b1 = new Book("ABC", "John", "1022304")
    val b2 = new Book("Fear of Fly", "Erica", "113334")
    val b3 = new Book("Cup and Plate", "Jesica", "1001101")

    var libarary = Set(b1,b2,b3)

    def addBook(): Unit = {
        val title = readLine("Input book title: ").toLowerCase()
        val author = readLine("Author: ").toLowerCase()
        val isbn = readLine("ISBN no: ").toLowerCase()
        val newBook = new Book(title, author, isbn)
        libarary = libarary + newBook
    }

    def removeBook(isbn: String): Unit = { 
        for (i <- libarary){
            if(i.isbn == isbn){
                libarary = libarary - i
            }
        }

    }

    def checkAvailabe(isbn: String): Boolean = {
        var avalability = false
        for (i <- libarary){
            if(i.isbn == isbn){
                avalability = true
            }
        }
        println(avalability)
        avalability
    }

    def printLib(): Unit = {
        for (i <- libarary){
            printf(s"Title: ${i.title} Author: ${i.author} ISBN no: ${i.isbn}\n")
        }
    }

    def searchBook(title: String): Unit = {
        var found = false
        for (i <- libarary){
            if(i.title == title){
                found = true
                println(s"Title: ${i.title} Author: ${i.author} ISBN no: ${i.isbn}")
            }
        }
        if(!found) println("Not found the book")
    }

    def main(args: Array[String]) : Unit = {
        var continue = true
        while (continue){
            println("1 - Add a new book")
            println("2 - Remove a book")
            println("3 - Check availablity")
            println("4 - Print all books")
            println("5 - Search a book")
            val option = readLine(": ").toInt
            option match {
                case 1 => addBook()
                case 2 => removeBook(readLine("ISBN no: "))
                case 3 => checkAvailabe(readLine("ISBN no: "))
                case 4 => printLib()
                case 5 => searchBook(readLine("Book Title: ").toLowerCase())
                case _ => continue = false
            }
        }
    }
}
