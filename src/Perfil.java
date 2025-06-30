import java.util.Scanner;

public class Perfil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        var name = scanner.next();
        System.out.printf("Olá, %s \n", name);
        System.out.println("Tudo bem?");
        var tudo = scanner.next();
    }
}
