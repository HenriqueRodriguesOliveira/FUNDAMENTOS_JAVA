import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        // Lista
        List<String> nomes = new ArrayList<>();
        nomes.add("Henrique");
        nomes.add("Rodrigues");
        nomes.add("Elias");
        // 0 -
        // 1 -
        // 2 -

        // System.out.println(nomes.get(0));
        // for( String nome : nomes) {
        // System.out.println("Nome e:" + nome);
        // }

        nomes.forEach(nome -> System.out.println("O nome que apareceu foi " + nome));
    }
}
