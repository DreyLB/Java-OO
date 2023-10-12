package br.com.boamorte;

import java.util.ArrayList;

public class Cliente {
    private String nomeCliente;
    private int idade;
    private int matricula = 1;
    private int qtDependente = 0;
    private ArrayList<Dependente> dependente = new ArrayList<>();

    public Cliente(String nome, int idade) {
        this.nomeCliente = nome;
        this.idade = idade;
        if (nome == null || nome == "") {
            this.nomeCliente = "(sem nome)";
        }

        if (idade < 0) {
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
        if (this.dependente.size() == 3) {
            return false;
        }

        for (int c = 0; c < this.dependente.size(); c++) {
            if (this.dependente.get(c).getNome() == dep1.getNome()) {
                return false;
            }
        }
        this.qtDependente++;
        this.dependente.add(dep1);

        return true;
    }

    public double getValorMensalidade() {
        double valor = 0.0;

        if (idade <= 30) {
            valor = 500.00;
        } else if (idade <= 40) {
            valor = 600.00;
        } else if (idade <= 60) {
            valor = 700.00;
        } else {
            valor = 1500.00;
        }

        for (int i = 0; i < this.dependente.size(); i++) {
            if (this.dependente.get(i).getIdade() <= 15) {
                valor += 250;
            } else if (this.dependente.get(i).getIdade() <= 30) {
                valor += 300;
            } else if (this.dependente.get(i).getIdade() <= 45) {
                valor += 350;
            }
        }

        return valor;

    }
}