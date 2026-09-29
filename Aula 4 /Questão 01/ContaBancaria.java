package questao1;

public abstract class ContaBancaria {

    private String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract boolean sacar(double valor);

    public abstract void depositar(double valor);

    public void exibirSaldo() {
        System.out.printf("%s (%s) - Saldo: R$ %.2f%n", titular, getClass().getSimpleName(), saldo);
    }
}
