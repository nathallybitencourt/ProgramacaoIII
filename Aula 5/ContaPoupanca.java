package exercicio1;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
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
