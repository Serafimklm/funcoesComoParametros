package com.example.funcoescomoparametros.teste

//----------------------------como utilizar GETTER AND SETTER-------------------------------------

//getter seria como pegar um valor (get a value), e o setter seria como setar um valor (set a value)
//esses modificadores servem para acessar e modificar atributos privados de forma controlada

//----------------------------exemplo abaixo-------------------------------------------------
//class Pessoa {
//    // Declaração da classe Pessoa
//    private var idade = 0 // Atributo privado que armazena a idade da pessoa
//
//    fun getIdade(): Int { // Metodo público que retorna a idade (getter)
//        return idade // Retorna o valor atual do atributo idade
//    }
//
//    fun setIdade(novaIdade: Int) { // metodo público que define a idade (setter)
//        if (novaIdade >= 0) { // Verifica se a nova idade é maior ou igual a 0
//            idade = novaIdade // Se for, atualiza o valor do atributo idade
//        }
//        // Se for um valor negativo, nada acontece (idade não muda)
//    }
//}

/*class Usuario(val nome : String, val sobrenome: String, val idade : Int){

}*/

//=========================GET AND SET em kotlin====================================================
//observacao = precisa ser declarado como var para poder ser alterado
class Usuario(){
    var nome : String = "Pasifik"
        get() {
            return field.uppercase()  //field que dizer campo
        }


    var sobrenome: String = ""
    var idade : Int = 10
    var maiorIdade = false
        get() = idade >= 12
}

//observe abaixo que mesmo com os atributos da classe GettersAndSetterJavaPessoa() sendo declarados como privados
// ainda sim e' possivel acessa-los, isso gracas aos getters and setters
fun main() {

    val usuario = Usuario(); // instancia a classe Usuario, dessda forma ja nao precisa declarar os atributos
//    val usuario = Usuario("Carlos", "Serafim", 29);
    usuario.nome
    usuario.sobrenome
    println("nome: ${usuario.nome} sobrenome: ${usuario.sobrenome} idade: ${usuario.idade}, Idade Maior que 12?: ${usuario.maiorIdade}")

//    esse seria como o mesmo codigo abaixo,
/*
   val pessoa = GettersAndSetterJavaPessoa()
    pessoa.nome = "Rafik"
    pessoa.idade = 12

    println("nome: ${pessoa.nome} idade: ${pessoa.idade}");*/

}

