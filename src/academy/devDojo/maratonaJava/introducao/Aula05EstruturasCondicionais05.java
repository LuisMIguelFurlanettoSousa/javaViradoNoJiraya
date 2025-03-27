package academy.devDojo.maratonaJava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // imprma o dia da semana considerando 1 como domingo

        byte dia = 10;
        // char int bute short num String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("quart");
                break;
            case 5:
                System.out.println("qui");
                break;
            case 6:
                System.out.println("sex");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("Opcao invalida");
        }
    }
}
