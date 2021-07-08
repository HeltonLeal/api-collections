package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("João", 1000.0) // tipo Pair
    val map1 = mapOf(pair) // O Pair vira um elemento do map.

    map1.forEach { (k, v) ->
        println("Chave: $k - Valor: $v")
    }

    val map2 = mapOf("Pedro" to 2500.0,
        "Maria" to 3000.0
    ) // usando to =  sintaxe infix

    map2.forEach {(k, v) -> println("Chave: $k - Valor: $v")}

}