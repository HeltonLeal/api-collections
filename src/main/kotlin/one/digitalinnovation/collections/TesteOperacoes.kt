package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("-----------------------")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("-----------------------")
    salariosMaiorQue2500.forEach {(println(it))}

    println("-----------------------")
    println(salarios.count {it in 2000.0..5000.0}) // conta quantos salarios estão no range entre 2000 e 5000

    println("-----------------------")
    println(salarios.find { it == 2250.0 }) // busca exatamente o valor especifico.
    println(salarios.find { it == 500.0 }) // retorna null.

    println("-----------------------")
    println(salarios.any {it == 1000.0}) // procura dentro da colecao se esta expressao é verdadeira.
    println(salarios.any { it == 500.0 }) // retorna false. pois não tem o valor na nossa coleção.
}