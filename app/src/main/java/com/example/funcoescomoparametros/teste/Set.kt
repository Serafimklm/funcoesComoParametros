package com.example.funcoescomoparametros.teste


data class Carro(
    val nome: String,
    val ano: Int,
    val cor: String
)

fun main() {

    val lista = setOf("joao", "maria", "ana", "joao", 12, 12)  //setOf pode receber qualquer tipo de dado, mas n a,,,,,,,,,,,,o repete na hora de passar esses dados para algo,

    lista.forEach{
            nome -> println(nome)
    }                                                      //por exemplo para imporimir os dados nao repete
    val novalista = lista.plus("ana") // adicionando um item a lista
    println(novalista)

    println("-------------------------EMBARALHANDO LISTA------------------------------------------------------------------")
    val dados = arrayListOf("carro", 10, 20, 30, 223)
    dados.shuffle()
    lista.forEach { item ->
        println(item)

    }
}