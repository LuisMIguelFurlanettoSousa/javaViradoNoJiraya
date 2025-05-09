package academy.devDojo.maratonaJava.Javacore.LclasessAbstrata.dominio;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        Desconto();
    }

    @Override
    public void imprime() {
        System.out.println("imprimindo...");
    }

    public abstract void Desconto();
}
