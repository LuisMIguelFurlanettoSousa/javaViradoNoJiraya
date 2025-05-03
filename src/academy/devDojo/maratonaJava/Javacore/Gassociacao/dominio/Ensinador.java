package academy.devDojo.maratonaJava.Javacore.Gassociacao.dominio;

public class Ensinador {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Ensinador(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("---Professor---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);

        if (this.seminarios == null) return;
        System.out.println("---Seminarios Cadastrados---");

        for (Seminario seminario : seminarios) {
            System.out.println("Titulo Seminario: " + seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereço());

            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;

            System.out.println("---Alunos---");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("nome: " + aluno.getNome() + " Idade: " + aluno.getIdade());
            }

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
