package academy.devDojo.maratonaJava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 4000;
        String mensagemDoar = "Eu vou doar 500 para o dev dojo";
        String mensagemNaoDoar = "Ainda nn tenho condicoes mas vou ter";
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

    }
}
