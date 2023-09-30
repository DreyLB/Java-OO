package br.com.boamorte;

public class Dependente {

    String nome;
    int idade;


    public Dependente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;

    }
}
