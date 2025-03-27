package academy.devDojo.maratonaJava.introducao;

public class Aula06EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        double salario = 2500;
        float tax;
        double valorDoImposto;

        if (salario <= 34712) {
            tax = 9.70F;
        } else if (salario <= 68507) {
            tax = 37.35F;
        } else {
            tax = 49.50F;
        }

        double valorComTaxa = salario * (1 - tax / 100);
        valorDoImposto = salario - valorComTaxa;

        System.out.println(String.format("Voce ira pagar uma taxa de %.2f%%, "
                + "o valor do seu salario com as taxas é %.2f, oq da %.2f de imposto", tax, valorComTaxa, valorDoImposto));
    }
}
