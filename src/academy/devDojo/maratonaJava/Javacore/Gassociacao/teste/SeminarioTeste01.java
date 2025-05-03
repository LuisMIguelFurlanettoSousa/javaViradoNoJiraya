package academy.devDojo.maratonaJava.Javacore.Gassociacao.teste;

import academy.devDojo.maratonaJava.Javacore.Gassociacao.dominio.Aluno;
import academy.devDojo.maratonaJava.Javacore.Gassociacao.dominio.Ensinador;
import academy.devDojo.maratonaJava.Javacore.Gassociacao.dominio.Local;
import academy.devDojo.maratonaJava.Javacore.Gassociacao.dominio.Seminario;

public class SeminarioTeste01 {
    public static void main(String[] args) {
        Local local = new Local("La na esquina de cima");
        Seminario seminario1 = new Seminario("melhor seminario que existe", local);
        Aluno aluno01 = new Aluno("Luis", 18, seminario1);
        Aluno aluno02 = new Aluno("oooo", 18, seminario1);

        Aluno[] alunos = {aluno01, aluno02};
        Seminario seminario2 = new Seminario("blablabla", alunos, local);
        Seminario[] seminarios = {seminario1, seminario2};
        Ensinador professor = new Ensinador("Romualdo", "Redes", seminarios);

        professor.imprime();
    }
}
