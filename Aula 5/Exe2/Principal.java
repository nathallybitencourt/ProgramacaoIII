package exercicio2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor da comissao do funcionario comissionado: ");
        double comissao = scan.nextDouble();

        Funcionario f1 = new FuncionarioCLT("Carlos", 101, 2000);
        Funcionario f2 = new FuncionarioComissionado("Juliana", 102, 1800, comissao);

        Funcionario[] funcionarios = {f1, f2};

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println();
            System.out.println("Nome: " + funcionarios[i].getNome());
            System.out.println("Matricula: " + funcionarios[i].getMatricula());
            System.out.println("Salario base: R$ " + funcionarios[i].getSalarioBase());
            System.out.println("Salario calculado: R$ " + funcionarios[i].calcularSalario());
        }

        scan.close();
    }
}
