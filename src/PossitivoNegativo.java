import java.util.Scanner;

public class PossitivoNegativo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        var number = leitor.nextInt();

        if (number > 0) {
            System.out.printf("O numero %s é possitivo", number);
        } else {
            System.out.printf("O numero %s é negativo", number);
        }
    }
}
