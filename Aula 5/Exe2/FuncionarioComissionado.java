package exercicio2;

public class FuncionarioComissionado extends Funcionario {
    private double comissao;

    public FuncionarioComissionado(String nome, int matricula, double salarioBase, double comissao) {
        super(nome, matricula, salarioBase);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase + this.comissao;
    }
}
