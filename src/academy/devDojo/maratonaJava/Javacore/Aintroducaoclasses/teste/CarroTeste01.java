package academy.devDojo.maratonaJava.Javacore.Aintroducaoclasses.teste;

import academy.devDojo.maratonaJava.Javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.nome = "voyage";
        carro.marca = "volks";
        carro.ano = 2007;

        System.out.println(carro.nome + " " + carro.marca + " " + carro.ano);
    }
}
