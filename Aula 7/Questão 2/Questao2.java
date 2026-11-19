import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream ps = null;

        try {
            ps = new PrintStream("anotacoes.txt");
            System.out.println("Digite as linhas a serem gravadas (digite FIM para encerrar):");

            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                if (linha.equals("FIM")) {
                    break;
                }
                ps.println(linha);
            }

            if (ps.checkError()) {
                System.out.println("Ocorreu um problema durante a gravacao do arquivo.");
            } else {
                System.out.println("Gravacao concluida com sucesso em anotacoes.txt.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel criar o arquivo: " + e.getMessage());
        } finally {
            if (ps != null) {
                ps.close();
            }
            sc.close();
        }
    }
}
