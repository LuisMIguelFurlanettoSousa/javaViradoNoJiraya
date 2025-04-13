package academy.devDojo.maratonaJava.Javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getSalario() {
        return this.salario;
    }

    public double getMedia() {
        return this.media;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (salario == null) {
            return;
        }

        System.out.print("Salarios: ");
        for (double sal : this.salario){
            System.out.print(sal + " ");
        }
        System.out.println();

        media();
    }

    public void media() {
        if (salario == null) {
            return;
        }

        for (double sal : this.salario) {
            this.media += sal;
        }

        this.media /= this.salario.length;

        System.out.println("Media: " + media);
    }
}
