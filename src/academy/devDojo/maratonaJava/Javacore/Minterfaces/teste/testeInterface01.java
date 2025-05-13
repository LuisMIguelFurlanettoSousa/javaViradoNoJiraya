package academy.devDojo.maratonaJava.Javacore.Minterfaces.teste;

import academy.devDojo.maratonaJava.Javacore.Minterfaces.dominio.DataBaseLoader;
import academy.devDojo.maratonaJava.Javacore.Minterfaces.dominio.DataLoader;
import academy.devDojo.maratonaJava.Javacore.Minterfaces.dominio.FileLoader;

public class testeInterface01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.maxStorage();
        DataBaseLoader.maxStorage();
    }
}
