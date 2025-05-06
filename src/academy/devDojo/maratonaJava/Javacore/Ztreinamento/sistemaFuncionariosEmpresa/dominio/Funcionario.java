package academy.devDojo.maratonaJava.Javacore.Ztreinamento.sistemaFuncionariosEmpresa.dominio;

import java.math.BigDecimal;

public class Funcionario {
    private String nome;
    private BigDecimal salario;
    private Departamento departamento;
    private NivelAcesso nivelAcesso;

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Departamento: " + departamento);
        System.out.println("Nivel de acesso: " + nivelAcesso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public NivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(NivelAcesso nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
}
