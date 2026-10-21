import java.util.ArrayList;
import java.util.Scanner;

public class Questao7 {

    private static final Scanner scanner = new Scanner(System.in);

    static String validarNome(String nome) throws DadoInvalidoException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new DadoInvalidoException("o nome não pode ficar vazio.");
        }
        return nome.trim();
    }

    static int converterIdade(String texto) throws DadoInvalidoException {
        try {
            return Integer.parseInt(texto.trim());
        } catch (NumberFormatException e) {
            throw new DadoInvalidoException("a idade \"" + texto + "\" não é um número inteiro.", e);
        }
    }

    static double converterNota(String texto) throws DadoInvalidoException {
        try {
            return Double.parseDouble(texto.trim().replace(',', '.'));
        } catch (NumberFormatException e) {
            throw new DadoInvalidoException("a nota \"" + texto + "\" não é um número.", e);
        }
    }

    static void validarIdade(int idade) throws DadoInvalidoException {
        if (idade < 0) {
            throw new DadoInvalidoException("a idade não pode ser negativa (" + idade + ").");
        }
    }

    static void validarNota(double nota) throws DadoInvalidoException {
        if (nota < 0 || nota > 10) {
            throw new DadoInvalidoException("a nota deve estar entre 0 e 10 (" + nota + ").");
        }
    }

    static Aluno criarAluno(String nomeTexto, String idadeTexto, String notaTexto)
            throws DadoInvalidoException {
        String nome = validarNome(nomeTexto);
        int idade = converterIdade(idadeTexto);
        validarIdade(idade);
        double nota = converterNota(notaTexto);
        validarNota(nota);
        return new Aluno(nome, idade, nota);
    }

    static class Cadastro {
        private final ArrayList<Aluno> alunos = new ArrayList<>();
        private int aceitos = 0;
        private int rejeitados = 0;
        private int tentativas = 0;

        void cadastrar(String nome, String idade, String nota) {
            tentativas++;
            try {
                Aluno aluno = criarAluno(nome, idade, nota);
                alunos.add(aluno);
                aceitos++;
                System.out.println("Cadastro ACEITO: " + aluno);
            } catch (DadoInvalidoException e) {
                rejeitados++;
                System.out.println("Cadastro REJEITADO: " + e.getMessage());
            } finally {
                System.out.println("Tentativa nº " + tentativas + " finalizada.");
                System.out.println();
            }
        }

        void exibirResumo() {
            System.out.println("---------- RESUMO DO CADASTRO ----------");
            System.out.println("Cadastros aceitos:    " + aceitos);
            System.out.println("Cadastros rejeitados: " + rejeitados);
            if (!alunos.isEmpty()) {
                System.out.println("Alunos cadastrados:");
                for (Aluno a : alunos) {
                    System.out.println("  - " + a);
                }
            }
            System.out.println("----------------------------------------");
        }
    }

    static void testes() {
        System.out.println("=== QUESTÃO 7 – Cadastro de Alunos (testes automáticos) ===");
        Cadastro cadastro = new Cadastro();
        cadastro.cadastrar("João", "20", "8.5");
        cadastro.cadastrar("Ana", "vinte", "7");
        cadastro.cadastrar("Pedro", "-1", "6");
        cadastro.cadastrar("Lucas", "19", "11");
        cadastro.cadastrar("Bia", "22", "abc");
        cadastro.cadastrar("", "18", "9");
        cadastro.cadastrar("Carla", "18", "10");
        cadastro.exibirResumo();
    }

    static String lerLinha(String mensagem) {
        System.out.print(mensagem);
        return scanner.hasNextLine() ? scanner.nextLine() : "";
    }

    static void interativo() {
        System.out.println();
        System.out.println("--- Agora cadastre seus alunos ---");
        Cadastro cadastro = new Cadastro();
        while (true) {
            String resposta = lerLinha("Deseja cadastrar um aluno? (s/n): ").trim();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
            String nome = lerLinha("Nome: ");
            String idade = lerLinha("Idade: ");
            String nota = lerLinha("Nota (0 a 10): ");
            cadastro.cadastrar(nome, idade, nota);
        }
        cadastro.exibirResumo();
    }

    public static void main(String[] args) {
        testes();
        interativo();
    }
}

class Aluno {
    private final String nome;
    private final int idade;
    private final double nota;

    Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return String.format("%s (%d anos) – nota %.1f", nome, idade, nota);
    }
}

class DadoInvalidoException extends Exception {
    public DadoInvalidoException(String mensagem) {
        super(mensagem);
    }

    public DadoInvalidoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
