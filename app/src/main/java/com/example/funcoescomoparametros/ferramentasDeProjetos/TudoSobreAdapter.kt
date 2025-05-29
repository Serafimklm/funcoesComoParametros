package com.example.funcoescomoparametros.ferramentasDeProjetos

/*
* Interface que define o contrato para qualquer adaptador que queira trabalhar
* com o ComponenteListagem. Ela estabelece os métodos que devem ser implementados.
*/
interface Adaptador {

    /*
    * Método que deve retornar o total de itens a serem exibidos na listagem
    */
    fun quantidadeItens() : Int

    /*
    * Método que recebe uma posição e retorna uma string formatada
    * representando como aquele item deve ser exibido
    */
    fun montarLayoutParaItem(posicaLayout: Int) : String // metodo vai receber uma posicão do tipo int e vai retornar uma string
}

/*
* Classe que representa um componente de listagem genérico.
* Ela depende de um Adaptador para saber:
* 1. Quantos itens existem para listar
* 2. Como cada item deve ser formatado para exibição
*/
class ComponenteListagem {

    // Armazena o adaptador que será usado para obter os dados
    var adaptador: Adaptador? = null // variavel adaptador, vai receber objetos do tipo Adaptador

    // Método principal que executa a listagem
    fun executar(){  // metodo que vai realizar a ação de contar


        if( adaptador != null ){
            // A variavel abaixo Obtém a quantidade total de itens do adaptador
            // Declara uma variável chamada 'quantidadeItens' e atribui a ela o valor retornado
            // pelo metodo 'quantidadeItens()' do objeto 'adaptador'.
            // O operador '!!' é usado para forçar que 'adaptador' não seja nulo,
            // ou seja, assume-se que 'adaptador' não é nulo e, se for, lançará uma exceção
            val quantidadeItens = adaptador!!.quantidadeItens()
//            'quantidadeItens()' com os parênteses é o METODO que é chamado para
//            obter o valor. Já 'quantidadeItens' sem os parênteses é a VARIAVEL que
//            armazena o valor retornado pelo METODO. Então um é o METODO que faz o
//            cálculo e o outro é a variável que guarda o resultado.

                // Itera por todas as posições da lista
            for ( posicao in 0 until quantidadeItens){

                // Obtém a representação em string do item na posição atual
//                VARIAVEL item recebe o valor retornado pelo metodo 'montarLayoutParaItem'
//                que por sua vez recebe uma posicao especifica e posteriormente passa tudo para variavel item
                val item = adaptador!!.montarLayoutParaItem(posicao)
                // Imprime o item formatado
                println( item )
            }

        }else{
            println("Configura um adaptador para prosseguir")
        }
    }
}

/*
* Implementação concreta do Adaptador para trabalhar com uma lista de Pacientes
*/
class MeuAdaptador(

    // list: List<Paciente> - Parâmetro do construtor:
    // - 'list' é o nome do parâmetro
    // - 'List<Paciente>' é o tipo do parâmetro, que significa:
    //   - Uma List (lista) genérica
    //   - Onde cada elemento da lista é do tipo Paciente
    // - Esse parâmetro receberá a lista de pacientes que será usada pelo adaptado
    list: List<Paciente>

    // Os dois pontos (:) indicam que esta classe implementa a interface Adaptador
    // Isso significa que a classe MeuAdaptador deve implementar os metodos dessa interface
) : Adaptador {


    // Campo privado que armazena a lista de pacientes recebida no construtor
    // - 'private' significa que só pode ser acessado dentro desta classe
    // - 'val' torna imutável (não pode ser reatribuído depois da inicialização)
    // - 'listaItens' é o nome do campo
    // - Recebe o valor do parâmetro 'list' do construtor
    private val listaItens = list


    // Implementação do metodo quantidadeItens() da interface Adaptador
    // - 'override' indica que estamos sobrescrevendo um metodo da interface
    // - Deve retornar um Int (número inteiro)
    override fun quantidadeItens(): Int {
        // Retorna o tamanho (quantidade de elementos) da listaItens
        // - listaItens.size acessa a propriedade size da List, que contém o número de elementos
        return listaItens.size;
    }


    // Implementação do metodo montarLayoutParaItem() da interface Adaptador
    // - Recebe um parâmetro 'posicao' do tipo Int (número inteiro)
    // - Deve retornar uma String (texto formatado)
    override fun montarLayoutParaItem(posicao: Int): String {
        // Obtém o paciente na posição especificada da lista
        // - listaItens[posicao] acessa o elemento na posição dada
        val paciente = listaItens[posicao]

         // Retorna uma string formatada com os dados do paciente:
        // - Usa template strings (${}) para interpolar valores
        // - Cada linha mostra uma propriedade diferente do paciente
        // - \n insere quebras de linha
        // funcao montar layout para item esta usando os dados do paciente da dataclass, para montar
        // string de retorno e mostar as informacoes do paciente
        return "$posicao)"+
                "NOME ${paciente.nome}\n"+
                "IDADE ${paciente.idade}\n"+
                "PESO ${paciente.peso}kg\n"+
                "ALTURA ${paciente.altura}\n"+
                "CPF: ${paciente.cpf}\n";
    }
}

// Classe de dados que representa um Paciente com suas propriedades
// A palavra-chave 'data' indica que é uma data class, o que automaticamente gera:
// - equals()/hashCode()
// - toString() formatado
// - funções copy() e componentN()
data class Paciente(
    // Propriedade que armazena o nome do paciente (String)
    val nome: String,
    // Propriedade que armazena a idade do paciente (Int)
    val idade: Int,
    // Propriedade que armazena o peso do paciente em kg (Double)
    val peso: Double,
    // Propriedade que armazena a altura do paciente em metros (Double)
    val altura: Double,
    // Propriedade que armazena o CPF do paciente (String)
    val cpf: String,
)

// Função principal que é o ponto de entrada do programa
fun main() {
    // Cria uma lista de pacientes com um único paciente de exemplo usando listOf()
    // listOf() é uma função padrão do Kotlin que cria uma lista imutável
    val listaItens = listOf(
        Paciente(
            "João",
            30,
            70.0,
            1.75,
            "123.456.789-00")
    )


    // Cria uma instância do componente de listagem
    // ComponenteListagem() é o construtor que cria um novo objeto vazio
    val componenteListagem = ComponenteListagem()

    // Configura o adaptador do componente com nossa implementação específica para pacientes
    // MeuAdaptador(listaItens) cria um adaptador passando a lista de pacientes
    // e atribui esse adaptador à propriedade adaptador do ComponenteListagem
    componenteListagem.adaptador = MeuAdaptador(listaItens)

    // Executa a listagem chamando o metodo executar() do ComponenteListagem
    // Isso fará com que o componente:
    // 1. Verifique se há um adaptador configurado
    // 2. Obtenha a quantidade de itens
    componenteListagem.executar()
}
