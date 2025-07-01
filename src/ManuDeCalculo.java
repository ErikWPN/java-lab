import java.util.Scanner;

public class ManuDeCalculo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("""
                |____________Menu____________|
                |Opções_______Calculo________|
                |___1____Área do quadrado____|
                |___2____Área do círculo_____|
                |____________________________|
                """);
        var opcao = leitor.nextByte();

        if (opcao == 1) {
            System.out.println("Vamos calcular a área de um quadrado");
            System.out.println("Digite o tamanho de A: ");
            double A = leitor.nextInt();

            double result = A * A;

            System.out.println("A area do quadrado é: " + result);
        } else if (opcao == 2) {
            System.out.println("Vamos calcular a área de um circulo");
            System.out.println("Digite o tamanho do raio: ");
            double raio = leitor.nextDouble();

            double result = Math.PI * (raio * raio);
            System.out.println("A área de um circulo é : " + result);
        } else {
            System.out.println("""
                    Essa opção é invalidade, digite 1 para calcular a área de um quadrado
                              ou digite 2 para calcular a area de um circulo""");
        }
    }
}
