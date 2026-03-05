public class Main {

    static void main(String[] args) {
        Kart moto = new Kart();
        Kart carro = new Kart();

        Piloto mario = new Piloto();
        Piloto bowser = new Piloto();

        moto.piloto = mario;
        carro.piloto = bowser;

        moto.nome = "Moto";
        carro.nome = "Carro";

        mario.vilao = false;
        mario.nome = "Mario";
        bowser.vilao = true;
        bowser.nome = "Bowser";

        moto.mt.cilindradas = "150cc";
        moto.mt.velocidadeMaxima = 125;
        carro.mt.cilindradas = "100cc";
        carro.mt.velocidadeMaxima = 75;

        carro.pular();

        moto.soltarTurbo();

        carro.fazerDrift();

        carro.piloto.soltaSuperPoder();

        moto.mt.mostrarInfo();
    }
}
