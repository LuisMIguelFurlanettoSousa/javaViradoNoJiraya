package academy.devDojo.maratonaJava.Javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDeTecladoTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe a sua idade");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Qual informe o seu nome:");
        String nome = sc.nextLine();

        System.out.println("Informe o seu sexo");
        char sexo = sc.next().charAt(0);

        System.out.println("------------------------------------");
        System.out.println("idade: " + idade);
        System.out.println("nome: " + nome);
        System.out.println("sexo: " + sexo);
    }
}
