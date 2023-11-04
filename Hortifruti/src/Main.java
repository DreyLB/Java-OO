import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cesta cesta = new Cesta();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Colocar produto na cesta");
            System.out.println("2. Mostrar conteúdo da cesta e valor total");
            System.out.println("3. Limpar a cesta");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o tipo do produto: ");
                    String tipoProduto = scanner.next().toLowerCase();


                    Produto produto;
                    if (tipoProduto.equals("banana")) {
                        produto = new Banana();
                    } else if (tipoProduto.equals("maçã")) {
                        produto = new Maca();
                    } else if (tipoProduto.equals("limão")) {
                        produto = new Limao();
                    }else if (tipoProduto.equals("mamão")) {
                        produto = new Mamao();
                    }else if (tipoProduto.equals("morango")) {
                        produto = new Morango();
                    }else if (tipoProduto.equals("pera")) {
                        produto = new Pera();
                    }else if (tipoProduto.equals("uva")) {
                        produto = new Uva();
                    } else {
                        System.out.println("Tipo de produto inválido.");
                        continue;
                    }

                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    produto.setQtde(quantidade);

                    cesta.adicionarItem(produto);
                    break;
                case 2:
                    cesta.listarCesta();
                    break;
                case 3:
                    cesta.limparCesta();
                    break;
                case 0:
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
    }
}