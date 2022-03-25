package com.company;

import java.util.Date;

public class Pessoa {

        private String nome;
        private Date dataNascimento;
        private int idade;

    public void fazeraniversario() {
        this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento(Date dataNascimento) {
        return this.dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = this.dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

