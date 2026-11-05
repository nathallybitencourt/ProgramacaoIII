import java.util.ArrayList;
import java.util.Scanner;

public class Questao4CatalogoDeLivros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> livros = new ArrayList<>();
        String opcao;

        do {
            System.out.println();
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Pesquisar título");
            System.out.println("4 - Remover livro pelo índice");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Título: ");
                    livros.add(scanner.nextLine());
                    System.out.println("Livro adicionado com sucesso.");
                    break;
                case "2":
                    if (livros.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado.");
                    } else {
                        for (int i = 0; i < livros.size(); i++) {
                            System.out.println(i + " - " + livros.get(i));
                        }
                        System.out.println("Listagem concluída.");
                    }
                    break;
                case "3":
                    System.out.print("Título a pesquisar: ");
                    int posicao = livros.indexOf(scanner.nextLine());
                    if (posicao >= 0) {
                        System.out.println("Livro encontrado no índice " + posicao + ".");
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case "4":
                    System.out.print("Índice: ");
                    try {
                        int indice = Integer.parseInt(scanner.nextLine());
                        if (indice >= 0 && indice < livros.size()) {
                            String removido = livros.remove(indice);
                            System.out.println("Livro \"" + removido + "\" removido com sucesso.");
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Índice inválido.");
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
