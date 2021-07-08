package one.digitalinnovation.collections
// Usando List
 fun main() {
     val joao = Funcionario("João", 2000.0, "CLT")
     val pedro = Funcionario("Pedro", 1500.0, "PJ")
     val maria = Funcionario("Maria", 4000.0, "CLT")

     val funcionarios = listOf(joao, pedro, maria)

     funcionarios.forEach { println(it)} // Iterou a lista

     println("--------------------")
     println(funcionarios.find { it.nome == "Maria" }) // Buscando somente a Maria na Lista.

    println("--------------------")
    funcionarios
        .sortedBy { it.salario } // Organiza o print de forma crescente de acordo com o salario.
        .forEach  { println(it)}

    println("--------------------")
    funcionarios
        .groupBy { it.tipoContratacao } // Organiza pelo tipo de contratação, dada a lista de funcionários.
        .forEach  { println(it)} // Imprime o resultado obtido.

}

