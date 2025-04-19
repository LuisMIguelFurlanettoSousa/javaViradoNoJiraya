package academy.devDojo.maratonaJava.Javacore.Fmodificadoresestaticos.teste;

import academy.devDojo.maratonaJava.Javacore.Fmodificadoresestaticos.dominio.Carro;

public class carroTeste01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(300);

        Carro c1 = new Carro("Ford", 320.5);
        Carro c2 = new Carro("Konisegg", 425);


        c1.imprime();
        c2.imprime();

    }
}
