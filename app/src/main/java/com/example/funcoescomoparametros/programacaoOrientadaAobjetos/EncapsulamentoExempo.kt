package com.example.funcoescomoparametros.programacaoOrientadaAobjetos

//Encapsulamento
//Atributos _senha e _mensagens são privados (protegidos).
//Métodos públicos (desbloquear(), adicionarMensagem()) controlam o acesso.

// ========== CLASSE PRINCIPAL ==========
// ENCAPSULAMENTO: Protege os dados internos do objeto
class Celular(private val dono: String) {  // 'dono' é privado (só acessível dentro da classe)

    // --- ATRIBUTOS PRIVADOS ---
    // POO: Encapsulamento = esconder o estado interno
    private var _senha: String = "1234"  // Atributo privado (não pode ser acessado fora da classe)
    private var _mensagens = mutableListOf("Oi!")  // Histórico oculto

    // --- MÉTODOS PÚBLICOS (interface controlada) ---
    // POO: Comportamentos expostos de forma segura
    fun desbloquear(senhaDigitada: String): Boolean {
        if (senhaDigitada == _senha) {
            println("Celular desbloqueado para $dono!")  // Saída (sout)
            return true
        }
        println("Senha incorreta!")  // Saída (sout)
        return false
    }

    fun adicionarMensagem(mensagem: String) {
        _mensagens.add(mensagem)
        println("Mensagem adicionada.")  // Saída (sout)
    }

    // --- GETTER SEGURO ---
    // POO: Expõe dados sem permitir modificação direta
    val mensagens: List<String>
        get() = _mensagens.toList()  // Retorna cópia (imutável)

    // --- SETTER CONTROLADO ---
    // POO: Validação antes de modificar um atributo privado
    fun alterarSenha(novaSenha: String, senhaAntiga: String) {
        if (senhaAntiga == _senha) {
            _senha = novaSenha
            println("Senha alterada com sucesso!")  // Saída (sout)
        } else {
            println("Senha antiga incorreta!")  // Saída (sout)
        }
    }
}

// ========== PROGRAMA PRINCIPAL ==========
fun main() {
    // Criando um objeto Celular
    val meuCelular = Celular("Ana")

    // --- INTERAÇÃO SEGURA (via métodos públicos) ---
    // POO: O usuário não acessa os atributos diretamente
    meuCelular.desbloquear("1111")  // Saída: "Senha incorreta!"
    meuCelular.desbloquear("1234")  // Saída: "Celular desbloqueado para Ana!"

    meuCelular.adicionarMensagem("Tudo bem?")  // Saída: "Mensagem adicionada."

    // --- TENTATIVA DE ACESSO ILEGAL (comentada) ---
    // meuCelular._senha = "0000"  // ERRO! Atributo privado
    // println(meuCelular._mensagens)  // ERRO! Atributo privado

    // --- ACESSO VIA GETTER ---
    println("Mensagens: ${meuCelular.mensagens}")  // Saída: Mensagens: [Oi!, Tudo bem?]

    // --- ALTERAÇÃO CONTROLADA ---
    meuCelular.alterarSenha("4321", "1234")  // Saída: "Senha alterada com sucesso!"
}

//Comentários sobre POO no Código
//
//Encapsulamento
//
//Atributos _senha e _mensagens são privados (protegidos).
//
//Métodos públicos (desbloquear(), adicionarMensagem()) controlam o acesso.
//
//Abstração
//
//O usuário não precisa saber como as mensagens são armazenadas ou como a senha é validada.
//
//Getters/Setters
//
//mensagens expõe uma cópia imutável da lista (segurança).
//
//alterarSenha() valida a senha antiga antes de modificar.
//
//Vantagens
//
//Segurança: Ninguém pode alterar a senha sem validação.
//
//Controle: Mensagens só são adicionadas via método dedicado.
//
//Manutenção: Se a lógica interna mudar, o código que usa a classe não quebra.
//
//Como Estender para Outros Pilares
//
//Herança: Criar class CelularPremium : Celular() com recursos extras.
//
//Polimorfismo: Usar Celular como tipo genérico em funções.
//
//Pronto! Esse é um exemplo prático de encapsulamento em Kotlin com foco em POO. 🛡️📱