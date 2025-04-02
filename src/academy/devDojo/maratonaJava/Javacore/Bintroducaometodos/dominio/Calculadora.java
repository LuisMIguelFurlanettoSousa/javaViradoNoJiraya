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

}
