package academy.devDojo.maratonaJava.Javacore.Ztreinamento.SistemaDeGestaoDeBibliteca.dominio;

public class Livro {
    private String titulo;
    private String autor;
    private Genero genero;
    private int ano;
    private String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, Genero genero, int ano, String isbn) {
        if (ano <= 0) throw new IllegalArgumentException("Ano inválido.");
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ano = ano;
        this.isbn = isbn;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return String.format("Título: %s | Autor: %s | Gênero: %s | Ano: %d | ISBN: %s | Status: %s",
                titulo, autor, genero, ano, isbn, disponivel ? "Disponível" : "Emprestado");
    }
}
