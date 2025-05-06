package academy.devDojo.maratonaJava.Javacore.Ztreinamento.sistemaFuncionariosEmpresa.dominio;

import java.math.BigDecimal;

public class FuncionarioCLT extends Funcionario{
    private int tempoEmpresa;

    public FuncionarioCLT() {}

    public FuncionarioCLT(String nome, BigDecimal salario, Departamento departamento, NivelAcesso nivelAcesso, int tempoEmpresa) {
        super.setNome(nome);
        super.setSalario(salario);
        super.setDepartamento(departamento);
        super.setNivelAcesso(nivelAcesso);
        this.tempoEmpresa = tempoEmpresa;
    }

    public void exibeInfo() {
        super.exibirDados();
        System.out.println("Tempo na empresa: " + tempoEmpresa);
    }

    public int getTempoEmpresa() {
        return tempoEmpresa;
    }

    public void setTempoEmpresa(int tempoEmpresa) {
        this.tempoEmpresa = tempoEmpresa;
    }
}
