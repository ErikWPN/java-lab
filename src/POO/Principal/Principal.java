package POO.Principal;

import POO.calculos.CalculadoraDeTempoTotal;
import POO.calculos.FiltrarPorAvalicao;
import POO.models.Filme;
import POO.models.Serie;
import POO.models.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        Filme primeiroFilme = new Filme("Avangers Ultimato", 2019);
        primeiroFilme.setInformacao("""
                Após Thanos eliminar metade das criaturas vivas,
                os Vingadores têm de lidar com a perda de amigos e entes 
                queridos. Com Tony Stark vagando perdido no espaço sem água
                e comida, Steve Rogers e Natasha Romanov lideram a 
                resistência contra o titã louco.
                """);
        primeiroFilme.setRestIdade(12);
        primeiroFilme.setDuracaoEmMinutos(181);
        primeiroFilme.exibeFichaTecnica();
        primeiroFilme.avalia(10);
        primeiroFilme.avalia(9);
        primeiroFilme.avalia(10);
        System.out.println(primeiroFilme.getNome());
        System.out.println("Duração do Filme: " + primeiroFilme.getDuracaoEmMinutos());
        System.out.println("Total de avaliação: " + primeiroFilme.getTotalDeNota());
        System.out.println("Media de avaliação: " + primeiroFilme.obterMedia());

        Filme filmeFavorito = new Filme("Espetacular - Homem Aranha", 2012);

        /// Criando a compo de serie
        Serie primeiraserie = new Serie("Cães de Caça", 2023);

        primeiraserie.setInformacao("Dois jovens boxeadores se unem para derrubar um agiota cruel que oprime os mais vulneráveis.");
        primeiraserie.setTemporadas(1);
        primeiraserie.setEpsPorTemporada(8);
        primeiraserie.setMinutorPorEpisodio(45);
        primeiraserie.setRestIdade(16);

        System.out.println("Duracao total da serie: " + primeiraserie.getDuracaoEmMinutos());

        CalculadoraDeTempoTotal calculo = new CalculadoraDeTempoTotal();
        calculo.inclui(primeiroFilme);
        calculo.inclui(primeiraserie);
        System.out.println("Total de filmes e series: " + calculo.getTempoToral());

        FiltrarPorAvalicao filtro = new FiltrarPorAvalicao();
        filtro.filtra(primeiroFilme);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(primeiroFilme);
        lista.add(filmeFavorito);
        lista.add(primeiraserie);

        Collections.sort(lista);
        System.out.println(lista);

    }
}