package POO.models;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int epsPorTemporada;
    private int minutorPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpsPorTemporada() {
        return epsPorTemporada;
    }

    public void setEpsPorTemporada(int epsPorTemporada) {
        this.epsPorTemporada = epsPorTemporada;
    }

    public int getMinutorPorEpisodio() {
        return minutorPorEpisodio;
    }

    public void setMinutorPorEpisodio(int minutorPorEpisodio) {
        this.minutorPorEpisodio = minutorPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epsPorTemporada * minutorPorEpisodio;
    }
}
