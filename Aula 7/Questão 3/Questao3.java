import java.io.File;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um caminho: ");
        String caminho = sc.nextLine();

        File recurso = new File(caminho);

        if (!recurso.exists()) {
            System.out.println("O recurso informado nao existe.");
        } else {
            System.out.println("O recurso existe.");
            System.out.println("Caminho absoluto: " + recurso.getAbsolutePath());

            if (recurso.isFile()) {
                System.out.println("Tipo: arquivo");
                System.out.println("Tamanho: " + recurso.length() + " bytes");
            } else if (recurso.isDirectory()) {
                System.out.println("Tipo: diretorio");
                File[] conteudo = recurso.listFiles();

                if (conteudo == null) {
                    System.out.println("Nao foi possivel listar o conteudo do diretorio.");
                } else if (conteudo.length == 0) {
                    System.out.println("O diretorio esta vazio.");
                } else {
                    System.out.println("Conteudo do diretorio:");
                    for (File item : conteudo) {
                        if (item.isDirectory()) {
                            System.out.println("[DIR]  " + item.getName());
                        } else {
                            System.out.println("[ARQ]  " + item.getName());
                        }
                    }
                }
            }
        }

        sc.close();
    }
}
