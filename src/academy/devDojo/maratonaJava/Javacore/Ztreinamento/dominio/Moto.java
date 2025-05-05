package academy.devDojo.maratonaJava.Javacore.Ztreinamento.dominio;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super.setMarca(marca);
        super.setModelo(modelo);
        super.setAno(ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + this.cilindradas);
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
