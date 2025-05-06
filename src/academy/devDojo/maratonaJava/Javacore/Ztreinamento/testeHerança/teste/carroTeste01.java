package academy.devDojo.maratonaJava.Javacore.Ztreinamento.testeHerança.teste;

import academy.devDojo.maratonaJava.Javacore.Ztreinamento.testeHerança.dominio.Carro;
import academy.devDojo.maratonaJava.Javacore.Ztreinamento.testeHerança.dominio.Moto;

public class carroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("nissan", "350z", 2000, 2);
        Moto moto1 = new Moto("yamaha", "z1000", 2024, 1000);

        carro1.exibirDetalhes();
        System.out.println("--------------------");
        moto1.exibirDetalhes();

    }
}
