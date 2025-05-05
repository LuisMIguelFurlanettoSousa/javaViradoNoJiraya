package academy.devDojo.maratonaJava.Javacore.JmodificadosFinal.teste;

import academy.devDojo.maratonaJava.Javacore.JmodificadosFinal.dominio.Carro;
import academy.devDojo.maratonaJava.Javacore.JmodificadosFinal.dominio.Ferrari;

public class carroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.COMPRADOR.setNome("luis");

        System.out.println(carro.COMPRADOR);

        System.out.println(Carro.VELOCIDADE_LIMITE);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprimi();
    }
}
