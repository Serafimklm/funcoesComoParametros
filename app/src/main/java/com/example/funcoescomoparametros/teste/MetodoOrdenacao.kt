package com.example.funcoescomoparametros.teste

fun main() {



    val listaNomes = listOf("Maria", "João", "José")
    val listaNumero = listOf(7, 6, 3, 4, 5);


    val novalistaNumeros = listaNumero.sorted(); // aqui ele utiliza organizacao acentende, de 1 ao maior, de a a Z
    println(novalistaNumeros)


    val novalistaNomes = listaNomes.sortedDescending() // de Z ate A, de 8 ate zero
    println(novalistaNomes)



    fun multiplicador(fator: Int): (Int) -> Int {
        return { numero -> numero * fator }
    }

    fun m2ain() {

        val dobro = multiplicador(2)
        val triplo = multiplicador(3)

        println(dobro(5))   // Saída: 10
        println(triplo(5))  // Saída: 15
    }



}