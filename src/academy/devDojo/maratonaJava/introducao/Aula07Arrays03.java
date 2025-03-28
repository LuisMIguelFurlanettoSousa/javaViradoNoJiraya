package academy.devDojo.maratonaJava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1, 8, 9};
        int[] numeros3 = new int[] {1, 8, 9};

        for (int num : numeros2) {
            System.out.println(num);
        }
    }
}
