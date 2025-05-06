package academy.devDojo.maratonaJava.Javacore.Ztreinamento.sistemaFuncionariosEmpresa.teste;

import academy.devDojo.maratonaJava.Javacore.Ztreinamento.sistemaFuncionariosEmpresa.dominio.Departamento;
import academy.devDojo.maratonaJava.Javacore.Ztreinamento.sistemaFuncionariosEmpresa.dominio.FuncionarioCLT;
import academy.devDojo.maratonaJava.Javacore.Ztreinamento.sistemaFuncionariosEmpresa.dominio.FuncionarioTerceirizado;
import academy.devDojo.maratonaJava.Javacore.Ztreinamento.sistemaFuncionariosEmpresa.dominio.NivelAcesso;

import java.math.BigDecimal;

public class TesteFuncionariosEmpresa01 {
    public static void main(String[] args) {
        Departamento departamento1 = new Departamento("Departamento fodasticamente foda");
        Departamento departamento2 = new Departamento("Departamento mais meia boca");

        FuncionarioCLT funciorarioCLT = new FuncionarioCLT();
        BigDecimal salarioCLT = new BigDecimal("4000.89");
        funciorarioCLT.setNome("Luis Miguel");
        funciorarioCLT.setSalario(salarioCLT);
        funciorarioCLT.setDepartamento(departamento1);
        funciorarioCLT.setNivelAcesso(NivelAcesso.BASICO);
        funciorarioCLT.setTempoEmpresa(300);

        FuncionarioTerceirizado funcionarioTerceirizado = new FuncionarioTerceirizado();
        BigDecimal salarioTercerizado = new BigDecimal("7580.70");
        funcionarioTerceirizado.setNome("Luis Miguel");
        funcionarioTerceirizado.setSalario(salarioTercerizado);
        funcionarioTerceirizado.setDepartamento(departamento2);
        funcionarioTerceirizado.setNivelAcesso(NivelAcesso.ADMINISTRADOR);
        funcionarioTerceirizado.setEmpresaTerceira("Dell");

        funciorarioCLT.exibeInfo();
        System.out.println("--------------------------");
        funcionarioTerceirizado.exibeInfo();


    }
}
