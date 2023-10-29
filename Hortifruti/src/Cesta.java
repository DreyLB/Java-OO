import java.util.ArrayList;

public class Cesta {
    private ArrayList<Produto> produtos;
    private int qtdProduto=0;
    public void adicionarItem(Produto item){

        int somatorio = this.qtdProduto + item.getQtde();

        if (this.qtdProduto<12 && item.getQtde()<12 && somatorio<12){

            for (int i=0; i < item.getQtde(); i++){
                produtos.add(item);
            }

            qtdProduto++;

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
        Produto[] aux = new Produto[7];



    }
}
