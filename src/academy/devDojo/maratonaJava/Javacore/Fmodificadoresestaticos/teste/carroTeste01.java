package academy.devDojo.maratonaJava.Javacore.Fmodificadoresestaticos.teste;

import academy.devDojo.maratonaJava.Javacore.Fmodificadoresestaticos.dominio.Carro;

public class carroTeste01 {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        Carro.velocidadeLimite = 300;

        c1.setMarca("Ford");
        c1.setVelocidadeMaxima(320.5);

        c2.setMarca("Konisegg");
        c2.setVelocidadeMaxima(425);

        c1.imprime();
        c2.imprime();

    }
}
