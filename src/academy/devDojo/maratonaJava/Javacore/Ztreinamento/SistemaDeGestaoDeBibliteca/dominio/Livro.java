package academy.devDojo.maratonaJava.Javacore.Ztreinamento.SistemaDeGestaoDeBibliteca.dominio;

import java.util.ArrayList;
import java.util.Date;

public class Livro {
    private String titulo;
    private Autor autor;
    private Genero genero;
    private int anoPublicacao;
    private int ISBN;
    private String disponibilidade = "Disponivel";

    public ArrayList todosLivros = new ArrayList();

    public Livro(String titulo, Autor autor, Genero genero, int anoPublicacao, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoPublicacao = anoPublicacao;
        this.ISBN = ISBN;

        todosLivros.add(titulo);
    }

    public Livro() {

    };

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    Date data = new Date();

    private boolean verificaData() {
        if (anoPublicacao < 0 && anoPublicacao > data.getYear()) {
            return false;
        }
        return true;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        if (verificaData()) {
            this.anoPublicacao = anoPublicacao;
        }
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "CadastroLivros{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero=" + genero +
                ", anoPublicacao=" + anoPublicacao +
                ", ISBN=" + ISBN +
                '}';
    }
}
