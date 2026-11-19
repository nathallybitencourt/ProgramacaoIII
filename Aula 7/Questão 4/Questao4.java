import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o caminho do arquivo de origem: ");
        String origem = sc.nextLine();
        System.out.print("Informe o caminho do arquivo de destino: ");
        String destino = sc.nextLine();

        File arquivoOrigem = new File(origem);
        if (!arquivoOrigem.exists() || !arquivoOrigem.isFile()) {
            System.out.println("O arquivo de origem nao existe ou nao e um arquivo valido.");
            sc.close();
            return;
        }

        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(arquivoOrigem);
            os = new FileOutputStream(destino);

            byte[] buffer = new byte[1024];
            int lidos = is.read(buffer);
            while (lidos != -1) {
                os.write(buffer, 0, lidos);
                lidos = is.read(buffer);
            }

            System.out.println("Copia concluida com sucesso.");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado ou nao pode ser criado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro de leitura ou escrita durante a copia: " + e.getMessage());
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                System.out.println("Erro ao fechar os arquivos: " + e.getMessage());
            }
            sc.close();
        }
    }
}
