package academy.devDojo.maratonaJava.Javacore.Bintroducaometodos.test;

import academy.devDojo.maratonaJava.Javacore.Bintroducaometodos.dominio.Estudante;
import academy.devDojo.maratonaJava.Javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudateTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "xuxu com limao";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "sla";
        estudante02.idade = 23;
        estudante02.sexo = 'F';

        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);


    }
}
