package academy.devDojo.maratonaJava.Javacore.Aintroducaoclasses.teste;

import academy.devDojo.maratonaJava.Javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.nome = "voyage";
        carro.marca = "volks";
        carro.ano = 2007;


        Carro carro2 = new Carro();

        carro2.nome = "s10";
        carro2.marca = "chefrolet";
        carro2.ano = 2018;

        carro2 = carro;

        System.out.println(carro.nome + " " + carro.marca + " " + carro.ano);
        System.out.println(carro2.nome + " " + carro2.marca + " " + carro2.ano);
    }
}
