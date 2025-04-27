package com.example.funcoescomoparametros.teste // Define o pacote onde está o arquivo Kotlin

// Declaração da classe Mensagem1 com dois parâmetros: mensagem e duracao
class Mensagem1(val mensagem: String, val duracao: Int) {

    // Função que imprime os valores e retorna o próprio objeto (this) para encadeamento
    fun exibir(): Mensagem1 {
        println("M: ${this.mensagem} - D: ${this.duracao}") // Mostra a mensagem e a duração no console
        return this // Retorna o mesmo objeto, permitindo encadeamento de métodos
    }
}

// Função principal, ponto de entrada do programa
fun main() {

    // Cria uma instância de Mensagem1 com a mensagem "Duração curta", chama exibir() e guarda na variável mensagem1
    val mensagem1 = Mensagem1("Durancao curta", 1000).exibir()

    // Cria outra instância com a mensagem "Duração longa", chama exibir() e guarda na variável mensagem2
    val mensagem2 = Mensagem1("Durancao longa", 5000).exibir()
}
