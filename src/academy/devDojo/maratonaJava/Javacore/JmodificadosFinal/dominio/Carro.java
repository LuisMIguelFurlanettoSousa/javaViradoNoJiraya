package academy.devDojo.maratonaJava.Javacore.JmodificadosFinal.dominio;

public class Carro {
    private String nome;

    public final void imprimi() {
        System.out.println(this.nome);
    }

    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
