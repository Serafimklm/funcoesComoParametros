package com.example.funcoescomoparametros.teste

fun main() {

    val listaLanches = listOf("X-Salada", "X-Bacon", "X-Tudo", "Misto Quente")
    val listaEntrada = listOf("Refrigerante", "Suco")

    val novaLIsta = listaLanches.union(listaEntrada)
    println("$novaLIsta")


}