package academy.devDojo.maratonaJava.Javacore.Gassociacao.teste;

import academy.devDojo.maratonaJava.Javacore.Gassociacao.dominio.Jogador;
import academy.devDojo.maratonaJava.Javacore.Gassociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Luis");
        Time time = new Time("Curinthias");

        jogador.setTime(time);
        jogador.imprime();
    }
}
