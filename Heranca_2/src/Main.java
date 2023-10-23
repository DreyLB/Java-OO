public class Main {
    public static void main(String[] args) {
        Visitante p1 = new Visitante();
        Aluno p2 = new Aluno();
        Tecnica p3 = new Tecnica();
        Bolsista p4 = new Bolsista();
        Professor p5 = new Professor();

        p1.setNome("Roberto");
        p1.setIdade(21);
        p1.setSexo("Masculino");

        p2.setNome("João");
        p2.setIdade(21);
        p2.setSexo("Masculino");
        p2.setCurso("Analise e Desenvolvimento de Sistemas");

        p3.setNome("Joana");
        p3.setIdade(23);
        p3.setSexo("Feminino");
        p3.setRegistroProfissional(159753852);
        p3.setCurso("Analista de Sistemas");
        p3.setMatricula(222000555);

        p4.setNome("Michael");
        p4.setIdade(21);
        p4.setSexo("Masculino");
        p4.setBolsa(2000);
        p4.setCurso("Analise e Desenvolvimento de Sistemas");
        p4.setMatricula(111000444);

        p5.setNome("Paulo");
        p5.setIdade(45);
        p5.setSexo("Masculino");
        p5.setEspecialidade("Gerenciamento de Equipe");
        p5.setSalario(5000.0);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        
    }
}