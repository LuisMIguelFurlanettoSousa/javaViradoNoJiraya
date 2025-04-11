package academy.devDojo.maratonaJava.Javacore.Bintroducaometodos.test;

import academy.devDojo.maratonaJava.Javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Luis");
        pessoa.setIdade(18);

        System.out.println("______________________");

        pessoa.imprime();

        System.out.println("______________________");

        System.out.println(pessoa.getNome());

        System.out.println("______________________");

        System.out.println(pessoa.getIdade());
    }
}
