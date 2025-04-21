package academy.devDojo.maratonaJava.Javacore.Gassociacao.teste;

import academy.devDojo.maratonaJava.Javacore.Gassociacao.dominio.Jogador;

public class Jogadorteste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("carinha da esquina do lado de cima da casa do neymar, carinha muito bom por sinal");
        Jogador jogador3 = new Jogador("provavelmente melhor que o neymar mas mais ruim que o carinha da esquina de cima da casa do neymar");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
