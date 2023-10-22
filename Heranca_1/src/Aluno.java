public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public void status(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Curso: " + getCurso());
    }
    public void cancelarMatricula(){
        System.out.println("Matricula Cancelada");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
