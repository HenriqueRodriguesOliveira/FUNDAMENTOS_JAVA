public class While {
    public static void main(String[] args){
        int valorInicial = 0;
        while (valorInicial < 3) {
            System.out.println("O valor inicial é menor que 3");
            System.out.println(valorInicial);
            valorInicial++; // valorInicial = 3
        }
        System.out.println("Saiu do while");
    }
}
