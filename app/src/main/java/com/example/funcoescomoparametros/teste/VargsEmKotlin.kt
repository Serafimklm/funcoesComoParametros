package com.example.funcoescomoparametros.teste

import android.annotation.SuppressLint


//===================VARARG EM KOTLIN========================
class User{
    fun savePhoneNumber(vararg phones : String) {
        for (phone in phones) {
            println("lista phone kotlin $phone")
        }
    }

}

//===================VARARG EM KOTLIN========================

@SuppressLint("SuspiciousIndentation")
fun main() {

    val pessoa = VarargsClassePessoa()
    pessoa.salvarTelefone(
        "7498233203",
        "7498233203",
        "5435345345",
        "4534534534",
        "2234532545"
    )


    val user = User()
    user.savePhoneNumber(
        "7498233203",
        "7498233203",
        "5435345345",
        "4534534534",
        "2234532545"

    )
}