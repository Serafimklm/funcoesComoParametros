package com.example.funcoescomoparametros.programacaoOrientadaAobjetos

// Acontece quando você usa um tipo genérico (como Animal) para se referir a objetos de tipos específicos (como Cachorro ou Gato).
// === CLASSE PRINCIPAL (Modelo de Conta Bancária) ===
// ENCAPSULAMENTO: Oculta detalhes internos e expõe apenas o necessário.
class ContaBancaria(private val titular: String) {

    // 'private' no construtor: só acessível dentro da classe

    // --- ATRIBUTOS PRIVADOS ---
    // ENCAPSULAMENTO: Propriedades protegidas contra acesso externo direto.
    private var _saldo: Double = 0.0  // Convenção: '_' indica propriedade privada
    private val _transacoes = mutableListOf<String>()  // Histórico interno

    // --- MÉTODOS PÚBLICOS (Interface controlada) ---
    // POO: Comportamentos expostos de forma segura.
    fun depositar(valor: Double) {
        if (valor > 0) {
            _saldo += valor
            _transacoes.add("Depósito: +$valor")  // Registro interno
            println("Depósito realizado para $titular.")
        } else {
            println("Valor inválido!")
        }
    }

    fun sacar(valor: Double): Boolean {
        if (valor <= _saldo) {
            _saldo -= valor
            _transacoes.add("Saque: -$valor")
            println("Saque autorizado para $titular.")
            return true
        }
        println("Saldo insuficiente!")
        return false
    }

    // --- GETTERS CONTROLADOS ---
    // ENCAPSULAMENTO: Expõe dados de forma segura (somente leitura).
    val saldo: Double  // Propriedade pública (apenas leitura)
        get() = _saldo

    fun extrato(): List<String> {  // Retorna cópia imutável do histórico
        return _transacoes.toList()
    }
}

// === FUNÇÃO MAIN (Uso da Classe) ===
fun main() {
    // Criando uma conta (instância da classe)
    val conta = ContaBancaria("João Silva")

    // --- INTERAÇÃO SEGURA (via métodos públicos) ---
    conta.depositar(500.0)  // Saída: "Depósito realizado para João Silva."
    conta.sacar(200.0)      // Saída: "Saque autorizado para João Silva."

    // Tentativa de acesso direto (PROIBIDO - encapsulamento em ação)
    // conta._saldo = 1000.0  // ERRO! '_saldo' é privado
    // conta._transacoes.clear()  // ERRO! '_transacoes' é privado

    // --- CONSULTA SEGURA (via getters) ---
    println("Saldo atual: ${conta.saldo}")  // Saída: "Saldo atual: 300.0"
    println("Extrato: ${conta.extrato()}")  // Saída: Extrato com depósito e saque
}

//Comentários Detalhados sobre POO
//1. Encapsulamento (Proteção de Dados)
//
//private var _saldo:
//
//        O saldo é armazenado como variável privada.
//
//Nenhum código externo pode modificá-lo diretamente (evita inconsistências).
//
//Métodos públicos (depositar(), sacar())
//
//Controlam como o saldo é alterado (ex: validações).
//
//Exemplo: sacar() só permite saques se houver saldo suficiente.
//
//Getter val saldo
//
//Expõe o saldo apenas para leitura (sem risco de modificação externa).
//
//2. Abstração (Ocultação de Complexidade)
//
//O usuário da classe não precisa saber como:
//
//O saldo é armazenado.
//
//As transações são registradas.
//
//Basta chamar depositar() ou sacar() e a classe gerencia internamente.
//
//3. Benefícios do Design
//
//Segurança: Ninguém pode "hackear" o saldo diretamente.
//
//Manutenção: Se a lógica de saque/depósito mudar, só afeta a classe.
//Flexibilidade: Pode-se adicionar novos recursos (ex: taxas) sem afeter quem usa a classe.