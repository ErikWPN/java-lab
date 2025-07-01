import java.util.Scanner;

public class CompareNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        var num_1 = leitor.nextInt();
        System.out.println("Digite outro numero: ");
        var num_2 = leitor.nextInt();

        if (num_1 == num_2) {
            System.out.printf("O numero são iguais \n Numero_1: %s \n Numero_2: %s", num_1, num_2);
        }else if (num_1 < num_2) {
            System.out.printf("Os numeros são diferente \n", num_2, num_1);
            System.out.printf("O numero %s é maior que %s", num_2, num_1);
        } else if (num_1 > num_2) {
            System.out.printf("Os numeros são diferente \n", num_1, num_2);
            System.out.printf("O numero %s é maior que %s", num_1, num_2);
        }
    }
}
