package academy.devDojo.maratonaJava.Javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoirNumeros() {
        System.out.println(10 + 10);
    }

    public void subDoirNumeros() {
        System.out.println(10 - 5);
    }

    public void multiplicaDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double DivideDoisNumeros(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void DivdeDoisNumerosVoid(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Impossivel fazer divisao por zero");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void trocaDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 3;

        System.out.println("dentro do metodo: num1: " + num1 + " num2: " + num2);
    }

    public void somaArr(int[] numeros) {
        int soma = 0;

        for(int num : numeros) {
            soma += num;
        }

        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;

        for(int num : numeros) {
            soma += num;
        }

        System.out.println(soma);
    }


}
