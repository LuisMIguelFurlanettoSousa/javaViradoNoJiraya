package academy.devDojo.maratonaJava.Javacore.Gassociacao.dominio;

public class Local {
    private String endereço;

    public void imprime() {
        System.out.println(this.endereço);
    }

    public Local(String endereço) {
        this.endereço = endereço;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
}
