//imprimir o quadrado dos números de 1 a 20

import java.util.Scanner;
import java.lang.Math;

public class ex02for {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        for (int i = 1; i <= 20; i++) {
            System.out.println("O número é: " + Math.pow(i, 2));
        }
    }
}
