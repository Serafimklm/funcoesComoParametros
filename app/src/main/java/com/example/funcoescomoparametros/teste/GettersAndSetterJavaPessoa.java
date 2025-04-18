package com.example.funcoescomoparametros.teste;

public class GettersAndSetterJavaPessoa {

   private String nome =  "Carlos";

  private  int idade = 0;

    public String getNome() {

        return nome.toUpperCase();
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
