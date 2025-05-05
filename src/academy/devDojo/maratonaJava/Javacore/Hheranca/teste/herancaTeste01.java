package academy.devDojo.maratonaJava.Javacore.Hheranca.teste;

import academy.devDojo.maratonaJava.Javacore.Hheranca.dominio.Endereco;
import academy.devDojo.maratonaJava.Javacore.Hheranca.dominio.Funcionario;
import academy.devDojo.maratonaJava.Javacore.Hheranca.dominio.Pessoa;

public class herancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa("Julia");
        Funcionario funcionario = new Funcionario("Luis");

        endereco.setRua("Rua pertin da qui");
        endereco.setCep("38510-000");

        pessoa.setCpf("5199196");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("---Funcionario---");

        funcionario.setCpf("012879300283917");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(26);
        funcionario.imprime();

        funcionario.receita();



    }
}
