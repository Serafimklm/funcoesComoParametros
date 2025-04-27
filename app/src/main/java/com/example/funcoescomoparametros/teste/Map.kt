package com.example.funcoescomoparametros.teste

data class Produto(
    val nome: String,
    val preco: Double
)

fun main() {
    println("---------------------EXIBINDO LISTA COMPLETA, TODO TIPO DE DADOS-------------------------------")
    val listaItens = listOf("Item1", "Item2", "Item3")
    println("---------------------EXIBINDO LISTA COMPLETA, USANDO MAPOF-------------------------------")
    val lista = mutableMapOf(0 to "Item3" to Produto("celular", 100.00))
    println(lista.size)
    lista.forEach { item ->
        println("${item.key} e ${item.value}")
    }

}