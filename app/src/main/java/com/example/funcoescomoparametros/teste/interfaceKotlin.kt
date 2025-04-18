package com.example.funcoescomoparametros.teste

import java.time.Instant
import java.io.Serializable

// 1 conceito, nao estou repetindo coidigo e estou fazendo a divisao de responsabilidades
// alto acomplamento e baixa e coesao alta
//as classes devem utilizar outras classes nao ficar  sendo repetidas sempre
//abaixo temos 2 tipos de classe, violao e bateria




//---------------------------------------------EXEMPLO DE POLIMORFISMO--------------------------------------
//USANDO A FUNCAO TOCAR COM METODO SENDO TOCADO
//COM OBJETOS DIFERENTES




// A classe musico precisa de um objeto que seja do tipo Instrumento para funcionar, esses objetos
//vao ser salvos na variavel instrumento
//PRIMEIRO TEMOS A CLASSE MUSICO, DEPOIS VARIAVEL <instruemnto> QUE É DO TIPO <INSTRUMENTO>
//o INSTRUMENTO poderia ser uma classe ou uma interface, no caso a interface Instrumento
class Musico(val instrumento: Instrumento) {  //passa a varialve insturmentos como parametro
    //entao essa variavel <instrumento> vai receber qualquer objeto que implementa interface Instrumento
    //o intuito disso e fazer com que a classe Musico toque qualquer instrumento
    //Função tocar executa ações dos instrumentos
    fun tocar() {
    // Aqui, o Musico usa o objeto instrumento que ele possui
    // para executar a ação de tocar específica daquele instrumento unsando o metodo que estava definido dentro de violao
    // Precisamos que a interface/classe Instrumento defina um método para isso.
    // Vamos supor que exista um método chamado 'tocarInstrumento()' na interface Instrumento.

    println("Tocando música...") // Imprime que a música começou
        instrumento.sendoTocado()    // Chama a função da viola()   // Chama a função da viola  // Chama a função da bateria para tocar
    }
}

// Classe base Instrumentos (pode ser usada para generalização ou herança)
interface Instrumento {
    fun sendoTocado(); // Implementa o metodo 'sendoTocado' definido na interface Instrumento
}

// Classe Violao herda de Instrumentos
class Violao : Instrumento
{


   override fun sendoTocado() { // Implementa o metodo 'sendoTocado' definido na interface Instrumento
       println("tocando violao \n do re mi fa sol la ti\n\n")

  }
}

// Classe Bateria herda de Instrumentos
class Bateria : Instrumento
{

    override fun sendoTocado() // Implementa o metodo 'sendoTocado' definido na interface Instrumento (uma acao)
    {
        println("tocando bateria\n tum, tum, tum\n\n")
    }
}
// teclado herdando de isntrumento
class Tecado : Instrumento
{
    override fun sendoTocado()
    {
        println("Tocando teclado...\n Plim plom!\n\n")
    }
}

// Função principal onde a execução do programa começa
fun main() {

    val meuviolao : Instrumento = Violao() // Cria uma instância da classe Violao e a atribui a uma variável 'meuviolao' do tipo Instrumento (demonstrando polimorfismo)
    val minhabateria : Instrumento = Bateria() // Cria uma instância da classe Bateria e a atribui a uma variável 'minhabateria' do tipo Instrumento
    val meuteclado : Instrumento = Tecado() // Cria uma instância da classe Tecado e a atribui a uma variável 'meuteclado' do tipo Instrumento


    // -------------------- TELA 1 ------------------------
    val musicoDeviolao = Musico(meuviolao)
    val musicoDeBateria = Musico(minhabateria)
    val musicoDeTeclado = Musico(meuteclado)

    musicoDeviolao.tocar()
    musicoDeBateria.tocar()
    musicoDeTeclado.tocar()

    // -------------------- TELA 2 ------------------------

    // -------------------- TELA 3 ------------------------

}
