public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();

        System.out.println("Mamífero\n");
        m.setPeso(5.7);
        m.setIdade(8);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println("===========================\n");

        System.out.println("Canguru\n");
        c.setPeso(55.3);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();
        System.out.println("===========================\n");

        System.out.println("Cachorro\n");
        k.setPeso(3.94);
        k.setIdade(5);
        k.setMembros(4);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.abanarRabo();
        System.out.println("===========================\n");
    }
}