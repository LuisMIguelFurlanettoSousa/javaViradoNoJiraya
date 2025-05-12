package academy.devDojo.maratonaJava.Javacore.Ztreinamento.SistemaDeGestaoDeBibliteca.dominio;

public enum Disponibilidade {
    DISPONIVEL("Disponivel"),
    INDISPONIVEL("Indisponivel");

    private final String disponibilidade;

    Disponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }
}
