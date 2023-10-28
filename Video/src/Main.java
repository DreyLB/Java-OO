public class Main {
    public static void main(String[] args) {
        Video[] v = new Video[3];

        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Usuario[] g = new Usuario[2];
        g[0] = new Usuario("Nericson", 22, "Masculino", "Neloca");
        g[1] = new Usuario("Merlinda", 23, "Feminino", "Mel");

        Visualizacao vis = new Visualizacao(g[0], v[2]);
        vis.avaliar(76.0);
        System.out.println(vis.toString());

    }
}