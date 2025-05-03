package academy.devDojo.maratonaJava.Javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDeTecladoTEst02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Eu vou responder sua pergunta com SIM ou NAO");
        System.out.println("Insira a sua pergunta: ");
        String pergunta = sc.nextLine();

        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM BB");
        } else {
            System.out.println("SAI FORA, CLARO QUE NÃO");
        }
    }
}
