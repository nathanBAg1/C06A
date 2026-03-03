public class Main {

    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.nome = "Bob";
        z2.nome = "Steve";

        z1.vida = 50;
        z2.vida = 70;

        System.out.println(z1.mostrarVida());
        System.out.println(z2.mostrarVida());

        z1.transfereVida(z2, 10);

        System.out.println("\n" + z1.mostrarVida());
        System.out.println(z2.mostrarVida());
    }
}