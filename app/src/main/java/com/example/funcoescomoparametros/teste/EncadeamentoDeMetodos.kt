package com.example.funcoescomoparametros.teste


class Mensagem (val mensagem: String, val duracao: Int) {

    companion object {

        const val DURACAO_CURTA = 1000;
        const val DURACAO_LONGA = 5000;
                                                        // tipo de retono :MENSAGEM
        fun construirTxt(mensagem: String, duracao: Int) : Mensagem {
            return Mensagem( mensagem, duracao)
        }
    }

        fun exibir(){
            println("M: ${this.mensagem} - D: ${this.duracao}")
        }

}
fun main() {


    val mesagem1 = Mensagem.construirTxt("Durancao curta", Mensagem.DURACAO_CURTA)
    val mensagem = Mensagem.construirTxt("Durancao longa", Mensagem.DURACAO_LONGA)
    mesagem1.exibir()
    mensagem.exibir()

    /*Mensagem.exibir()
    Mensagem.construirTxt("ola (DURACAO LONGA)", Mensagem.DURACAO_LONGA)
    Mensagem.construirTxt("tudo bem", Mensagem.DURACAO_CURTA)
*/
/*    Criação de instâncias: Dentro da função main(),
    nós agora estamos armazenando os resultados de Mensagem.construirTxt() em variáveis (mensagem1 e mensagem2).
    Essas variáveis são instâncias da classe Mensagem.
    Chamada de exibir() na instância: Em vez de chamar Mensagem.exibir(),
    que tenta acessar uma propriedade em um contexto estático (o companion object), nós chamamos mensagem1.exibir() e mensagem2.exibir().
    Isso faz com que a função exibir() seja executada no contexto de cada objeto Mensagem específico,
    permitindo que this.mensagem acesse a propriedade mensagem daquela instância.*/

}