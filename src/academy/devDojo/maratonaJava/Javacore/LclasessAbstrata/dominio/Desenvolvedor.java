package academy.devDojo.maratonaJava.Javacore.LclasessAbstrata.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void Desconto() {
        this.salario = salario - salario * 0.1;
    }

    @Override
    public String toString() {
        return "Desenvolveddor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
