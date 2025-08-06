ClassesAninhadas.kt,
DataClass.kt,
EncadeamentoDeMetodos.kt, 
Funcoes.kt,
Funcoes de escopo2.kt, 
FuncoesLambda.kt, 
InterfaceKotlin.kt,
MainActivity1, 
MetodoOrdenacao.kt,
PairType.kt,
EscopoFuncao.kt,
UnionClasses.kt.


padrao adapter,
tudo sobre adapter,

# 📁 Arquivos Kotlin Organizados

## 🔤 A
- **A**dapter Pattern (`Adapter.kt`)  
  *Padrão de projeto para conversão de interfaces*

## 🅱️ B
*(Nenhum arquivo começa com B)*

## 🔠 C
- **C**lassesAninhadas.kt  
  *Demonstração de classes aninhadas e internas*
  
## 🅳 D
- **D**ataClass.kt  
  *Exemplos de data classes com equals(), hashCode(), toString() automáticos*

## 🅴 E
- **E**ncadeamentoDeMetodos.kt  
  *Method chaining com retorno `this`*
- **E**scopoFuncao.kt  
  *Funções let, run, with, apply, also*

## 🅵 F
- **F**uncoes.kt  
  *Funções básicas e extension functions*
- **F**uncoesLambda.kt  
  *Lambdas e higher-order functions*
- **F**uncoesDeEscopo2.kt  
  *Aprofundamento em funções de escopo*

## 🅸 I
- **I**nterfaceKotlin.kt  
  *Definição e implementação de interfaces*

## 🅼 M
- **M**ainActivity1  
  *Ponto de entrada da aplicação*
- **M**etodoOrdenacao.kt  
  *Algoritmos de ordenação (quicksort, bubble sort)*

## 🅿️ P
- **P**airType.kt  
  *Uso de Pair e Triple para tuplas*

## 🆄 U
- **U**nionClasses.kt  
  *Classes seladas e uniões de tipos*

# 📚 Tudo sobre Adapter Pattern

## 🔌 O que é?
Padrão estrutural que permite objetos com interfaces incompatíveis colaborarem.

## 🛠️ Implementação Básica
```kotlin
// Target (Interface esperada pelo cliente)
interface MediaPlayer {
    fun play(audioType: String, fileName: String)
}

// Adaptee (Interface existente)
class AdvancedMediaPlayer {
    fun playVlc(fileName: String) { /*...*/ }
    fun playMp4(fileName: String) { /*...*/ }
}

// Adapter
class MediaAdapter(
    private val advancedPlayer: AdvancedMediaPlayer
) : MediaPlayer {
    override fun play(audioType: String, fileName: String) {
        when (audioType) {
            "vlc" -> advancedPlayer.playVlc(fileName)
            "mp4" -> advancedPlayer.playMp4(fileName)
        }
    }
}
