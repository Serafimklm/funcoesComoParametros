package com.example.funcoescomoparametros.teste;

import static java.sql.DriverManager.println;

import android.annotation.SuppressLint;

public class VarargsClassePessoa {

    private String nome = "";
    private int idade = 0;


    @SuppressLint("SuspiciousIndentation")
    public void salvarTelefone(String...telefones){ // primeiro metodo da classe acima// como apos o tipo de dado tem <...> significa que
//                                                    ele pode receber varios parametros, no caso, varios telefones, na classe Varargs em kotlin
        for (String telefone : telefones)
        System.out.println("LISTA TELEFONES JAVA " + telefone);

        }
    public String getNome(){
        return nome.toUpperCase();
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}
