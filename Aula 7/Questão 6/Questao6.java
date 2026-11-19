import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o caminho do diretorio: ");
        File diretorio = new File(sc.nextLine());

        int opcao = -1;
        while (opcao != 0) {
            System.out.println();
            System.out.println("== MENU ==");
            System.out.println("1 - Verificar se o diretorio existe");
            System.out.println("2 - Criar o diretorio");
            System.out.println("3 - Listar arquivos e subdiretorios");
            System.out.println("4 - Exibir caminho absoluto e tamanho dos arquivos");
            System.out.println("5 - Criar novo arquivo de texto no diretorio");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");

            try {
                opcao = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Opcao invalida.");
                continue;
            }

            switch (opcao) {
                case 1:
                    verificar(diretorio);
                    break;
                case 2:
                    criarDiretorio(diretorio);
                    break;
                case 3:
                    listar(diretorio);
                    break;
                case 4:
                    exibirDetalhes(diretorio);
                    break;
                case 5:
                    System.out.print("Nome do novo arquivo (ex: notas.txt): ");
                    criarArquivo(diretorio, sc.nextLine());
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        }

        sc.close();
    }

    private static boolean diretorioValido(File diretorio) {
        if (!diretorio.exists()) {
            System.out.println("Operacao nao concluida: o diretorio nao existe.");
            return false;
        }
        if (!diretorio.isDirectory()) {
            System.out.println("Operacao nao concluida: o caminho informado nao e um diretorio.");
            return false;
        }
        return true;
    }

    private static void verificar(File diretorio) {
        if (diretorio.exists() && diretorio.isDirectory()) {
            System.out.println("O diretorio existe.");
        } else if (diretorio.exists()) {
            System.out.println("O caminho existe, mas nao e um diretorio.");
        } else {
            System.out.println("O diretorio nao existe.");
        }
    }

    private static void criarDiretorio(File diretorio) {
        if (diretorio.exists()) {
            System.out.println("Operacao nao concluida: o caminho ja existe.");
        } else if (diretorio.mkdirs()) {
            System.out.println("Diretorio criado com sucesso.");
        } else {
            System.out.println("Operacao nao concluida: nao foi possivel criar o diretorio.");
        }
    }

    private static void listar(File diretorio) {
        if (!diretorioValido(diretorio)) {
            return;
        }
        File[] itens = diretorio.listFiles();
        if (itens == null) {
            System.out.println("Operacao nao concluida: nao foi possivel listar o diretorio.");
        } else if (itens.length == 0) {
            System.out.println("O diretorio esta vazio.");
        } else {
            for (File item : itens) {
                if (item.isDirectory()) {
                    System.out.println("[DIR]  " + item.getName());
                } else {
                    System.out.println("[ARQ]  " + item.getName());
                }
            }
        }
    }

    private static void exibirDetalhes(File diretorio) {
        if (!diretorioValido(diretorio)) {
            return;
        }
        System.out.println("Caminho absoluto do diretorio: " + diretorio.getAbsolutePath());
        File[] itens = diretorio.listFiles();
        if (itens == null) {
            System.out.println("Operacao nao concluida: nao foi possivel acessar o diretorio.");
            return;
        }
        boolean encontrouArquivo = false;
        for (File item : itens) {
            if (item.isFile()) {
                encontrouArquivo = true;
                System.out.println(item.getAbsolutePath() + " - " + item.length() + " bytes");
            }
        }
        if (!encontrouArquivo) {
            System.out.println("Nao ha arquivos no diretorio.");
        }
    }

    private static void criarArquivo(File diretorio, String nome) {
        if (!diretorioValido(diretorio)) {
            return;
        }
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Operacao nao concluida: nome de arquivo invalido.");
            return;
        }
        File novo = new File(diretorio, nome.trim());
        try {
            if (novo.createNewFile()) {
                System.out.println("Arquivo criado: " + novo.getAbsolutePath());
            } else {
                System.out.println("Operacao nao concluida: o arquivo ja existe.");
            }
        } catch (IOException e) {
            System.out.println("Operacao nao concluida: erro ao criar o arquivo: " + e.getMessage());
        }
    }
}
