package academy.devDojo.maratonaJava.Javacore.Ztreinamento.SistemaDeGestaoDeBibliteca.dominio;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa {
    private List<Livro> livrosEmprestados;

    public Usuario(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        this.livrosEmprestados = new ArrayList<>();
    }

    public boolean emprestarLivro(Livro livro) {
        if (livrosEmprestados.size() >= 3 || !livro.isDisponivel()) return false;
        livrosEmprestados.add(livro);
        livro.setDisponivel(false);
        return true;
    }

    public boolean devolverLivro(String isbn) {
        for (Livro l : livrosEmprestados) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                l.setDisponivel(true);
                livrosEmprestados.remove(l);
                return true;
            }
        }
        return false;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\nLivros emprestados:\n");
        if (livrosEmprestados.isEmpty()) {
            sb.append("Nenhum livro emprestado.\n");
        } else {
            for (Livro livro : livrosEmprestados) {
                sb.append(" - ").append(livro.getTitulo()).append("\n");
            }
        }
        return sb.toString();
    }
}
