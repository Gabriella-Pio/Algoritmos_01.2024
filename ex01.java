// Imprimir os 100 primeiros números pares (sem usar condicional)

import java.util.Scanner;

public class ex01 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        for (int i = 0; i <= 200; i += 2) {
            System.out.println(i);
        }

    }
}
