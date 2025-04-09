package academy.devDojo.maratonaJava.Javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

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

        double media = 0;
        for (double sal : this.salario) {
            media += sal;
        }

        media /= this.salario.length;

        System.out.println("Media: " + media);
    }
}
