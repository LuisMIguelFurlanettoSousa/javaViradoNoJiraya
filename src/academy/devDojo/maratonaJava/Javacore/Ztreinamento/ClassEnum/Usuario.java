package academy.devDojo.maratonaJava.Javacore.Ztreinamento.ClassEnum;

import academy.devDojo.maratonaJava.Javacore.Ztreinamento.SistemaDeGestaoDeBibliteca.dominio.Disponibilidade;
import academy.devDojo.maratonaJava.Javacore.Ztreinamento.SistemaDeGestaoDeBibliteca.dominio.Livro;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String cpf;
    private int idade;
    private ArrayList<Livro> livros;

    public Usuario(String nome, String cpf, int idade, ArrayList<Livro> livros) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.livros = livros;
    }

    public void emprestarLivro(ArrayList<Livro> livros, Livro livro) {
        for (Livro i : livros) {
            if (i.getTitulo().equals(livro.getTitulo()) && i.getDisponibilidade() == Disponibilidade.DISPONIVEL) {
                this.livros.add(livro);
                i.setDisponibilidade(Disponibilidade.INDISPONIVEL);
            }
        }
    }

    // eu ainda tenho que criar uma lista de livros que estao emprestados

    public void devolverLivros(Livro livro) {
        for (Livro i : livros) {
            if (livro == i) {
                int indexLivro = this.livros.indexOf(i);
                this.livros.remove(indexLivro);
                i.setDisponibilidade(Disponibilidade.DISPONIVEL);
            }
        }
    }

    public Livro livrosDoUsuario() {
        for (Livro livro : this.livros) {
            System.out.println(livro);
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
