import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int I = 0,II = 0,III = 0,IV = 0,V = 0,VI = 0,VII = 0,VIII = 0,IX = 0,X = 0;

        System.out.println("Digite um numero e veja a tabuada de 1 ao 10: ");
        var num = leitor.nextInt();

        for (int i = 0; i < 10; i++) {
            I = num * 1;
            II = num * 2;
            III = num * 3;
            IV = num * 4;
            V = num * 5;
            VI = num * 6;
            VII = num * 7;
            VIII = num * 8;
            IX = num * 9;
            X = num * 10;
        }

        System.out.printf("A tabuada de %s é \n", num);
        System.out.printf("""
                %s x 1  = %s
                %s x 2  = %s
                %s x 3  = %s
                %s x 4  = %s
                %s x 5  = %s
                %s x 6  = %s
                %s x 7  = %s
                %s x 8  = %s
                %s x 9  = %s
                %s x 10 = %s
                """, num, I, num, II, num, III, num, IV, num, V, num, VI, num, VII, num, VIII, num, IX, num, X);

    }
}
