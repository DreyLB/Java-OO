package br.com.boamorte;

public class Cliente {
    String nomeCliente;
    int idade;
    private int matricula=0;
    int qtDependente=0;


    public Cliente(String nome, int idade) {
        this.nomeCliente = nome;
        this.idade = idade;
        matricula = matricula+1;


        if (nome == null || nome == ""){
            this.nomeCliente = "(sem nome)";
        }
        if (idade <= 0){
            this.idade = 66;
        }
    }


    public String getNome() {
        return this.nomeCliente;
    }


    public int getIdade() {
        return this.idade;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public int getQtdeDependentes() {
        return this.qtDependente;
    }

    public boolean adicionarDependente(Dependente dep1) {
        qtDependente++;
        return false;
    }
}
