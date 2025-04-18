package com.example.funcoescomoparametros.ferramentasDeProjetos

//---------------------------------CLASS TOMADA ANTIGA----------------------------------------------
class TomadaAntiga(val conector: Conector) { // a classe TomadaAntiga recebe um objeto do tipo Conector (interface)

    fun passarEnergia() { // método que simula o funcionamento da tomada
        println("passando energia") // exibe que está passando energia

        val qtdPinos = conector.quantidadeDePinos() // chama o método da interface para verificar a quantidade de pinos

        if (qtdPinos == 2) { // se tiver 2 pinos, é compatível com a tomada antiga
            conector.ligarAparelho(); // liga o aparelho
            println("quantidade de pinos: $qtdPinos"); // mostra a quantidade de pinos usada
        } else {
            println("essa tomada so funciona com 2 pinos, voce usou uma diferente") // caso tenha mais de 2 pinos
        }
    }
}

//---------------------------------INTERFACE CONECTOR-----------------------------------------------
interface Conector {
    fun quantidadeDePinos(): Int // método que retorna a quantidade de pinos do conector
    fun ligarAparelho() // método para ligar o aparelho
}

//---------------------------------------CONECTOR ADAPTADOR----------------------------------------
// o conector adaptador implementa a interface Conector

class ConectorAdaptador(val conectorNovoPadrao: ConectorNovoPadrao) : Conector {
    // esse adaptador é responsável por "traduzir" o novo padrão para o padrão antigo

    override fun quantidadeDePinos(): Int {
        return 2; // força a quantidade de pinos para 2, mesmo que o novo padrão tenha 3
    }

    override fun ligarAparelho() {
        conectorNovoPadrao.ligarAparelho(); // delega a ligação do aparelho para o conector novo padrão
    }
}

//---------------------------------CLASS CONECTOR NOVO PADRAO---------------------------------------
class ConectorNovoPadrao : Conector { // implementa a interface Conector

    override fun quantidadeDePinos(): Int {
        return 3; // o novo padrão tem 3 pinos
    }

    override fun ligarAparelho() {
        println("aparelho esta ligado") // imprime que o aparelho foi ligado
    }
}

//--------------------------------METODO PRINCIPAL---------------------------------------------------
fun main() {
    val conectorNovoPadrao = ConectorNovoPadrao() // cria um objeto do tipo ConectorNovoPadrao
    val conectorAdaptador = ConectorAdaptador(conectorNovoPadrao); // passa o novo conector para o adaptador
    val tomadaAntiga = TomadaAntiga(conectorAdaptador); // conecta o adaptador na tomada antiga
    tomadaAntiga.passarEnergia(); // tenta passar energia pela tomada antiga usando o adaptador
}

// O código simula o uso de um adaptador para conectar um conector moderno (3 pinos) em uma tomada antiga (2 pinos).

// A interface Conector define como um conector deve funcionar (métodos: quantidadeDePinos e ligarAparelho)

// ConectorNovoPadrao implementa essa interface com 3 pinos, então ele normalmente **não funcionaria** na TomadaAntiga.

// O ConectorAdaptador "adapta" esse novo padrão para funcionar na tomada antiga, dizendo que tem 2 pinos e redirecionando a ligação.

// A TomadaAntiga só funciona com conectores de 2 pinos, então graças ao adaptador, ela aceita o novo padrão e liga o aparelho.
