import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao6ControleDeEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> estoque = new HashMap<>();
        String opcao;

        do {
            System.out.println();
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Consultar quantidade");
            System.out.println("3 - Atualizar quantidade");
            System.out.println("4 - Remover produto");
            System.out.println("5 - Exibir todos os produtos");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextLine();

            String produto;
            switch (opcao) {
                case "1":
                    System.out.print("Produto: ");
                    produto = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    estoque.put(produto, scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Produto cadastrado.");
                    break;
                case "2":
                    System.out.print("Produto: ");
                    produto = scanner.nextLine();
                    if (estoque.containsKey(produto)) {
                        System.out.println("Quantidade: " + estoque.get(produto));
                    } else {
                        System.out.println("Produto inexistente.");
                    }
                    break;
                case "3":
                    System.out.print("Produto: ");
                    produto = scanner.nextLine();
                    if (estoque.containsKey(produto)) {
                        System.out.print("Nova quantidade: ");
                        estoque.put(produto, scanner.nextInt());
                        scanner.nextLine();
                        System.out.println("Quantidade atualizada.");
                    } else {
                        System.out.println("Produto inexistente.");
                    }
                    break;
                case "4":
                    System.out.print("Produto: ");
                    produto = scanner.nextLine();
                    if (estoque.containsKey(produto)) {
                        estoque.remove(produto);
                        System.out.println("Produto removido.");
                    } else {
                        System.out.println("Produto inexistente.");
                    }
                    break;
                case "5":
                    if (estoque.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        for (Map.Entry<String, Integer> item : estoque.entrySet()) {
                            System.out.println(item.getKey() + ": " + item.getValue());
                        }
                    }
                    break;
                case "0":
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (!opcao.equals("0"));

        scanner.close();
    }
}
