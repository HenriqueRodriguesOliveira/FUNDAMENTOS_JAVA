package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.cpf = "33322211";
        pessoa1.nome = "Henrique";
        pessoa1.idade = 24;

        System.out.println(pessoa1.imprimirDadosDaPessoa());

        Pessoa pessoa2 = new Pessoa();
        pessoa2.cpf = "11155588814";
        pessoa2.nome = "Henrique";
        pessoa2.idade = 24;

        System.out.println(pessoa2.imprimirDadosDaPessoa());
    }
}
