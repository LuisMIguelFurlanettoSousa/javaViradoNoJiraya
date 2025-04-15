package academy.devDojo.maratonaJava.Javacore.Eblocosinicializaçao.teste;

import academy.devDojo.maratonaJava.Javacore.Eblocosinicializaçao.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
