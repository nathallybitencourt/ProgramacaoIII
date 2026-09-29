package questao2;

public abstract class Funcionario {

    private String nome;
    private int matricula;
    protected double salarioBase;

    public Funcionario(String nome, int matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public abstract double calcularSalario();
}
