package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf("148481818");
        professor.setNome("Henrique");
        professor.setIdade(24);
        professor.setSalario(50000);
        System.out.println(professor.imprimirDadosDaPessoa());

        Aluno aluno = new Aluno();
        aluno.setCpf("655411511");
        aluno.setIdade(25);
        aluno.setNome("Fernanda");
        aluno.setMatricula("84848");
        System.out.println(aluno.imprimirDadosDaPessoa());
    }
}
