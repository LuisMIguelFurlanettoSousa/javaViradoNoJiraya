package academy.devDojo.maratonaJava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        int count = 50;

        for (int i = 0; i < count; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
