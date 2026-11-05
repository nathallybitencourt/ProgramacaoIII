import java.util.HashMap;
import java.util.Scanner;

public class Questao3CadastroDePessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> pessoas = new HashMap<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Nome da " + i + "ª pessoa: ");
            String nome = scanner.nextLine();
            System.out.print("Idade de " + nome + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            pessoas.put(nome, idade);
        }

        System.out.print("Digite um nome para consultar: ");
        String nomeConsulta = scanner.nextLine();
        if (pessoas.containsKey(nomeConsulta)) {
            System.out.println("Idade: " + pessoas.get(nomeConsulta));
        } else {
            System.out.println("Nome não cadastrado.");
        }

        System.out.print("Digite um nome para remover: ");
        String nomeRemocao = scanner.nextLine();
        if (pessoas.containsKey(nomeRemocao)) {
            pessoas.remove(nomeRemocao);
            System.out.println("Pessoa removida.");
        } else {
            System.out.println("Nome não cadastrado.");
        }

        System.out.println("Mapa atualizado: " + pessoas);

        scanner.close();
    }
}
