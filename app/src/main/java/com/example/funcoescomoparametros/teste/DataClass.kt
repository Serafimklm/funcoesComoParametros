package com.example.funcoescomoparametros.teste

import android.annotation.SuppressLint

data class Perguntas(val pergunta: String, val resportaCerta : Int){
    fun exibir() = println("Pergunta: $pergunta - Resposta certa: $resportaCerta")
}

@SuppressLint("SuspiciousIndentation")
fun main() {
    val pergunta0 = Perguntas("Qual a cor do cavalo branco de Napoleao?", 2)
    val pergunta1 = Perguntas("Qual a cor do cavalo branco de Napoleao?", 2)

//    println(pergunta == pergunta1)

 val   (pergunta, respostaCerta ) = pergunta0

    println(pergunta0)

    // seria o mesmo que fazer o que foi feito abaixo
    val p = pergunta0.pergunta
    val r = pergunta0.resportaCerta

    println(pergunta0)

    //ambos irao apresentar o mesmo resultado

}