import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static int dividir(int numerador, int denominador) throws ArithmeticException {
        return numerador / denominador;
    }

    static boolean processar(int numerador, int denominador) {
        try {
            int resultado = dividir(numerador, denominador);
            System.out.printf("Resultado: %d / %d = %d%n", numerador, denominador, resultado);
            return true;
        } catch (ArithmeticException e) {
            System.out.println("Erro: não é possível dividir por zero. Informe um divisor diferente de zero.");
            System.out.println("(Detalhe técnico: " + e.getMessage() + ")");
            return false;
        }
    }

    static void testes() {
        System.out.println("=== QUESTÃO 1 – Divisão Segura (testes automáticos) ===");
        processar(10, 2);
        processar(7, 0);
        processar(-9, 3);
    }

    static void interativo() {
        System.out.println();
        System.out.println("--- Agora digite seus valores ---");
        boolean continuar = true;
        do {
            try {
                System.out.print("Digite o numerador (inteiro): ");
                if (!scanner.hasNext()) return;
                int numerador = scanner.nextInt();
                System.out.print("Digite o denominador (inteiro): ");
                if (!scanner.hasNext()) return;
                int denominador = scanner.nextInt();
                scanner.nextLine();
                continuar = !processar(numerador, denominador);
                if (continuar) System.out.println("Tente novamente.\n");
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Entrada inválida: digite apenas números inteiros. Tente novamente.\n");
            }
        } while (continuar);
    }

    public static void main(String[] args) {
        testes();
        interativo();
    }
}
