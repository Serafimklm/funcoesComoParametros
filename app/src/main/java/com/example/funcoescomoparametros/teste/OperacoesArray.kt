package com.example.funcoescomoparametros.teste

fun main() {
//apesar de haver arrays para todos os tipos de dados primitivos, sao usados apenas 3 principais

//existem 3 tipos princiapis de formas de criar um array, intArrayOf(para criar uma lista de apenas numeros inteiros)
// doubleArrayOf(para criar uma lista de apenas numeros double)

// arrayListOf(para criar uma lista de qualquer tipo de dado) POREM VOCE PODE ALTERAR A LISTA, ADCIONAR OU REMOVER ITENS

// arrayOf(para criar uma lista de qualquer tipo de dado) POREM VOCE-----NAO----PODE ALTERAR A LISTA, ADCIONAR OU REMOVER ITENS

    println("---------------------EXIBINDO LISTA COMPLETA, TODO TIPO DE DADOS-------------------------------")
    val lista = arrayListOf("carro", 10, 20, 30, 223)
    lista.shuffle()
    lista.forEach { item ->
        println(item)

    }



    println("---------------------EXIBINDO LISTA PEGANDO UM DADO ESPECIFICO---------------------------------")
    val list1 = arrayListOf("Maria", "manuel", "tony cross")
    println(list1[2])  // para pegar uma unidade espcifica da lista faca como nessa linha



    println("----------------------EXIBINDO LISTA tamanho FIXA ANTES DE ADD ITEM --------------------------------")
//------------lista com tamanho fixo-------------------
    val list = arrayOf("car", "bike", "airplane")
    list.forEach { item ->
        println(item) // exibe todos os itens da lista

//        println(list.first()) // imprime o primeiro item da lista
//        println(list.last()) // imprime o ultimo item da lista
//        println(list.size) // imprimendo o tamanho da lista
        println(list.contains("bike")) // print pra verifica se existe um item como esse nome ou dado na list
    }

    println("-------------------------ADD ITEM A LISTA FIXA------------------------------------------------------------------")

    val novalist = list.plus("CBR1000RR-R fireblade")  // pegando array  <list> da linha 30 e adicionando um novo item
//se quero adcionar mais elementos da lista

    novalist.forEach { listaatualizada ->
        println("os itens da lista atualizados sao: $listaatualizada")
    }
    println("-------------------------EMBARALHANDO LISTA------------------------------------------------------------------")
    val dados = arrayListOf("carro", 10, 20, 30, 223)
    dados.shuffle()
    lista.forEach { item ->
        println(item)

    }

}