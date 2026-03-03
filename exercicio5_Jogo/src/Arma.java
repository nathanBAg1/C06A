public class Arma {
    String nome;
    int poder;
    int resistencia;
    String descricao;

    public void mostrarInfoArma() {
        System.out.println("A " + nome + " é uma arma de poder " + poder +
                ", apresenta uma resitência de " + resistencia +
                " pontos e apresenta a característica de " + descricao + "!\n");
    }
}
