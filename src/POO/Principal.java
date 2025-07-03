package POO;

public class Principal {
    public static void main(String[] args) {
        Filme primeiroFilme = new Filme();
        primeiroFilme.nome = "Avangers Ultimato";
        primeiroFilme.informacao = """
                Após Thanos eliminar metade das criaturas vivas,
                os Vingadores têm de lidar com a perda de amigos e entes 
                queridos. Com Tony Stark vagando perdido no espaço sem água
                e comida, Steve Rogers e Natasha Romanov lideram a 
                resistência contra o titã louco.
                """;
        primeiroFilme.anoDeLancamento = 2019;
        primeiroFilme.restIdade = 12;
        primeiroFilme.duracaoEmMinutos = 181;

        primeiroFilme.exibeFichaTecnica();
        primeiroFilme.avalia(10);
        primeiroFilme.avalia(9);
        primeiroFilme.avalia(10);
        System.out.println(primeiroFilme.avalicao);
        System.out.println(primeiroFilme.totalDeNota);
        System.out.println(primeiroFilme.obterMedia());

    }
}
