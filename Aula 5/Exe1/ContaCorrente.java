package exercicio1;

public class ContaCorrente extends ContaBancaria {
    private final double TAXA = 1.0;

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor + TAXA <= this.saldo) {
            this.saldo -= valor + TAXA;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }
}
