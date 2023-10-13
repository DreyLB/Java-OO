package contaBancaria;

public class banco {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(1234);
        conta.abrirConta("Andrey", 1);
        conta.status();

    }
}
