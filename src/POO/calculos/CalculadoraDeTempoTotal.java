package POO.calculos;

import POO.models.Titulo;

public class CalculadoraDeTempoTotal {
    private int tempoToral;

    public int getTempoToral() {
        return tempoToral;
    }

    public void inclui (Titulo titulo){
        tempoToral += titulo.getDuracaoEmMinutos();

    }
}
