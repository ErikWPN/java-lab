import java.util.Scanner;

public class Soma {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro Numero: ");
        var numero_I = scanner.nextInt();
        System.out.println("Digite o segundo Numero: ");
        var numero_II = scanner.nextInt();

        System.out.println("A soma dos dois numeros é: " + (numero_I + numero_II));
    }
}
