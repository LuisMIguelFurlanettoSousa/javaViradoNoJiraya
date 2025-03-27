package academy.devDojo.maratonaJava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorCarro = 50000;
        int qtdParcelas = 1;

        for (int parcela = 1; parcela < valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela <= 1000) {
                System.out.println("valor parcela: " + valorParcela + " quantidade de parcelas: " + parcela);
                break;
            }
        }
    }
}
