package academy.devDojo.maratonaJava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int count = 0;

        while (count < 10) {
            System.out.println(count++);
        }

        do {
            System.out.println("dentro do do");
        } while (count < 10);

        for (int i = 0; i < 10; i++ ) {
            System.out.println("for :" + i);
        }
    }
}
