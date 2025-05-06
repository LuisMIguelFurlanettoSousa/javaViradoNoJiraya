package academy.devDojo.maratonaJava.Javacore.Ztreinamento.sistemaFuncionariosEmpresa.dominio;

public class FuncionarioTerceirizado extends Funcionario{
    private String empresaTerceira;

    public void exibeInfo() {
        super.exibirDados();
        System.out.println("Empresa terceira: " + empresaTerceira);
    }

    public String getEmpresaTerceira() {
        return empresaTerceira;
    }

    public void setEmpresaTerceira(String empresaTerceira) {
        this.empresaTerceira = empresaTerceira;
    }
}
