import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o caminho do arquivo de texto: ");
        String caminho = sc.nextLine();

        BufferedReader br = null;

        int linhas = 0;
        int palavras = 0;
        int caracteres = 0;
        String maiorLinha = null;
        int numeroMaiorLinha = 0;

        try {
            InputStream is = new FileInputStream(caminho);
            InputStreamReader isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            String linha = br.readLine();
            while (linha != null) {
                linhas++;
                caracteres += linha.length();

                String texto = linha.trim();
                if (!texto.isEmpty()) {
                    palavras += texto.split("\\s+").length;
                }

                if (maiorLinha == null || linha.length() > maiorLinha.length()) {
                    maiorLinha = linha;
                    numeroMaiorLinha = linhas;
                }

                linha = br.readLine();
            }

            System.out.println("Quantidade de linhas: " + linhas);
            System.out.println("Quantidade de palavras: " + palavras);
            System.out.println("Quantidade de caracteres: " + caracteres);

            if (maiorLinha != null) {
                System.out.println("Linha com mais caracteres (linha " + numeroMaiorLinha + ", "
                        + maiorLinha.length() + " caracteres): " + maiorLinha);
            } else {
                System.out.println("O arquivo está vazio.");
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Erro ao fechar o arquivo: " + e.getMessage());
            }
            sc.close();
        }
    }
}
