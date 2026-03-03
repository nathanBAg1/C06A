public class Zumbi {
    double vida;
    String nome;

    public double mostrarVida() {
        return vida;
    }

    public double transfereVida(Zumbi zumbiAlvo, double quantia) {
        zumbiAlvo.vida += quantia;
        vida -= quantia;
        return zumbiAlvo.vida;
    }
}
