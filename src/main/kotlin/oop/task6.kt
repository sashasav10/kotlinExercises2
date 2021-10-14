package main.kotlin.oop

open class Student(val firstName: String, val lastName: String, val group: String, var averageMark: Double) {
    open fun getScholarship() {
        if (averageMark == 5.0)
            println("Scolarship 100")
        else println("Scolarship 80")
    }
}

open class Aspirant(firstName: String, lastName: String, group: String, averageMark: Double, var scienceWork: String) :
    Student(firstName, lastName, group, averageMark) {
    override fun getScholarship() {
        if (averageMark == 5.0)
            println("Scolarship 200")
        else println("Scolarship 180")
    }
}

fun main() {
    val student = listOf<Student>(
        Student("Petro", "Sence", "GK20", 5.0),
        Student("Mark", "Johnson", "KS19", 4.0),
        Aspirant("Ivan", "kucher", "KN20", 3.85, "Science in Restarant sphere")
    )
    for (i in student) {
        i.getScholarship()
    }
}