package academy.devDojo.maratonaJava.Javacore.Ztreinamento.Enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class TesteEnumeratio {
    public static void main(String[] args) {
        Vector<String> palavras = new Vector<>();

        palavras.add("Aleluia");
        palavras.add("ooooo");
        palavras.add("churisco");
        palavras.add("extrogonocof");

        Enumeration<String> elementos = palavras.elements();

        System.out.println("Palavras que cmc com a letra A: ");
        while(elementos.hasMoreElements()) {
            String palavra = elementos.nextElement();
            if (palavra.startsWith("A")) {
                System.out.println(palavra);
            }
        }
    }
}
