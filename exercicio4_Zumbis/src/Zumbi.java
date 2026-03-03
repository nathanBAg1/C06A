public class Zumbi {
    double vida;
    String nome;

    public double mostrarVida() {
        return vida;
    }

    public boolean transfereVida(Zumbi zumbiAlvo, double quantia) {
        if(quantia < vida) {
            zumbiAlvo.vida += quantia;
            vida -= quantia;

            return true;
        }

        return false;
    }
}
