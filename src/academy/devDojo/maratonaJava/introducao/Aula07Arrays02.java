package academy.devDojo.maratonaJava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // int, byte, short, float e double -> 0
        // boolean -> false
        // char -> \u0000
        // String -> null

        String[] nomes = new String[4];

        nomes[0] = "Luis";
        nomes[1] = "Julia";
        nomes[2] = "Javao";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
