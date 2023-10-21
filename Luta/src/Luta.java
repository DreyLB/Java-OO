import java.util.Objects;
import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if(Objects.equals(l1.getCategoria(), l2.getCategoria()) && l1 != l2){
            aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }
        else {
            aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("\n### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("\n### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch (vencedor){
                case 0:
                    System.out.println("Empate!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitória! do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitória! do " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }

        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
}
