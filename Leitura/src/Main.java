
public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("As Espiãs do dia D", "Ken Follet", 320);
        Pessoa leitor = new Pessoa("Andrey", 21, "Masculino");
        livro.setLeitor(leitor);
        livro.abrir();
        livro.folhear(154);
        for (int i=0; i<10; i++){
            livro.avancarPag();
        }
        livro.voltarPag();
        System.out.println("\n\n=====================================\n");
        livro.status();
        System.out.println("\n=====================================\n\n");
        System.out.println("\n\n=====================================\n");
        leitor.apresentar();
        System.out.println("\n=====================================\n\n");
        leitor.felizAniver();
        System.out.println("\n\n=====================================\n");
        leitor.apresentar();
        System.out.println("\n=====================================\n\n");
        for (int i=0; i<100; i++){
            livro.avancarPag();
        }
        System.out.println("\n\n=====================================\n");
        livro.status();
        System.out.println("\n=====================================\n\n");
    }
}