package academy.devDojo.maratonaJava.Javacore.Ztreinamento.SistemaDeGestaoDeBibliteca.dominio;

public enum Genero {
    FICCAO("Ficcao"),
    BIOGRAFIA("Biografia"),
    FANTASIA("Fantasia"),
    ACAO("Ação"),
    TECNICO("Tecnico"),
    ESTUDOS("Estudos");

    private final String descricao;

    Genero(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
