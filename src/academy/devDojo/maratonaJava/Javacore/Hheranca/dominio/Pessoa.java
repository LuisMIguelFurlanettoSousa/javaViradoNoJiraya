package academy.devDojo.maratonaJava.Javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inializacqao statico da classe pai (Pessoa)");
    }

    {
        System.out.println("Dentro do blocoo de inicializao da classe pai 1 (Peesoa)");
    }

    {
        System.out.println("Dentro do blocoo de inicializao da classe pai 2 (Peesoa)");
    }

    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Dentro do construtor (classe pai)");
    }

    public Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Rua: " + this.endereco.getRua() + " Cep: " + this.endereco.getCep());
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
