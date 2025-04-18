package com.example.funcoescomoparametros.programacaoOrientadaAobjetos

// ABSTRACAO Acontece quando você usa um tipo genérico (como Animal) para se referir a objetos de tipos específicos (como Cachorro ou Gato).


// Classe abstrata que representa um animal genérico
abstract class Animal {
    // Método abstrato que será implementado nas subclasses
    abstract fun fazerSom()

    // Método comum que pode ser usado por todos os animais
    fun dormir() {
        println("O animal está dormindo.")
    }
}

// Classe Pássaro que herda de Animal
class Passaro : Animal() {
    // Implementa o som específico do pássaro
    override fun fazerSom() {
        println("O pássaro canta: Piu piu!")
    }
}

// Classe Vaca que herda de Animal
class Vaca : Animal() {
    // Implementa o som específico da vaca
    override fun fazerSom() {
        println("A vaca muge: Muuu!")
    }
}

// Função principal do programa
fun main() {
    // Criação de objetos (instâncias)
    val meuPassaro = Passaro()
    val minhaVaca = Vaca()

    // Chamando métodos das classes
    meuPassaro.fazerSom()   // "Piu piu!"
    meuPassaro.dormir()     // Método herdado da classe Animal

    minhaVaca.fazerSom()    // "Muuu!"
    minhaVaca.dormir()      // Método herdado da classe Animal
}

//Resumo da Abstração em Kotlin
//
//✅ Classes abstratas:
//
//Usadas quando você quer compartilhar código entre subclasses.
//
//Podem ter métodos abstratos e concretos.
//
//✅ Interfaces:
//
//Usadas para definir contratos.
//
//Permitem herança múltipla.

//essas sao as duas principais, mas ha outras


//Compartilhar código + hierarquia fixa	(abstract class)

//Definir contratos para múltiplas classes	(interface)

//Representar um conjunto limitado de tipos	(sealed class)

//Modelar dados imutáveis	(data class + interface)

//Implementar padrões (Singleton	object + interface)