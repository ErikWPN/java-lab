import java.util.Scanner;

public class conversaodetemperatura {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                            O que deseja converter, C° ou F°
                            OBS.: Digite "C" p/ Celsius ou "F" p/ Fahrenheit
                            """);
        var escala = scanner.next();
        System.out.println("Legal, entáo vamos lá. Digite a temperatura (apenas os numeros)");
        var temperatura = scanner.nextDouble();

        if (escala.equalsIgnoreCase("C")) {
            double fahrenheit = (temperatura * 9.0 / 5.0) + 32;
            System.out.println("O valor de C° em F° é:" + fahrenheit + "F°");
        } else if (escala.equalsIgnoreCase("F")) {
            double celcius = (temperatura - 32) * 5 / 9;
            System.out.println("O valor de F° em C° é:" + celcius + "C°");
        }
    }
}
