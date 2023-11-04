import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;

public class Cesta {
    private final ArrayList<Produto> produtos;
    private int qtdProduto=0;

    public Cesta() {
        produtos = new ArrayList<>();
    }

    public void adicionarItem(Produto item){

        int somatorio = this.qtdProduto + item.getQtde();

        if (this.qtdProduto<12 && item.getQtde()<=12 && somatorio<=12){

            for (int i=0; i < item.getQtde(); i++){
                produtos.add(item);
            }

            qtdProduto += somatorio;

        } else {
            System.out.println("A cesta está cheia, não é possível adicionar mais produtos.");
        }
    }

    public double calcularTotal(){
        double sumTotal=0;

        for (Produto produto : produtos){
            sumTotal += produto.getPreco();
        }

        return sumTotal;
    }

    public void listarCesta(){
        int[] aux = {0,0,0,0,0,0,0};
        String[] nomeAux = {"Banana", "Limão", "Maçã", "Mamão", "Morango", "Pêra", "Uva"};


        for (Produto produto : this.produtos) {
            if (Objects.equals(produto.getNome(), nomeAux[0])) {
                aux[0]++;
            } else if(Objects.equals(produto.getNome(), nomeAux[1])){
                aux[1]++;
            } else if(Objects.equals(produto.getNome(), nomeAux[2])){
                aux[2]++;
            } else if(Objects.equals(produto.getNome(), nomeAux[3])){
                aux[3]++;
            } else if(Objects.equals(produto.getNome(), nomeAux[4])){
                aux[4]++;
            } else if(Objects.equals(produto.getNome(), nomeAux[5])){
                aux[5]++;
            } else if(Objects.equals(produto.getNome(), nomeAux[6])){
                aux[6]++;
            }
        }
        System.out.println("\n===================================");
        System.out.println("Lista de Produtos:\n");
        for (int i=0; i<7; i++){
            if (aux[i] > 0 ){
                System.out.println(aux[i] + " - " + nomeAux[i]);
            }
        }
//        BigDecimal valor = BigDecimal.valueOf(calcularTotal());
//        valor.setScale(2);


        System.out.print("Total: R$ ");
        arredondar(calcularTotal());

        System.out.println("===================================\n");
    }

    public void limparCesta() {
        produtos.clear();
        qtdProduto = 0;
    }

    private static void arredondar(Double valor) {
        System.out.println( new DecimalFormat("#,##0.00").format(valor) );
    }
}
