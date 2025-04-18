package com.example.funcoescomoparametros.programacaoOrientadaAobjetos

// ===== CLASSE PAI (Superclasse) =====
// POO: Abstração - Define atributos/comportamentos comuns a todos os veículos
open class Veiculo(
    protected val marca: String,  // 'protected': visível apenas para a classe e subclasses
    private val ano: Int          // 'private': visível apenas nesta classe
) {
    // Método comum a todos os veículos
    open fun acelerar() {  // 'open': permite sobrescrita (override)
        println("$marca acelerando...")
    }

    // Método final (não pode ser sobrescrito)
    fun mostrarAno() {
        println("Ano do veículo: $ano")
    }
}

// ===== SUBCLASSES (Herança) =====
// POO: Herança - Carro herda atributos/comportamentos de Veiculo
class Carro(
    marca: String,
    ano: Int,
    private val portas: Int  // Atributo específico de Carro
) : Veiculo(marca, ano) {    // Sintaxe de herança (: Veiculo)

    // POO: Polimorfismo - Sobrescrita do método acelerar()
    override fun acelerar() {
        println("$marca (carro) acelerando com $portas portas abertas!")
    }

    // Método específico de Carro
    fun abrirPortas() {
        println("Abrindo $portas portas...")
    }
}

// Outra subclasse
class Moto(
    marca: String,
    ano: Int,
    private val cilindradas: Int
) : Veiculo(marca, ano) {

    override fun acelerar() {
        println("$marca (moto) acelerando com $cilindradas cilindradas! VRUUUM!")
    }

    fun empinar() {
        println("Empinando a moto $marca!")
    }
}

// ===== PROGRAMA PRINCIPAL =====
fun main() {
    // Instanciando objetos
    val veiculoGenerico = Veiculo("Genérico", 2020)
    val meuCarro = Carro("Ford", 2022, 4)
    val minhaMoto = Moto("Honda", 2023, 300)

    // === TESTANDO HERANÇA ===
    println("=== SAÍDAS ===")

    // Chamadas de métodos (comportamentos diferentes)
    veiculoGenerico.acelerar()  // Saída: "Genérico acelerando..."
    meuCarro.acelerar()         // Saída: "Ford (carro) acelerando com 4 portas abertas!"
    minhaMoto.acelerar()        // Saída: "Honda (moto) acelerando com 300 cilindradas! VRUUUM!"

    // Método herdado (não sobrescrito)
    meuCarro.mostrarAno()  // Saída: "Ano do veículo: 2022"

    // === TESTANDO MÉTODOS ESPECÍFICOS ===
    meuCarro.abrirPortas()  // Saída: "Abrindo 4 portas..."
    minhaMoto.empinar()     // Saída: "Empinando a moto Honda!"

    // === POLIMORFISMO EM AÇÃO ===
    val veiculos: List<Veiculo> = listOf(veiculoGenerico, meuCarro, minhaMoto)
    println("\n=== ACELERANDO TODOS OS VEÍCULOS ===")
    for (v in veiculos) {
        v.acelerar()  // Chama a implementação específica de cada subclasse
    }
}

//Comentários sobre POO no Código
//
//Herança
//
//Carro e Moto herdam de Veiculo (: Veiculo).
//
//Subclasses acessam atributos protected da superclasse (marca).
//
//Polimorfismo
//
//Método acelerar() tem comportamentos diferentes em cada subclasse (override).
//
//Na lista veiculos, cada objeto executa sua própria versão do método.
//
//Encapsulamento
//
//ano é privado (só Veiculo pode acessá-lo).
//
//marca é protegido (acessível apenas para subclasses).
//
//Abstração
//
//Veiculo define comportamentos genéricos que as subclasses implementam.
//
//Benefícios Deste Design
//
//Reúso de código: Carro e Moto compartilham atributos/métodos de Veiculo.
//
//Extensibilidade: Adicionar novos veículos (ex: Caminhao) é fácil.
//
//Flexibilidade: Tratar diferentes veículos como um tipo genérico (Veiculo).
//
//Pronto! Isso é herança na prática, integrada com outros pilares da POO. 🚗🏍️