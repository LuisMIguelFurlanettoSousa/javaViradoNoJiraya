package academy.devDojo.maratonaJava.Javacore.LclasessAbstrata.teste;

import academy.devDojo.maratonaJava.Javacore.LclasessAbstrata.dominio.Adm;
import academy.devDojo.maratonaJava.Javacore.LclasessAbstrata.dominio.Desenvolvedor;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Adm adm = new Adm("Luffy", 9000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Zoro", 75000);

        System.out.println(adm);
        System.out.println(desenvolvedor);

        adm.imprime();
        desenvolvedor.imprime();
    }
}
