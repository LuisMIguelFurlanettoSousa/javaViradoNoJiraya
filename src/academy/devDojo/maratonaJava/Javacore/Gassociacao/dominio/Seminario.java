package academy.devDojo.maratonaJava.Javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario() {}

    public void imprime() {
        System.out.println("Titulo: " + this.titulo);

        System.out.println("Alunos: ");
        if (this.alunos != null) {
            for (Aluno aluno : this.alunos) {
                System.out.println(aluno.getNome());
            }
        } else {
            System.out.println("Nenhum");
        }


        System.out.println("Local: " + this.local.getEndereço());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
