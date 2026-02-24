import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);

        int numGerado, numAdivinhado;

        numGerado = rand.nextInt(10) + 1;

        do {
            System.out.println("Qual número aleatório foi gerado?");
            numAdivinhado = entrada.nextInt();
        } while (numGerado != numAdivinhado);
        System.out.println("Você acertou!");

        entrada.close();
    }
}
