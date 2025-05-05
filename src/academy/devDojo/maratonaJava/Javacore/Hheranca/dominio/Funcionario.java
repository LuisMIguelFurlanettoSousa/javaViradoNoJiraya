package academy.devDojo.maratonaJava.Javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicializacao statico da classe funcionario");
    }

    {
        System.out.println("dentr doo bloco de inicializacao 1 da classe Funcionario");
    }
    {
        System.out.println("dentr doo bloco de inicializacao 2 da classe Funcionario");
    }

    public Funcionario (String nome) {
       super(nome);
        System.out.println("dentro do contrutor de Funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salario: " + this.salario);
    }

    public void receita() {
        System.out.println("Eu " + this.nome + " declaro que recebi R$ " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
