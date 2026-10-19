package exercicio2;

public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome, int matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase + this.salarioBase * 0.10;
    }
}
