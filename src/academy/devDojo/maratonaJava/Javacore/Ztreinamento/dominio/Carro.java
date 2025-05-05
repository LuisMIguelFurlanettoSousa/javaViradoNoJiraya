package academy.devDojo.maratonaJava.Javacore.Ztreinamento.dominio;

public class Carro extends Veiculo{
    private int numerosDePortas;

    public Carro(String marca, String modelo, int ano, int numerosDePortas) {
        super.setMarca(marca);
        super.setModelo(modelo);
        super.setAno(ano);
        this.numerosDePortas = numerosDePortas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Numero de portas: " + this.numerosDePortas);

    }

    public int getNumerosDePortas() {
        return numerosDePortas;
    }

    public void setNumerosDePortas(int numerosDePortas) {
        this.numerosDePortas = numerosDePortas;
    }
}
