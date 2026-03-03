public class Main {

    public static void main(String[] args) {

        Personagem p1 = new Personagem();
        Arma a1 = new Arma();

        a1.descricao = "Realidade";
        a1.resistencia = 80;
        a1.nome = "Manopla";
        a1.poder = 85;

        p1.nome = "Thanos";
        p1.arma = a1;
        p1.pontos = 85;

        p1.usarArma();
        p1.tomarDano();
        a1.mostrarInfoArma();

    }
}