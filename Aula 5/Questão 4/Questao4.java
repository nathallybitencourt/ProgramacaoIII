import java.util.Scanner;

public class Questao4 {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String[] NOMES = {"Ana", "Bruno", "Carla", "Diego", "Elisa"};

    static void consultar(int indice) {
        try {
            System.out.println("Posição " + indice + ": " + NOMES[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: a posição " + indice + " não existe. "
                    + "Informe um índice entre 0 e " + (NOMES.length - 1) + ".");
        }
    }

    static void testes() {
        System.out.println("=== QUESTÃO 4 – Acesso a Posições de um Vetor (testes automáticos) ===");
        consultar(0);
        consultar(4);
        consultar(-1);
        consultar(5);
        consultar(10);
    }

    static void interativo() {
        System.out.println();
        System.out.println("--- Agora consulte uma posição ---");
        System.out.print("Digite um índice (0 a " + (NOMES.length - 1) + "): ");
        String texto = scanner.hasNextLine() ? scanner.nextLine() : "";
        try {
            consultar(Integer.parseInt(texto.trim()));
        } catch (NumberFormatException e) {
            System.out.println("Erro: o índice deve ser um número inteiro.");
        }
    }

    public static void main(String[] args) {
        testes();
        interativo();
    }
}
