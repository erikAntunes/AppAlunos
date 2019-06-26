package com.example.alunosapp.model;

public class Aluno {

private String nome;
private String curso;
private String cidade;
private int tempoDeCoding;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getTempoDeCoding() {
        return tempoDeCoding;
    }

    public void setTempoDeCoding(int tempoDeCoding) {
        this.tempoDeCoding = tempoDeCoding;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
