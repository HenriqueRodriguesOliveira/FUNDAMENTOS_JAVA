package revisao.batalha;

public class Acao {
    public static void main(String[] args) {
        Atributos personagem = new Atributos();
        personagem.nome = "Zeck";
        personagem.forca = 48484;
        personagem.poder = "Raios";
        personagem.level = 45;

        Atributos personagem1 = new Atributos();
        personagem1.nome = "Zafira";
        personagem1.forca = 8887;
        personagem1.poder = "Fogo";
        personagem1.level = 88;

        if (personagem.forca <= personagem1.forca) {
            System.out.format("O poder do %s é mais forte, comparado ao da %s", personagem.nome, personagem1.nome);
        } else {
            System.out.format("O poder do %s é mais fraco, comparado ao da %s", personagem.nome, personagem1.nome);
        }
    }
}
