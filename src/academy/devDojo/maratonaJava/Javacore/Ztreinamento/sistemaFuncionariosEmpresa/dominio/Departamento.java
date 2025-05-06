package academy.devDojo.maratonaJava.Javacore.Ztreinamento.sistemaFuncionariosEmpresa.dominio;

public class Departamento {
    private String nome;

    public Departamento(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
