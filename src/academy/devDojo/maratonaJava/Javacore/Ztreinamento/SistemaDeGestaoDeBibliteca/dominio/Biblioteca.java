package academy.devDojo.maratonaJava.Javacore.Ztreinamento.SistemaDeGestaoDeBibliteca.dominio;

import academy.devDojo.maratonaJava.Javacore.Ztreinamento.ClassEnum.Usuario;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();

    public Livro mostrarLivros() {
        System.out.println("Livros: ");
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + ": " + livro.getDisponibilidade());
        }
        return null;
    }

    //criar metodo para buscar livros

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(Livro livro) {
        this.livros.add(livro);
    }
}
