public class Personagem {

    String nome;
    int pontos;
    Arma arma;

    public void usarArma() {
        System.out.println(nome + " acabou de usar a " + arma.nome + "!\n");
    }

    public void tomarDano() {
        System.out.println(nome + " acabou de ser atacado!\n");
    }
}
