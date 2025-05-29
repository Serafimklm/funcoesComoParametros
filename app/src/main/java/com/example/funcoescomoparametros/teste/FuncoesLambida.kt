package com.example.funcoescomoparametros.teste

import java.sql.SQLOutput
/*
class Botao {

//    principal forma
    fun configClickBotao(nome: String , funcao: (String) -> Unit) {
        funcao("Nome: $nome") // jeito mais simples de fazer, passando o parametro logo dnetro da funcao
    }

//    PRIMEIRA FORMA DE CRIAR UMA FUNCAO
*//*    fun configClickBotao(nome: String , funcao: () -> Unit) { // quando a funcao nao tem retorno, se usa Unit, seria como um VOID ,
//        E COMO OS PARENTESES ESTAO VAZIOS ELA  NAO TEM PARAMETRO ALGUM
        funcao() //primeiro vai executar a funcao
        println("Nome: $nome")  // depoisvai executar o parametro nome
    }*//*
}*/
/*
class Clique{
fun executarClick(nome: String){
    println("executar clique no botao, NA FUNCAO COMUM")
}
    }


fun main() {


    val clique = Clique()  // funcao comum
    clique.executarClick("carlos excecutar clique") // funcao comum

    val botao = Botao() // funcao lambida, declarada os atibutos dentro da classe de outra maneira, linha 8 e 9.
    botao.configClickBotao("joao") {   // funcao lambida
        println("executar clique no botao, NA FUNCAO LAMBIDA")
    }
    }



*/

















/*// maneiras de criar uma funcao
fun executar(text : String) { // parametros ficam entre parenteses
    println(text)
}

// para criar uma funcao que sera passada como parametro, se faz necessario ser passada dessa forma
fun main (){
    val funcaoLambida = {  nome : String -> println("ola $nome")

    }
    funcaoLambida("everton") // aqui a funcao lambida foi chamada// so 'e possivel executar dessa forma
}*/

















/*// Definição da classe Matematica
class Matematica {
    // Método 'somar' que recebe dois parâmetros do tipo Int e retorna a soma deles
    fun somar(n1: Int, n2: Int): Int {
        return n1 + n2
    }
}

// Função 'somar' fora da classe Matematica (função normal)
// Também recebe dois parâmetros Int e retorna a soma
fun somar(n1: Int, n2: Int): Int {
    return n1 + n2
}

*//*
// Exemplo comentado de função com parâmetros: texto e numero2
fun caucualr(texto: String, numero2: Int) {
    // Aqui texto e numero2 são chamados de parâmetros
}
*//*

// Função que recebe outra função como parâmetro (função de alta ordem)
// O parâmetro 'funcao' é do tipo (Int, Int) -> Int, ou seja, uma função que recebe dois Ints e retorna um Int
fun caucualr(funcao: (Int, Int) -> Int) {
    // Chama a função recebida como parâmetro, passando os valores 10 e 10
    val retorno = funcao(10, 10)

    // Imprime o resultado da função passada como parâmetro
    println(retorno)
}

// Função principal
fun main() {

    // Instancia a classe Matematica

    val matematica = Matematica()
    // Chama a função caucualr, passando como argumento a função somar da classe Matematica
    // Usamos 'matematica::somar' para passar a referência da função como parâmetro
    caucualr(matematica::somar)

    // para nao instanciar a clase Matematica basta usar caucuar(::somar)
    // Alternativamente, você poderia usar a função somar fora da classe:
     caucualr(::somar)
}*/
