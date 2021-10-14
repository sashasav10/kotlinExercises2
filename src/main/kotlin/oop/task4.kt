package main.kotlin.oop

data class Reader(
    val FIO: String,
    val ticketNumber: Int,
    val Fuculty: String,
    val dateOfBirth: String,
    val phone: String
) {
    fun takeBook(count: Int) {
        println("$FIO took $count books")
    }

    fun takeBook(books: ArrayList<Book>) {
        println("$FIO took $books")
    }
}

data class Book(val bookName: String, val author: String)

fun main() {
    val reader1 = Reader("Jonhnson P.Z", 654354, "BKNUk", "12.12.1980", "0964532132")
    val book1 = Book("Misteries", "Benk Mard")
    val book2 = Book("Happiness", "James Tres")
    val book3 = Book("The truth", "Mark Winks")
    val book4 = Book("First of all", "Liana Great")
    val bookList = arrayListOf<Book>(book1, book2)
    reader1.takeBook(bookList)
}