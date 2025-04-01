package academy.devDojo.maratonaJava.Javacore.Bintroducaometodos.test;

import academy.devDojo.maratonaJava.Javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoirNumeros();
        System.out.println("---------------");
        calculadora.subDoirNumeros();
    }
}
