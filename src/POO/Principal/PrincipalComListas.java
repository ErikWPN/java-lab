package POO.Principal;

import POO.models.Filme;
import POO.models.Serie;
import POO.models.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme primeiroFilme = new Filme("Avangers Ultimato", 2019);
        primeiroFilme.avalia(9);
        Filme filmeFavorito = new Filme("Espetacular - Homem Aranha", 2012);
        filmeFavorito.avalia(10);
        Serie primeiraserie = new Serie("Cães de Caça", 2023);
        primeiraserie.avalia(7);
        Serie segundaserie = new Serie("Lost",2000);
        segundaserie.avalia(8);

        ArrayList<Titulo> minhaLista = new ArrayList<>();
        minhaLista.add(primeiroFilme);
        minhaLista.add(filmeFavorito);
        minhaLista.add(primeiraserie);
        minhaLista.add(segundaserie);
        for (Titulo item: minhaLista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classficação: " + filme.getClassificacao());
            }
        }

    }
}