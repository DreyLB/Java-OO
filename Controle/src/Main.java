public class Main {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();
        controle.ligar();
        controle.desligar();
        controle.play();
        controle.maisVolume();
        controle.ligar();
        controle.ligarMudo();
        controle.abrirMenu();
        controle.desligarMudo();
        controle.menosVolume();
        controle.pause();
        controle.abrirMenu();
    }
}