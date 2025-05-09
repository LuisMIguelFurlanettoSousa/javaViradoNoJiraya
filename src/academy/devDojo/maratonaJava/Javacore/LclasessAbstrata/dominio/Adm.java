package academy.devDojo.maratonaJava.Javacore.LclasessAbstrata.dominio;

public class Adm extends Funcionario{
    public Adm(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void Desconto() {

    }


    @Override
    public String toString() {
        return "adm{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
