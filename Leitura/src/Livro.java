public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas){
        setTitulo(titulo);
        setAutor(autor);
        setTotPaginas(totPaginas);
        setPagAtual(0);
        setAberto(false);
        setLeitor(null);
    }
    public void status(){
        System.out.println("O livro: " + getTitulo());
        System.out.println("Do autor: " + getAutor());
        System.out.println("Com " + getTotPaginas() + " páginas");
        if (aberto){
            System.out.println("Está aberto na página: " + getPagAtual());
        }
        else {
            System.out.println("Está fechado");
        }
        if (leitor!=null){
            System.out.println("Com o leitor: " + this.leitor.getNome());
        }
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        if (!this.aberto){
            this.aberto = aberto;
        }
        else {
            System.out.println("O livro já está aberto");
        }
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        setAberto(true);
        setPagAtual(1);
    }

    @Override
    public void fechar() {
        setAberto(false);
    }

    @Override
    public void folhear(int pag) {
        if (leitor!=null){
            System.out.println(this.leitor.getNome() + " está folheando o livro " + getTitulo());
        }
        else {
            System.out.println("Não há leitor para folhear");
        }
    }

    @Override
    public void avancarPag() {
        if (getPagAtual() < getTotPaginas()){
            setPagAtual(getPagAtual()+1);
        }
        else {
            System.out.println("Já está na ultima pagina");
        }
    }

    @Override
    public void voltarPag() {
        if (getPagAtual() > 0){
            setPagAtual(getPagAtual()-1);
        }
        else {
            System.out.println("O livro está na primeira página");
        }
    }
}
