package academy.devDojo.maratonaJava.Javacore.Kenum.teste;

import academy.devDojo.maratonaJava.Javacore.Kenum.dominio.Cliente;
import academy.devDojo.maratonaJava.Javacore.Kenum.dominio.TipoCliente;
import academy.devDojo.maratonaJava.Javacore.Kenum.dominio.TipoPagamento;

public class clienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("um ali", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("O certinn que paga bunitin", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        System.out.println(TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica"));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());

    }
}
