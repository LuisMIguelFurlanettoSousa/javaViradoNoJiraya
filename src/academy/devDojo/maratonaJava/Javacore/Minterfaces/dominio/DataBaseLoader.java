package academy.devDojo.maratonaJava.Javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Puxando dados do banco de dados");
    }
}
