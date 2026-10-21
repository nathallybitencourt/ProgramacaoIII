import java.util.Scanner;

public class Questao6 {

    private static final Scanner scanner = new Scanner(System.in);

    static void validarValores(double preco, int quantidade) throws IllegalArgumentException {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade não pode ser negativa.");
        }
    }

    static void registrarProduto(String descricao, String precoTexto, String quantidadeTexto) {
        System.out.println("Entrada: descrição=\"" + descricao + "\", preço=\"" + precoTexto
                + "\", quantidade=\"" + quantidadeTexto + "\"");
        try {
            if (descricao == null || descricao.trim().isEmpty()) {
                throw new IllegalArgumentException("A descrição não pode ficar vazia.");
            }
            double preco = Double.parseDouble(precoTexto.trim().replace(',', '.'));
            int quantidade = Integer.parseInt(quantidadeTexto.trim());

            validarValores(preco, quantidade);

            double total = preco * quantidade;
            System.out.printf("Produto registrado: %s | Preço: R$ %.2f | Quantidade: %d | "
                    + "Valor total em estoque: R$ %.2f%n", descricao, preco, quantidade, total);
        } catch (NumberFormatException e) {
            System.out.println("Erro: o preço deve ser numérico e a quantidade deve ser um número inteiro.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Encerrando registro do produto...");
            System.out.println();
        }
    }

    static void testes() {
        System.out.println("=== QUESTÃO 6 – Registro de Produto (testes automáticos) ===");
        registrarProduto("Caneta", "2.50", "100");
        registrarProduto("Caderno", "abc", "10");
        registrarProduto("Régua", "4,90", "2.5");
        registrarProduto("Borracha", "1.00", "-5");
        registrarProduto("Lápis", "-3", "10");
    }

    static String lerLinha(String mensagem) {
        System.out.print(mensagem);
        return scanner.hasNextLine() ? scanner.nextLine() : "";
    }

    static void interativo() {
        System.out.println("--- Agora registre um produto ---");
        String descricao = lerLinha("Descrição: ");
        String preco = lerLinha("Preço (ex.: 12.50): ");
        String quantidade = lerLinha("Quantidade: ");
        registrarProduto(descricao, preco, quantidade);
    }

    public static void main(String[] args) {
        testes();
        interativo();
    }
}
