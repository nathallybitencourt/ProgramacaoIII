import java.util.Scanner;

public class Questao3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static double calcularRaiz(int numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException(
                    "Não existe raiz quadrada real de número negativo (" + numero + ").");
        }
        return Math.sqrt(numero);
    }

    static void testar(int numero) {
        try {
            double raiz = calcularRaiz(numero);
            System.out.printf("Raiz quadrada de %d = %.4f%n", numero, raiz);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void testes() {
        System.out.println("=== QUESTÃO 3 – Validação de Raiz Quadrada (testes automáticos) ===");
        testar(0);
        testar(25);
        testar(-9);
    }

    static void interativo() {
        System.out.println();
        System.out.println("--- Agora digite seu valor ---");
        System.out.print("Digite um número inteiro: ");
        String texto = scanner.hasNextLine() ? scanner.nextLine() : "";
        try {
            testar(Integer.parseInt(texto.trim()));
        } catch (NumberFormatException e) {
            System.out.println("Erro: \"" + texto + "\" não é um número inteiro válido.");
        }
    }

    public static void main(String[] args) {
        testes();
        interativo();
    }
}
