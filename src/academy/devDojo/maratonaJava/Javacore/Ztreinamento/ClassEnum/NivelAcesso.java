package academy.devDojo.maratonaJava.Javacore.Ztreinamento.ClassEnum;

import academy.devDojo.maratonaJava.Javacore.Kenum.dominio.TipoCliente;

public enum NivelAcesso {
    ADMIM(1, "Admim"),
    MODERADOR(2, "Moderador"),
    USUARIO(3, "Usuario");

    public final int codigo;
    private String descricao;

    NivelAcesso(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static NivelAcesso porCodigo(int codigo) {
        for (NivelAcesso nivelAcesso : values()) {
            if (nivelAcesso.codigo == codigo) {
                return nivelAcesso;
            }
        }
        return null;
    }

    public String getDescricao() {
        return descricao;
    }

}
