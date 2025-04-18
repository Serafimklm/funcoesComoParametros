package com.example.funcoescomoparametros.teste

class Motorista (val nome: String, val idade: Int){
    fun exibirdadosMotorista()= println("Driver name: $nome - Age: $idade")

//    a classe anihada funciona de forma independente, mas precisar ser acessada a partir da clase que engloba ela
//---------------------CLASS ANINHADA A CLASSE MOTORISTA--------------------------------------------------------------------------------
    class CarroEletrico(val model: String, val batteryCapacity: Int){
        fun exibirDadosCarroEletrico() = println("Model: $model - Battery Capacity: $batteryCapacity")
    }
//---------------------CLASS ANINHADA A CLASSE MOTORISTA--------------------------------------------------------------------------------

//--------------------INER CLASS A CLASSE MOTORISTA-------------------------------------------------------------------------------------
    inner class Caminhao(val modeloCaminhao: String, val tamanhoTanque: Int){
        fun exibirDadosCaminhao() = println("Caminhao: $modeloCaminhao - Tanque: $tamanhoTanque motorista $nome")
    }
    // repare que a iner clase consegue acessar diretamente dados dentro dos parametros da funcao na classe motorista
//--------------------INER CLASS A CLASSE MOTORISTA-------------------------------------------------------------------------------------
}


fun main() {

    val motorista = Motorista("carlos", 30)
    motorista.exibirdadosMotorista()

    val carroEletrico = Motorista.CarroEletrico("Tesla", 100) // como a classe carro eletrico esta anihada a classe motorista, ela precisa ser instanciada primeiro Carr
    carroEletrico.exibirDadosCarroEletrico() //

    val caminhao = motorista.Caminhao("Volvo", 1000) // nesse caso, como ela tem acesso a funcao motorista e foi chamado o nome linah 14,
    // ela tambem ira exibir o nome do motorista
    caminhao.exibirDadosCaminhao()
}