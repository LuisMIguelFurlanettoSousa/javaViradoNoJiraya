package academy.devDojo.maratonaJava.Javacore.Fmodificadoresestaticos.dominio;

public class Anime {
    private String nome;
    private static int[] episodios = new int[100];

    static {
        System.out.println("dentro do bloco de inicializaçao");
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println(" ");
    }

    public static int[] getEpisodios() {
        return episodios;
    }
}