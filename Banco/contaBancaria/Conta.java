package contaBancaria;

interface Conta{

    public void abrirConta(String nome, int tipo);
    public void fecharConta();
    public void depositar(double valor);
    public void sacar(double saque);
    public void pagarMensal();
    public void status();

}