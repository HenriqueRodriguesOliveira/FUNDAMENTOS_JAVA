package revisao;

public class Pessoa {
    public static void main(String[] args) {
        App pessoa1 = new App();
        pessoa1.nome = "Henrique";
        pessoa1.cpf = "999.999.899-99";
        pessoa1.numero = 878458874;

        System.out.format("Meu nome é %s, meu cpf é %d. O número do meu cpf é %s", pessoa1.nome, pessoa1.numero,
                pessoa1.cpf);
    }
}
