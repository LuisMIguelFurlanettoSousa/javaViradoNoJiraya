package academy.devDojo.maratonaJava.Javacore.Gassociacao.teste;

import academy.devDojo.maratonaJava.Javacore.Gassociacao.dominio.Escola;
import academy.devDojo.maratonaJava.Javacore.Gassociacao.dominio.Professor;

public class Escolateste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Luis");
        Professor professor2 = new Professor("carinha alien da cabeça amarela");
        Professor[] arrayProfessores = {professor1, professor2};
        Escola escola = new Escola("Uniube", arrayProfessores);

        escola.imprime();
    }
}
