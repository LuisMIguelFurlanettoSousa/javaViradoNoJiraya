package academy.devDojo.maratonaJava.Javacore.Bintroducaometodos.test;

import academy.devDojo.maratonaJava.Javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String... args) {
        Calculadora calculadora = new Calculadora();

        int[] nums1 = {1, 3, 6, 7};

        calculadora.somaArr(nums1);
        calculadora.somaVarArgs(nums1);
    }
}
