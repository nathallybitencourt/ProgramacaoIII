package exercicio1;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria cc = new ContaCorrente("Ana", 100);
        ContaBancaria cp = new ContaPoupanca("Bruno", 200);

        cc.depositar(50);
        cp.depositar(100);
        System.out.println("Deposito de R$ 50,00 na conta corrente de " + cc.getTitular());
        System.out.println("Deposito de R$ 100,00 na conta poupanca de " + cp.getTitular());

        if (cc.sacar(30)) {
            System.out.println("Saque de R$ 30,00 na conta corrente efetuado com sucesso!");
        } else {
            System.out.println("Saque de R$ 30,00 na conta corrente nao efetuado! Saldo insuficiente!");
        }

        if (cp.sacar(80)) {
            System.out.println("Saque de R$ 80,00 na conta poupanca efetuado com sucesso!");
        } else {
            System.out.println("Saque de R$ 80,00 na conta poupanca nao efetuado! Saldo insuficiente!");
        }

        if (cc.sacar(119)) {
            System.out.println("Saque de R$ 119,00 na conta corrente efetuado com sucesso!");
        } else {
            System.out.println("Saque de R$ 119,00 na conta corrente nao efetuado! Saldo insuficiente!");
        }

        if (cp.sacar(500)) {
            System.out.println("Saque de R$ 500,00 na conta poupanca efetuado com sucesso!");
        } else {
            System.out.println("Saque de R$ 500,00 na conta poupanca nao efetuado! Saldo insuficiente!");
        }

        System.out.println();
        System.out.println("Saldo final de " + cc.getTitular() + " (Conta Corrente): R$ " + cc.getSaldo());
        System.out.println("Saldo final de " + cp.getTitular() + " (Conta Poupanca): R$ " + cp.getSaldo());
    }
}
