package academy.devDojo.maratonaJava.Javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

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
