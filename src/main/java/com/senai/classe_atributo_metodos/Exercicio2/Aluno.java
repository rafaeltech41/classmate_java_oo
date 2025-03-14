package com.senai.classe_atributo_metodos.Exercicio2;

import java.util.Objects;
import java.util.Scanner;

public class Aluno {
    String nome;
    int idade;
    float nota;

    public Aluno(String nome, int idade, float nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public String exibirInformacoes() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", nota=" + nota +
                '}';
    }

    public void atualizaNota(float novaNota){
        System.out.println("nota atual do Aluno "+nota);
        nota = novaNota;
        System.out.println("nota atualizada Aluno "+nota);
    }


    public boolean equals() {

        return nota >= 6;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nota);
    }
}
