package POO.models;

public class Titulo {
    private String nome;
    private String informacao;
    private int anoDeLancamento;
    private int restIdade;
    private double somaavalicao;
    private int totalDeNota;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;

    public String getNome() {
        return nome;
    }

    public String getInformacao() {
        return informacao;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getRestIdade() {
        return restIdade;
    }

    public double getSomaavalicao() {
        return somaavalicao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getTotalDeNota(){
        return totalDeNota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setRestIdade(int restIdade) {
        this.restIdade = restIdade;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Faixa etária de idade: " + restIdade);
        System.out.println("Sinopse: " + informacao);

    }

    public void avalia (double nota){
        somaavalicao += nota;
        totalDeNota++;
    }

    public double obterMedia () {
        return somaavalicao / totalDeNota;
    }
}

