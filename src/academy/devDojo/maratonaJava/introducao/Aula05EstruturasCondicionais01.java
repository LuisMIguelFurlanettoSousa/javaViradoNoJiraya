package academy.devDojo.maratonaJava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoComprarBedida = idade >= 18;

        if (isAutorizadoComprarBedida) {
            System.out.println("Pode uai");
        }
        if (!isAutorizadoComprarBedida) {
            System.out.println("Nao pode uai");
        }
        System.out.println("Fora do if");
    }
}
