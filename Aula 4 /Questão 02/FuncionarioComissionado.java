package questao2;

public class FuncionarioComissionado extends Funcionario {

    private double comissao;

    public FuncionarioComissionado(String nome, int matricula, double salarioBase, double comissao) {
        super(nome, matricula, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comissao;
    }
}
