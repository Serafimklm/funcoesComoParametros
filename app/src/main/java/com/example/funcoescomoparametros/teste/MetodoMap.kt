package com.example.funcoescomoparametros.teste

fun converterTextoPraMaiusculo (texto: String): String {
    return texto.uppercase() // assim todda vez que for chamado o texto sera convertido para maiusculo
}

fun main() {

    val lista = listOf("jamiltom", "pedro", "ana", "maria")

    val novaLista = lista.map { nome ->
        nome.uppercase()

        println(nome.uppercase())

    }
//    ----------- agora usando a funcao converterTextoPraMaiusculo----------------
    println("-----------------imprimindo nomes usando a funcao converter para maiusculo-------------------------------")
    val novaLista1 = lista.map(::converterTextoPraMaiusculo)
    println(novaLista1)


/*    val novaLista = mutableListOf<String>()
    lista.forEach{ nome ->
        novaLista.add(nome.uppercase())
//        println(nome.uppercase())
    }

    println(novaLista)*/
  /* Tambem poderia ser feito dessa forma
   for (name in lista){
        println(name)
    }*/
//     mas a o inves de fazer isso, basta fazer como no primeiro exemplo


}