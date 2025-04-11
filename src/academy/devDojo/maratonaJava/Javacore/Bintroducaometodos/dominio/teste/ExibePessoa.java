package academy.devDojo.maratonaJava.Javacore.Bintroducaometodos.dominio.teste;


public class ExibePessoa {
    public void exibe(GeraPessoa pessoa) {

        System.out.println("-----------------------");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getSexo());
        System.out.println(pessoa.getVivo());
    }
}
