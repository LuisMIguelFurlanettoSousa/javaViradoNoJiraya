package academy.devDojo.maratonaJava.Javacore.Eblocosinicializaçao.dominio;

public class Anime {
    private String nome;
    private int[] episodios = new int[100];

    {
        System.out.println("dentro do bloco de inicializaçao");
        for (int i = 0; i < this.episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println(" ");
    }

    public int[] getEpisodios() {
        return episodios;
    }
}