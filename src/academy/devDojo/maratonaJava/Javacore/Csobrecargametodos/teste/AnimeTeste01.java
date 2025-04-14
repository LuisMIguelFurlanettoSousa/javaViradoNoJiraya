package academy.devDojo.maratonaJava.Javacore.Csobrecargametodos.teste;

import academy.devDojo.maratonaJava.Javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("One piece", "TV", 24);
        anime.init("One piece", "TV", 24, "acao");
        anime.imprime();
    }
}
