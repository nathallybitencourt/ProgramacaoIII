package questao6;

public class Main {

    public static void main(String[] args) {
        Usuario[] usuarios = {
            new Usuario("Lia", NivelAcesso.BASICO),
            new Usuario("Mateus", NivelAcesso.INTERMEDIARIO),
            new Usuario("Nina", NivelAcesso.ADMIN)
        };

        String[] recursos = { "CONSULTAR", "EDITAR", "GERENCIAR_USUARIOS" };

        for (Usuario u : usuarios) {
            System.out.println("=== " + u.getNome() + " (" + u.getNivel() + ") ===");
            for (String r : recursos) {
                String resultado = u.verificarPermissao(r) ? "PERMITIDO" : "NEGADO";
                System.out.println("  " + r + ": " + resultado);
            }
            System.out.println();
        }
    }
}
