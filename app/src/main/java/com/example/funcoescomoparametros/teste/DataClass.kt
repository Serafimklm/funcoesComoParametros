package com.example.funcoescomoparametros.teste

data class Perguntas(val pergunta: String, val resportaCerta : Int){
    fun exibir() = println("Pergunta: $pergunta - Resposta certa: $resportaCerta")
}

fun main() {
    val pergunta = Perguntas("Qual a cor do cavalo branco de Napoleao?", 2)
    val pergunta1 = Perguntas("Qual a cor do cavalo branco de Napoleao?", 2)

    println(pergunta == pergunta1)
}