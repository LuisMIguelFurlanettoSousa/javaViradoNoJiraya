package academy.devDojo.maratonaJava.Javacore.Minterfaces.dominio;

import java.sql.SQLOutput;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Lendo arquivos");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dador do arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("verificando permissao de leitura de arquivo");
    }
}
