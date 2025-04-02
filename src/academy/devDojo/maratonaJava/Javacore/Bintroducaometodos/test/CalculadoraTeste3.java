package academy.devDojo.maratonaJava.Javacore.Bintroducaometodos.test;

import academy.devDojo.maratonaJava.Javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste3 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.DivideDoisNumeros(60, 2);
        System.out.println(resultado);

        System.out.println("---------------------------");

        calculadora.DivdeDoisNumerosVoid(60, 2);
    }
}
