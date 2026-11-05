import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Questao7RegistroDeNotas {
    public static double calcularMedia(List<Double> notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public static void listarAlunos(Map<String, List<Double>> alunos) {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for (Map.Entry<String, List<Double>> aluno : alunos.entrySet()) {
                System.out.println(aluno.getKey() + " - Notas: " + aluno.getValue()
                        + " - Média: " + calcularMedia(aluno.getValue()));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> alunos = new HashMap<>();
        String opcao;

        do {
            System.out.println();
            System.out.println("1 - Cadastrar aluno e notas");
            System.out.println("2 - Listar alunos e médias");
            System.out.println("3 - Consultar aluno");
            System.out.println("4 - Remover aluno");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextLine();

            String nome;
            switch (opcao) {
                case "1":
                    System.out.print("Nome do aluno: ");
                    nome = scanner.nextLine();
                    if (!alunos.containsKey(nome)) {
                        alunos.put(nome, new ArrayList<>());
                    }
                    String continuar;
                    do {
                        System.out.print("Nota: ");
                        alunos.get(nome).add(Double.parseDouble(scanner.nextLine().replace(",", ".")));
                        System.out.print("Adicionar outra nota? (s/n): ");
                        continuar = scanner.nextLine();
                    } while (continuar.equalsIgnoreCase("s"));
                    System.out.println("Média de " + nome + ": " + calcularMedia(alunos.get(nome)));
                    break;
                case "2":
                    listarAlunos(alunos);
                    break;
                case "3":
                    System.out.print("Nome do aluno: ");
                    nome = scanner.nextLine();
                    if (alunos.containsKey(nome)) {
                        System.out.println("Notas: " + alunos.get(nome));
                        System.out.println("Média: " + calcularMedia(alunos.get(nome)));
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case "4":
                    System.out.print("Nome do aluno: ");
                    nome = scanner.nextLine();
                    if (alunos.containsKey(nome)) {
                        alunos.remove(nome);
                        System.out.println("Aluno removido.");
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    System.out.println("Dados atualizados:");
                    listarAlunos(alunos);
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
