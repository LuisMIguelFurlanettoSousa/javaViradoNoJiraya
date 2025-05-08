package academy.devDojo.maratonaJava.Javacore.Ztreinamento.ClassEnum;

public class testeEnum01 {
    public static void main(String[] args) {
        NivelAcesso acesso = NivelAcesso.porCodigo(1);

        if (acesso != null) {
            System.out.println("Acesso encontrado: " + acesso + " - " + acesso.getDescricao());
        } else {
            System.out.println("Código de acesso inválido.");
        }
    }
}
