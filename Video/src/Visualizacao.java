public class Visualizacao {
    private Usuario espectador;
    private Video filme;
    public Visualizacao(Usuario espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(filme.getViews()+1);
    }
    public void avaliar(){
        System.out.println("Avaliado");
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        System.out.println("Avaliado com nota: " + nota);
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(double porc){
        int tot = 0;
        System.out.println("Avaliado com percentual: " + porc);
        if (porc <= 20){
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
        this.filme.setAvaliacao(filme.getAvaliacao()+1);
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ",\nfilme=" + filme +
                '}';
    }
}
