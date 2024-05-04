//looping
import java.util.Scanner;
import java.util.Random;

public class estruturasRep {
    public static void main (String[] args) {
        Scanner leitor = new Scanner (System.in);
        Random aleatorio = new Random();

        int numero;
        int valor = aleatorio.nextInt(11);
        int aleat = valor;

        /*System.out.println("Digite um número de 0 a 10: ");
        valor = leitor.nextInt();*/

        System.out.println("Tente descobrir o número digitado: ");
        numero = leitor.nextInt();

        while (aleat != numero) {
            System.out.println("Você errou! \n\nTente novamente: ");
            numero = leitor.nextInt();
        }

        leitor.close();
        System.out.println("Parabéns! Você acertou!");
    }
}