package academy.devDojo.maratonaJava.Javacore.treinamentoPratica.controleDeEstoque;

public class Produto {
    private String name;
    private double price;
    private int stock;
    private Object[] info;

    {
        System.out.println("1 - Adicionar produto");
        System.out.println("2 - Remover produto");
        System.out.println("3 - Atualizar quantidade");
        System.out.println("4 - Listar produtos");
    }

    public Produto(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Produto() {}

    public void setNewProduct(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}
