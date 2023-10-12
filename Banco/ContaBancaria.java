class ContaBancaria implements Conta {

    public int numConta;
    protected int tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public void abrirConta(String nome, int tipo) {
        this.dono = nome;
        if (tipo == 1) {
            this.tipo = tipo;
            this.saldo = 0;
        } else if (tipo == 2) {
            this.saldo = 50;
        }
        this.status = true;
        System.out.println("Seja bem-vindo ao Banco Java, " + this.dono);
    }

    public void fecharConta() {
        this.status = false;
    }

    public void depositar(double valor) {
        if (this.status == false) {
            System.out.println("A conta esta fechada");
            return;
        }
        this.saldo += valor;

    }

    public void sacar(double saque) {
        if ((this.saldo - saque) > 0) {
            this.saldo -= saque;

        } else {
            if (this.tipo == 1) {
                this.saldo -= saque;
                System.out.println("Você utilizou R$" + this.saldo + "do Cheque Especial");
            } else {
                System.out.println("Não foi possível realizar o saque.");
            }
        }

    }

    public void pagarMensal() {

    }

}