package academy.devDojo.maratonaJava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *

        int numero1 = 2;
        int numero2 = 5;

        int resultado = 5 * 2;
        System.out.println(resultado);

        // %
        int resto = 7 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVInte = 10 > 20;
        System.out.println(isDezMaiorQueVInte);

        // && (END) || (OR)

        double valorSla = 10;
        double valorSla2 = 10;

        boolean iguais = valorSla == valorSla2 && valorSla2 == valorSla;

        System.out.println(iguais);


        double contaCorrente = 200;
        double contaPoupanca = 400;

        double valorPlaystationCinco = 3200;
        boolean isPs5Compravel = contaCorrente > valorPlaystationCinco || contaPoupanca > valorPlaystationCinco;

        System.out.println("Da pra compra?: " + isPs5Compravel);

        double bonus = 1800;

        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador++;
        contador--;
        ++contador;
        --contador;

        System.out.println(contador++);
        System.out.println(contador);
    }
}
