import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.nome = "Bob";
        z2.nome = "Steve";

        z1.vida = 50;
        z2.vida = 70;

        System.out.println("Entre com o valor de vida que será tranferido de " + z1.nome +
                " para " + z2.nome + ":");
        float quantidade = entrada.nextFloat();

        boolean resultado = z1.transfereVida(z2, quantidade);

        if(resultado) {
            System.out.println("A transferência foi um sucesso!");
        } else {
            System.out.println("A transferência falhou!");
        }

        System.out.println(z1.mostrarVida());
        System.out.println(z2.mostrarVida());

    }
}