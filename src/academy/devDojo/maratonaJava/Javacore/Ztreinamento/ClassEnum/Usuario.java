package academy.devDojo.maratonaJava.Javacore.Ztreinamento.ClassEnum;

import academy.devDojo.maratonaJava.Javacore.Ztreinamento.SistemaDeGestaoDeBibliteca.dominio.Livro;

public class Usuario {
    private String nome;
    private String cpf;
    private int idade;
    private Livro[] livros = new Livro[3];

    public Usuario(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    // falta a cada usuario ja adicionar ele em um array. 2 - 3
    // falta a parte de exibir os livros emprestados por cada usuario, provavelmente usando um for no array de usuarios cadastrados 3 - 3

    public Livro livrosDoUsuario() {
        for (Livro livro : this.livros) {
            System.out.println(livro);
        }
        return null;
    }

    public void emprestarLivros(Livro[] livros) {
        for (Livro livro : livros) {
            // declarei la em Livro um hashlist mas nn sei pq nn ta pegando aqui
            // acredito que tenho que criar um array estatico pra quando o constructor for chamadodo ja passando todos os livros a serem cadastrados
            // vo te que fazer um array la em Livro, para armazenar os livros existentes e fazer a verificaçao se esta disponivel.
            livro.setDisponibilidade("Indisponivel");
        }
        this.livros = livros;
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
