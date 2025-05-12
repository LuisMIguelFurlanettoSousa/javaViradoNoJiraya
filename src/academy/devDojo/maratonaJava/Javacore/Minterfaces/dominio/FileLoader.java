package academy.devDojo.maratonaJava.Javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Lendo arquivos");
    }
}
