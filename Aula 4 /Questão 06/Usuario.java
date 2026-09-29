package questao6;

public class Usuario {

    private String nome;
    private NivelAcesso nivel;

    public Usuario(String nome, NivelAcesso nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public NivelAcesso getNivel() {
        return nivel;
    }

    public boolean verificarPermissao(String recurso) {
        switch (nivel) {
            case BASICO:
                return recurso.equals("CONSULTAR");
            case INTERMEDIARIO:
                return recurso.equals("CONSULTAR") || recurso.equals("EDITAR");
            case ADMIN:
                return recurso.equals("CONSULTAR") || recurso.equals("EDITAR") || recurso.equals("GERENCIAR_USUARIOS");
            default:
                return false;
        }
    }
}
