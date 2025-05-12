package academy.devDojo.maratonaJava.Javacore.Ztreinamento.SistemaDeGestaoDeBibliteca.dominio;

import academy.devDojo.maratonaJava.Javacore.Ztreinamento.ClassEnum.Usuario;

public class TodosUsuarios {
    private Usuario[] usuarios;

    public TodosUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    public void livrosEmprestados() {
        for(Usuario user : usuarios) {
            System.out.println("Usuario e seus livros: ");
            user.getNome();
            user.livrosDoUsuario();
        }
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }
}
