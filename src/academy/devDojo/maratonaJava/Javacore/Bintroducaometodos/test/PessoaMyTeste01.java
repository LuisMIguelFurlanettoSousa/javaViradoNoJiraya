package academy.devDojo.maratonaJava.Javacore.Bintroducaometodos.test;

import academy.devDojo.maratonaJava.Javacore.Bintroducaometodos.dominio.teste.ExibePessoa;
import academy.devDojo.maratonaJava.Javacore.Bintroducaometodos.dominio.teste.GeraPessoa;

public class PessoaMyTeste01 {
    public static void main(String[] args) {
        GeraPessoa geraPessoa = new GeraPessoa();
        GeraPessoa geraPessoa1 = new GeraPessoa();
        ExibePessoa exibePessoa = new ExibePessoa();

        geraPessoa.setNome("Luis");
        geraPessoa.setIdade(18);
        geraPessoa.setSexo('M');
        geraPessoa.setVivo(true);

        geraPessoa1.setNome("Julia");
        geraPessoa1.setIdade(17);
        geraPessoa1.setSexo('F');
        geraPessoa1.setVivo(true);

        System.out.println(geraPessoa.getNome());
        exibePessoa.exibe(geraPessoa);
        exibePessoa.exibe(geraPessoa1);
    }
}
