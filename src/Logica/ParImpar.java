import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero");
        var num = leitor.nextInt();

        if (num % 2 == 0) {
            System.out.printf("O numero %s é Par", num);
        } else if (num % 2 != 0) {
            System.out.printf("O numero %s é Impar", num);
        }
    }
}
