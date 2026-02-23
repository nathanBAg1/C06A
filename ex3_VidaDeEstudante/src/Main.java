import java.util.Scanner;

public class Main {

    public static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a NPA: ");
        int NPA = entrada.nextInt();

        if(NPA >= 60) {
            System.out.println("Passou!");
        } else {
            System.out.println("Ficou de NP3!");
            System.out.print("Informe o valor de sua NP3: ");
            int NP3 = entrada.nextInt();
            int NFA = (NPA + NP3) / 2;
            if(NFA >= 50) {
                System.out.println("Passou!");
            } else {
                System.out.println("Reprovado!");
            }
        }

        entrada.close();
    }
}

