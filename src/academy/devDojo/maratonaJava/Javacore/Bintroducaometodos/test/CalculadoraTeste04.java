package academy.devDojo.maratonaJava.Javacore.Bintroducaometodos.test;

import academy.devDojo.maratonaJava.Javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int num1 = 7;
        int num2 = 20;

        calculadora.trocaDoisNumeros(num1, num2);

        System.out.println("dentro do teste: num1: " + num1 + " num2: " + num2);
    }
}
