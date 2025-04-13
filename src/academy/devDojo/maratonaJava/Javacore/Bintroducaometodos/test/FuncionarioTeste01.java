package academy.devDojo.maratonaJava.Javacore.Bintroducaometodos.test;

import academy.devDojo.maratonaJava.Javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.setNome("Luis");
        funcionario01.setIdade(18);
        funcionario01.setSalario(new double[]{1200, 997, 90, 453});

        funcionario01.imprime();

    }
}
