package POO;

import POO.calculos.CalculadoraDeTempoTotal;
import POO.calculos.FiltrarPorAvalicao;
import POO.models.Filme;
import POO.models.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme primeiroFilme = new Filme();
        primeiroFilme.setNome("Avangers Ultimato");
        primeiroFilme.setInformacao("""
                Após Thanos eliminar metade das criaturas vivas,
                os Vingadores têm de lidar com a perda de amigos e entes 
                queridos. Com Tony Stark vagando perdido no espaço sem água
                e comida, Steve Rogers e Natasha Romanov lideram a 
                resistência contra o titã louco.
                """);
        primeiroFilme.setAnoDeLancamento(2019);
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

        /// Criando a compo de serie
        Serie primeiraserie = new Serie();

        primeiraserie.setNome("Cães de Caça");
        primeiraserie.setAnoDeLancamento(2023);
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
    }
}