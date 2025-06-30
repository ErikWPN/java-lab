import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;

public class Estudo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> anotacoes = new ArrayList<>();

        while (true) {
            System.out.println("O que deseja anotar? (Digite 'sair' para encerrar)");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            } else if (entrada.isBlank()) {
                continue;
            } else {
                anotacoes.add(entrada);
            }
        }

        scanner.close();

        LocalDate dataAtual = LocalDate.now();
        String nomeArquivo = "anotacoes-" + dataAtual + ".txt";

        String caminhoPasta = "C:\\Users\\Erik Nascimento\\OneDrive\\Documentos\\Anotacoes";
        Path caminhoCompleto = Path.of(caminhoPasta, nomeArquivo);

        ArrayList<String> anotacoesFormatadas = new ArrayList<>();
        for (int i = 0; i < anotacoes.size(); i++) {
            anotacoesFormatadas.add((i + 1) + ". " + anotacoes.get(i));
        }

        try {

            Files.createDirectories(Path.of(caminhoPasta));

            Files.write(caminhoCompleto, anotacoesFormatadas);
            System.out.println("Anotações salvas em: " + caminhoCompleto);
        } catch (IOException e) {
            System.out.println("Erro ao salvar as anotações: " + e.getMessage());
        }
    }
}
