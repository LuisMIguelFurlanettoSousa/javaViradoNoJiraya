package academy.devDojo.maratonaJava.Javacore.Kenum.dominio;

public enum TipoPagamento {
        DEBITO {
            @Override
            public double calcularDesconto(double num) {
                return num * 0.1;
            }
        },
        CREDITO {
            @Override
            public double calcularDesconto(double num) {
                return num * 0.05;
            }
        };

    public abstract double calcularDesconto(double num);
}
