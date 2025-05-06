package academy.devDojo.maratonaJava.Javacore.Kenum.teste;

import academy.devDojo.maratonaJava.Javacore.Kenum.dominio.Cliente;
import academy.devDojo.maratonaJava.Javacore.Kenum.dominio.TipoCliente;

public class clienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("um ali", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("O certinn que paga bunitin", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
