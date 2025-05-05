package academy.devDojo.maratonaJava.Javacore.Hheranca.teste;

import academy.devDojo.maratonaJava.Javacore.Hheranca.dominio.Funcionario;

public class herancaTeste02 {

    // 0 - Bloco de inicializacao estatico da super classe e executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicializao estatico da subclasse e executado quandio a JVM carregar a classe filho
    // 2 - Alocado espaco de memoria pro objeto da superclasse
    // 3 - Cada atributo de superclasse e criado e inicializadop com valores default opu o que for passado
    // 4 - bloco de inicializao da super classe e executado na ordem em que aparece
    // 5 - Construtor e executado da superclasse
    // 6 - Alocado espaco de memoria pro objeto da subclasse
    // 7 - Cada atributo de subclasse e criado e inicializadop com valores default opu o que for passado
    // 8 - bloco de inicializao da subclasse e executado na ordem em que aparece
    // 9 - Construtor e executado da subclasse

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Luis");
    }
}
