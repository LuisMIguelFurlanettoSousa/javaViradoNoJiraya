package academy.devDojo.maratonaJava.Javacore.Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_STORAGE = 10;

    void load();

    default void checkPermission() {
        System.out.println("Verificando permissao");
    }

    public static void maxStorage() {
        System.out.println("Max storage no DataLoader: " + MAX_STORAGE);
    }
}
