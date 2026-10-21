import java.util.Scanner;

public class Questao2 {

    private static final Scanner scanner = new Scanner(System.in);

    static void converter(String texto) {
        System.out.println("Entrada: \"" + texto + "\"");
        try {
            int numero = Integer.parseInt(texto.trim());
            System.out.println("Conversão bem-sucedida! Valor inteiro: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: \"" + texto + "\" não é um número inteiro válido.");
        } finally {
            System.out.println("Encerrando programa...");
            System.out.println();
        }
    }

    static void testes() {
        System.out.println("=== QUESTÃO 2 – Conversão de Texto para Número (testes automáticos) ===");
        converter("42");
        converter("abc");
        converter("3.5");
    }

    static void interativo() {
        System.out.println("--- Agora digite seu valor ---");
        System.out.print("Digite um número inteiro: ");
        String texto = scanner.hasNextLine() ? scanner.nextLine() : "";
        converter(texto);
    }

    public static void main(String[] args) {
        testes();
        interativo();
    }
}
