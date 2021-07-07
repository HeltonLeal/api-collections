package one.digitalinnovation.collections
// criar um array sem ter que passar a capacidade no hora que instancia o array.

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    values.forEach {
        println(it)
    }
    println("-----------------")
    values.sort()
    values.forEach {
        println(it)
    }
}