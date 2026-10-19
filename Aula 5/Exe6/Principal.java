package exercicio6;

public class Principal {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Pedro", NivelAcesso.BASICO);
        Usuario u2 = new Usuario("Larissa", NivelAcesso.INTERMEDIARIO);
        Usuario u3 = new Usuario("Rafael", NivelAcesso.ADMIN);

        Usuario[] usuarios = {u1, u2, u3};
        String[] recursos = {"CONSULTAR", "EDITAR", "GERENCIAR_USUARIOS"};

        for (int i = 0; i < usuarios.length; i++) {
            System.out.println("Usuario: " + usuarios[i].getNome() + " - Nivel: " + usuarios[i].getNivel());
            for (int j = 0; j < recursos.length; j++) {
                if (usuarios[i].verificarPermissao(recursos[j])) {
                    System.out.println("  " + recursos[j] + ": acesso permitido");
                } else {
                    System.out.println("  " + recursos[j] + ": acesso negado");
                }
            }
            System.out.println();
        }
    }
}
