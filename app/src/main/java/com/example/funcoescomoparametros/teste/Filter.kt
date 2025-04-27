package com.example.funcoescomoparametros.teste



// em filter e possivel fazer diversos tipos de comparacao entre item, como maior, menor, maior que, menor que
//comeca com determinada letra ou numero etc
// vale lembrar que esse tipo de funcionalidade 'e caseSensitive
fun main() {

    println("==================filtrando por nome============================")
    val listaFrutas = listOf("Maca", "laranja", "banana")

    val novaLIsta = listaFrutas.filter { fruta ->
        fruta == "laranja" // se a regra do filter for ingual a TRUE, ele vai retornar o item da lista
    }
    println(novaLIsta)       // retornando o item verdadeiro da novaLIsta

//==================filtrando por quantidade de letras===========================
    println("==================filtrando por quantidade de letras MAIOR QUE 4============================")
    val novaLista = listaFrutas.filter { fruta ->
        fruta.length > 4 // frutas com mais de 4 letras
    }
    println(novaLista)
//----------------------lista valores maiores----------------------------------------
    println("==================filtrando por valores maiores que 600===========================")
    val listaVendas = listOf(1000.0, 500.0, 800.0, 1200.0, 599.9)
    val novaListaVendas = listaVendas.filter { venda ->
        venda >= 600.0
    }
    println( novaListaVendas)
//----------------------lista nomes iniciados em---------------------------------------
    println("==================filtrando por nomes iniciados em C===========================")
    val listaNomes = listOf("Josef", "Carlos", "Maria", "Joao", "Caciano")
    val ListaComC = listaNomes.filter { nome ->
        nome.startsWith("C")
        }
    println("Lista com nomes iniciados em C: $ListaComC")

// ===================lista nomes com a letra A========================================
    println("==================filtrando por nomes com a letra A===========================")
    var listaNomesComA = listaNomes.filter { name ->
        name.contains("a")
    }
    println("Lista com nomes que contem a letra A: $listaNomesComA")
    }
