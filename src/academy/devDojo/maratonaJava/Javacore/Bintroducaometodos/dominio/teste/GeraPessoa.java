package academy.devDojo.maratonaJava.Javacore.Bintroducaometodos.dominio.teste;

public class GeraPessoa {

    private String nome;
    private int idade;
    private char sexo;
    private boolean vivo;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public char getSexo() {
        return this.sexo;
    }
    
    public boolean getVivo() {
        return this.vivo;
    }
}
