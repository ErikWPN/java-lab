import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Variáveis para armazenar a soma das notas e a quantidade de alunos
        double somaNotas = 0;
        int quantidadePessoas = 0;

        System.out.println("=== Cálculo de Média ===");

        while (true) {
            System.out.print("Digite o nome do aluno (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();
            // Verifica se o usuário deseja encerrar o programa
            if (nome.equalsIgnoreCase("sair")) {

                break;
            }
            System.out.print("Digite a nota do aluno: ");
            double nota = scanner.nextDouble();
            scanner.nextLine(); // Limpa o "Enter" que ficou no buffer

            somaNotas += nota; // Soma a nota atual ao total
            quantidadePessoas++; // Incrementa o contador de alunos

            System.out.println("Anotado: " + nome + " tirou " + nota + "\n");
        }
        scanner.close();

        // Verifica se houve entrada de dados antes de calcular a média
        if (quantidadePessoas > 0) {
            double media = somaNotas / quantidadePessoas;
            System.out.println("Foram registradas " + quantidadePessoas + " notas.");
            System.out.printf("A média geral é: %.2f\n", media);
        } else {
            System.out.println("Nenhuma nota foi registrada.");
        }
    }
}