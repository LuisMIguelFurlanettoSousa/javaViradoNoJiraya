package academy.devDojo.maratonaJava.Javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Puxando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do data base");
    }

    @Override
    public void checkPermission() {
        System.out.println("verificando permisao de leitura de data base");
    }

    public static void maxStorage() {
        System.out.println("Max storage no DataBaseLoader: " + MAX_STORAGE);
    }
}
