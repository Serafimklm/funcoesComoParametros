package com.example.funcoescomoparametros.teste
/*

fun main() {
*/



    /*
    data class Produto(
        var nome: String,
        var preco: Double)
    {
        fun desativar(){
            println("Produto $nome com preco $preco foi desativado")
        }
    }

        var produto : Produto? = null
        //usuario pode escolher ou nao um produto




    */

/*//    -----------------------------FUNCAO LET------------------------------------------------------
//    usando LET voce ja garente que o produto nao sera nulo

    produto?.let {item ->
        item.preco = 2.0
        item.nome = "Borracha"
        salverProduto(item)
    }
    println(produto?.nome) // fazendo chamadas de seguranca porque poderia ser nulo*/

/* //----------------------------- RUN ------------------------------------------------------
//    RUN É ÚTIL PARA INICIALIZAR OBJETOS E FAZER AÇÕES COM ELES

 produto = Produto("Caneta", 1.50)

   produto?.run {
       desativar()
   }
   println(produto?.nome)
// ---------------------------------WIFH------------------------------------------------------
//    o with seria como o run, seria como dizer, com isso faça isso
//    with e run tambem tem capacidade de retonar objetos ex

  val novoObjeto = with (produto){
       desativar() // com produto desativar  (usando a funcao criada para desativar)
      this // so escrever this que ele retorna o objeto automaticamente
   }*/

/*//-----------------------------APPLY------------------------------------------------------------


fun main() {
    // Cria um objeto da classe Produto e usa 'apply' para configurar seus atributos
    val produto = Produto().apply {
        nome = "Caderno"     // Define o nome do produto como "Caderno"
        preco = 15.99        // Define o preço do produto como 15.99
        ativo = true         // Define que o produto está ativo
    }

    // Chama a função exibirInfo() do objeto produto, para mostrar seus dados
    produto.exibirInfo()
}

// Define a classe Produto com três propriedades: nome, preco e ativo
class Produto {
    var nome: String = ""       // Nome do produto (string vazia por padrão)
    var preco: Double = 0.0     // Preço do produto (0.0 por padrão)
    var ativo: Boolean = false  // Se o produto está ativo (falso por padrão)

    // Função para exibir as informações do produto
    fun exibirInfo() {
        println("Produto: $nome")     // Mostra o nome do produto
        println("Preço: R$ $preco")   // Mostra o preço com "R$"
        println("Ativo: $ativo")      // Mostra se está ativo (true ou false)
    }
}

*/

/*
//----------------------ALSO---------------------------------------------------------------------
 fun main() {
     val lista = listOf("um", "dois", "três", "quatro", "cinco")

     lista.
          map { it.uppercase() } // transforma cada palavra em maiúscula
         .also { println(it) }     // imprime o resultado
 }
*/
