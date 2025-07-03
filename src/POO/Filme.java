package POO;

public class Filme {
    String nome;
    String informacao;
    int anoDeLancamento;
    int restIdade;
    double avalicao;
    int totalDeNota;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Faixa etária de idade: " + restIdade);
        System.out.println("Sinopse: " + informacao);

    }

    void avalia (double nota){
        avalicao += nota;
        totalDeNota++;
    }

    double obterMedia () {
        return avalicao / totalDeNota;
    }
}

