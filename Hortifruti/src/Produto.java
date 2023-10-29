public abstract class Produto {

    private int qtde = 0;

    public abstract double getPreco();

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
}
