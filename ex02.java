//imprimir o quadrado dos números de 1 a 20

import java.util.Scanner;
import java.lang.Math;

public class ex02 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        int i = 1;

        while (i <= 20) {
            System.out.println("O número é: " + Math.pow(i, 2));
            i++;
        }



    }
}
