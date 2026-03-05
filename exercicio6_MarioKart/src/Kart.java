public class Kart {

    String nome;
    Piloto piloto;
    Motor mt;

    public Kart() {
        mt = new Motor();
    }

    public void pular() {
        System.out.println("O Kart " + nome + " pulou!");
    }

    public void soltarTurbo() {
        System.out.println("O motor chegou a sua velocidade máxima de " +
                mt.velocidadeMaxima + " com o turbo dado pelo Kart " + nome);
    }

    public void fazerDrift() {
        System.out.println("O " + piloto.nome + " acaba de fazer um Drift com o Kart " + nome);
    }
}
