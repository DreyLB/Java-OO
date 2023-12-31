public class ContaBancaria implements Conta {
    private final int numConta;
    protected int tipo;
    private String dono;
    private double saldo;
    private boolean status;

    ContaBancaria(int numConta) {
        this.numConta = numConta;
    }

    public void abrirConta(String nome, int tipo) {
        this.dono = nome;
        if (tipo == 1) { // 1 contaBancaria.Conta corrente - 2 contaBancaria.Conta poupança
            this.tipo = tipo;
            this.saldo = 50.00;
        } else if (tipo == 2) {
            this.saldo = 150.00;
        }
        this.status = true;
        System.out.println("Seja bem-vindo ao Banco Java, " + this.dono);
    }

    public void fecharConta() {
        if (this.saldo != 0){
            System.out.println("Não foi possível realizar a operação");
        }
        else {
            System.out.println("\nConta Bancaria " + this.numConta + " encerrada\n");
            this.status = false;
        }
    }

    public void depositar(double valor) {
        if (!this.status) {
            System.out.println("A conta esta fechada");
            return;
        }
        this.saldo += valor;

    }

    public void sacar(double saque) {
        if (!this.status) {
            System.out.println("A conta esta fechada");
            return;
        }else {
            if ((this.saldo - saque) >= 0.0) {
                this.saldo -= saque;

            } else {
                if (this.tipo == 1) {
                    this.saldo -= saque;
                    System.out.println("Você utilizou R$" + this.saldo + "do Cheque Especial");
                } else {
                    System.out.println("contaBancaria.Conta poupança não tem Cheque Especial");
                }
            }
        }
    }

    public void pagarMensal() {
        if(this.status){
            if(this.tipo == 1){
                this.saldo -= 12.0;
            }
            else {
                this.saldo -= 20.0;
            }
        }
    }

    public void status(){
        System.out.println("Numero da conta: " + this.numConta);

        if (this.tipo == 1){
            System.out.println("Tipo da conta: Corrente");

        }
        else if (this.tipo == 2){
            System.out.println("Tipo da conta: Poupança");
        }

        System.out.println("Dono: " + this.dono);

        System.out.println("Saldo: R$" + this.saldo);

        if(this.status){
            System.out.println("Status: Aberta");
        }
        else {
            System.out.println("Status: Fechada");

        }
    }
}
