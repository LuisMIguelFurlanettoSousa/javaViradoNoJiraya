package academy.devDojo.maratonaJava.Javacore.Dconstructor.teste;

import academy.devDojo.maratonaJava.Javacore.Dconstructor.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One pice", "açao, comedia", 17, "masculino gay sai fora", "ghibli");

        anime.imprime();

    }
}
