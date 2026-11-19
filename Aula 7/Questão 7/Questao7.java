import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Questao7 {
    private static final String ARQUIVO = "alunos.txt";
    private static final String SEPARADOR = ";";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println();
            System.out.println("== CADASTRO DE ALUNOS ==");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Calcular media das notas");
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
                    cadastrar(sc);
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    calcularMedia();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema.");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        }

        sc.close();
    }

    private static void cadastrar(Scanner sc) {
        System.out.print("Nome: ");
        String nome = sc.nextLine().trim();
        System.out.print("Curso: ");
        String curso = sc.nextLine().trim();
        System.out.print("Nota: ");
        double nota;
        try {
            nota = Double.parseDouble(sc.nextLine().trim().replace(",", "."));
        } catch (NumberFormatException e) {
            System.out.println("Nota invalida. Cadastro nao realizado.");
            return;
        }

        if (nome.isEmpty() || curso.isEmpty()) {
            System.out.println("Nome e curso sao obrigatorios. Cadastro nao realizado.");
            return;
        }

        PrintStream ps = null;
        try {
            ps = new PrintStream(new FileOutputStream(ARQUIVO, true));
            ps.println(nome + SEPARADOR + curso + SEPARADOR + nota);
            if (ps.checkError()) {
                System.out.println("Ocorreu um problema ao gravar o registro.");
            } else {
                System.out.println("Aluno cadastrado com sucesso.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel abrir o arquivo para gravacao: " + e.getMessage());
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
    }

    private static boolean arquivoDisponivel() {
        File arquivo = new File(ARQUIVO);
        if (!arquivo.exists()) {
            System.out.println("O arquivo " + ARQUIVO + " nao existe.");
            return false;
        }
        if (arquivo.length() == 0) {
            System.out.println("O arquivo " + ARQUIVO + " esta vazio.");
            return false;
        }
        return true;
    }

    private static void listar() {
        if (!arquivoDisponivel()) {
            return;
        }

        BufferedReader br = null;
        try {
            InputStream is = new FileInputStream(ARQUIVO);
            InputStreamReader isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            int contador = 0;
            String linha = br.readLine();
            while (linha != null) {
                String[] dados = linha.split(SEPARADOR);
                if (dados.length == 3) {
                    contador++;
                    System.out.println(contador + ") Nome: " + dados[0]
                            + " | Curso: " + dados[1]
                            + " | Nota: " + dados[2]);
                }
                linha = br.readLine();
            }

            if (contador == 0) {
                System.out.println("O arquivo nao possui registros validos.");
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
        }
    }

    private static void calcularMedia() {
        if (!arquivoDisponivel()) {
            return;
        }

        BufferedReader br = null;
        try {
            InputStream is = new FileInputStream(ARQUIVO);
            InputStreamReader isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            double soma = 0;
            int quantidade = 0;
            String linha = br.readLine();
            while (linha != null) {
                String[] dados = linha.split(SEPARADOR);
                if (dados.length == 3) {
                    try {
                        soma += Double.parseDouble(dados[2]);
                        quantidade++;
                    } catch (NumberFormatException e) {
                        System.out.println("Registro com nota invalida ignorado: " + linha);
                    }
                }
                linha = br.readLine();
            }

            if (quantidade == 0) {
                System.out.println("Nao ha notas validas para calcular a media.");
            } else {
                System.out.printf("Media das notas (%d alunos): %.2f%n", quantidade, soma / quantidade);
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
        }
    }
}
