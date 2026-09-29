package questao1;

public class ContaCorrente extends ContaBancaria {

    private static final double TAXA_SAQUE = 1.00;

    public ContaCorrente(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        double total = valor + TAXA_SAQUE;
        if (valor > 0 && saldo >= total) {
            saldo -= total;
            return true;
        }
        return false;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
}
