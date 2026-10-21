import java.util.Scanner;

public class Questao5 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void validarIdade(int idade) throws IdadeInvalidaException {
        if (idade < 0) {
            throw new IdadeInvalidaException("A idade não pode ser negativa (valor informado: " + idade + ").");
        }
    }

    public static void registrarPessoa(String nome, int idade) throws IdadeInvalidaException {
        validarIdade(idade);
        System.out.println("Pessoa registrada: " + nome + ", " + idade + " ano(s).");
    }

    static void processar(String nome, int idade) {
        try {
            registrarPessoa(nome, idade);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro ao registrar " + nome + ": " + e.getMessage());
        }
    }

    static void testes() {
        System.out.println("=== QUESTÃO 5 – Método com Exceção Propagada (testes automáticos) ===");
        processar("Marcelo", 25);
        processar("Bebê", 0);
        processar("Maria", -3);
    }

    static void interativo() {
        System.out.println();
        System.out.println("--- Agora digite seus dados ---");
        System.out.print("Nome: ");
        String nome = scanner.hasNextLine() ? scanner.nextLine() : "";
        System.out.print("Idade: ");
        String texto = scanner.hasNextLine() ? scanner.nextLine() : "";
        try {
            processar(nome, Integer.parseInt(texto.trim()));
        } catch (NumberFormatException e) {
            System.out.println("Erro: a idade deve ser um número inteiro.");
        }
    }

    public static void main(String[] args) {
        testes();
        interativo();
    }
}

class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}
