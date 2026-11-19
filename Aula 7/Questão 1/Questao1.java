import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o caminho do arquivo de texto: ");
        String caminho = sc.nextLine();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        try {
            is = new FileInputStream(caminho);
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            String linha = br.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Nao foi possivel abrir ou ler o arquivo: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                } else if (isr != null) {
                    isr.close();
                } else if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                System.out.println("Erro ao fechar o arquivo: " + e.getMessage());
            }
            sc.close();
        }
    }
}
