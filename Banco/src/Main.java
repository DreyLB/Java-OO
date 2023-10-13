public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1234);
        conta.abrirConta("Andrey", 2);
        conta.depositar(1450);
        conta.sacar(100);
        conta.status();
    }
}
