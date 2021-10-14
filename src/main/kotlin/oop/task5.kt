package main.kotlin.oop

fun main() {
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    printNumbers(a, b)
}

fun printNumbers(a: Int, b: Int) {
    if (a < b) {
        for (i in a..b)
            print("$i ")
    } else {
        for (i in b downTo a)
            print("$i ")
    }
}