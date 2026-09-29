package questao2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da comissao (R$): ");
        double comissao = sc.nextDouble();

        Funcionario f1 = new FuncionarioCLT("Carlos", 1001, 3000.00);
        Funcionario f2 = new FuncionarioComissionado("Daniela", 1002, 2500.00, comissao);

        Funcionario[] lista = { f1, f2 };

        System.out.println();
        System.out.println("=== Salarios calculados ===");
        for (Funcionario f : lista) {
            System.out.printf("%s (matricula %d) - %s%n", f.getNome(), f.getMatricula(), f.getClass().getSimpleName());
            System.out.printf("  Salario-base: R$ %.2f%n", f.getSalarioBase());
            System.out.printf("  Salario final: R$ %.2f%n", f.calcularSalario());
        }

        sc.close();
    }
}
