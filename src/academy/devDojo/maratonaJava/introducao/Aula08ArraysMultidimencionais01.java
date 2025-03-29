package academy.devDojo.maratonaJava.introducao;

public class Aula08ArraysMultidimencionais01 {
    public static void main(String[] args) {
        int[][] numeros = new int[3][3];

        numeros[0][0] = 3;
        numeros[0][1] = 3;
        numeros[0][2] = 3;

        numeros[1][0] = 1;
        numeros[1][1] = 1;
        numeros[1][2] = 1;

        numeros[2][0] = 4;
        numeros[2][1] = 5;
        numeros[2][2] = 6;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println(numeros[i][j]);
            }
        }

        System.out.println(" ------------------------------------- ");

        for(int[] arrBase : numeros) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
