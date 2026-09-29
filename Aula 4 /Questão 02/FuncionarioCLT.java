package questao2;

public class FuncionarioCLT extends Funcionario {

    private static final double ADICIONAL = 0.10;

    public FuncionarioCLT(String nome, int matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + salarioBase * ADICIONAL;
    }
}
