package academy.devDojo.maratonaJava.Javacore.Gassociacao.teste;

import academy.devDojo.maratonaJava.Javacore.Gassociacao.dominio.Jogador;
import academy.devDojo.maratonaJava.Javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("papi");
        Jogador jogador2 = new Jogador("cuei");
        Time time = new Time("brazil");

        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- jogadores ---");
        jogador1.imprime();
        jogador2.imprime();

        System.out.println("--- time ---");
        time.imprime();
    }
}
