import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner entrada = new  Scanner(System.in);

        int numGerado, numAleatorio;
        numGerado = rand.nextInt(10) + 1;

        do {
            System.out.println("Adivinhe o número gerado:");
            numAleatorio = entrada.nextInt();

            if(numAleatorio > numGerado) {
                System.out.println("Menos");
            } else if(numAleatorio < numGerado) {
                System.out.println("Mais");
            }
        } while(numGerado != numAleatorio);
        System.out.println("Você acertou!");
    }
}
