package academy.devDojo.maratonaJava.Javacore.Ztreinamento.SistemaDeGestaoDeBibliteca.dominio;

public class Autor {
    private String nome;
    private int anaNascimento;

    public Autor(String nome, int anaNascimento) {
        this.nome = nome;
        this.anaNascimento = anaNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnaNascimento() {
        return anaNascimento;
    }

    public void setAnaNascimento(int anaNascimento) {
        this.anaNascimento = anaNascimento;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", anaNascimento=" + anaNascimento +
                '}';
    }
}
