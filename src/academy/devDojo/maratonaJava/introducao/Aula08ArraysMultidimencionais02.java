package academy.devDojo.maratonaJava.introducao;

public class Aula08ArraysMultidimencionais02 {
    public static void main(String[] args) {
        int[][] numeros = new int[3][];

        int[] array1  = {1, 2, 3};

        numeros[0] = new int[2];
        numeros[1] = array1;
        numeros[2] = new int[] {1, 2, 3, 4, 5, 6};

        int[][] numeros2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int[] base : numeros2) {
            System.out.println("\n--------");
            for (int num : base) {
                System.out.print(num + " ");
            }
        }
    }
}
