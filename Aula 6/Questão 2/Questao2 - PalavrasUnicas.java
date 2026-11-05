import java.util.HashSet;
import java.util.Scanner;

public class Questao2PalavrasUnicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> palavras = new HashSet<>();

        System.out.println("Digite as palavras (digite \"fim\" para encerrar):");
        String palavra = scanner.nextLine();
        while (!palavra.equals("fim")) {
            palavras.add(palavra);
            palavra = scanner.nextLine();
        }

        System.out.println("Palavras únicas:");
        for (String p : palavras) {
            System.out.println(p);
        }

        if (palavras.contains("Java")) {
            System.out.println("A palavra \"Java\" foi digitada.");
        } else {
            System.out.println("A palavra \"Java\" não foi digitada.");
        }

        System.out.println("Quantidade de palavras distintas: " + palavras.size());

        scanner.close();
    }
}
