package main.kotlin.oop

class Matrix(val matrix: Array<IntArray>, val rows: Int, val columns: Int) {

    fun Add(matrix2: Array<IntArray>): Array<IntArray> {
        val sum = Array(rows) { IntArray(columns) }
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                sum[i][j] = matrix[i][j] + matrix2[i][j]
            }
        }
        return sum
    }

    fun multiply(n: Int): Array<IntArray> {
        val result = Array(rows) { IntArray(columns) }
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                result[i][j] = matrix[i][j] * n
            }
        }
        return result
    }

    fun print() {
        for (row in matrix) {
            for (column in row) {
                print("$column  ")
            }
            println()
        }
    }

    fun multiply(
        secondMatrix: Matrix,
        r1: Int,
        c1: Int,
        c2: Int
    ): Matrix {
        val result = Array(r1) { IntArray(c2) }
        for (i in 0 until r1) {
            for (j in 0 until c2) {
                for (k in 0 until c1) {
                    result[i][j] += matrix[i][k] * secondMatrix.matrix[k][j]
                }
            }
        }
        return Matrix(result, r1, c2)
    }
}

fun main() {
    val firstMatrix = Matrix(arrayOf(intArrayOf(0, 3, 2), intArrayOf(4, 12, 1), intArrayOf(12, 0, 11)), 3, 3)
    val secondMatrix = Matrix(arrayOf(intArrayOf(-14, 2, 3), intArrayOf(9, 2, 3), intArrayOf(7, 2, 1)), 3, 3)
    firstMatrix.print()
    secondMatrix.print()
    firstMatrix.multiply(secondMatrix, 3, 3, 3).print()


}