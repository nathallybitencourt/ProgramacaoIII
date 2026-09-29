package questao1;

public class Main {

    public static void main(String[] args) {
        ContaBancaria cc = new ContaCorrente("Ana", 100.00);
        ContaBancaria cp = new ContaPoupanca("Bruno", 200.00);

        System.out.println("=== Saldos iniciais ===");
        cc.exibirSaldo();
        cp.exibirSaldo();

        System.out.println();
        System.out.println("=== Depositos ===");
        cc.depositar(50.00);
        cp.depositar(100.00);
        cc.exibirSaldo();
        cp.exibirSaldo();

        System.out.println();
        System.out.println("=== Saques validos ===");
        System.out.println("Saque de 30 na corrente (taxa R$ 1,00): " + cc.sacar(30.00));
        System.out.println("Saque de 30 na poupanca (sem taxa): " + cp.sacar(30.00));
        cc.exibirSaldo();
        cp.exibirSaldo();

        System.out.println();
        System.out.println("=== Saques invalidos ===");
        System.out.println("Corrente sacar 119 (falta cobrir a taxa): " + cc.sacar(119.00));
        System.out.println("Poupanca sacar 500 (saldo insuficiente): " + cp.sacar(500.00));
        System.out.println("Corrente sacar -10 (valor negativo): " + cc.sacar(-10.00));

        System.out.println();
        System.out.println("=== Saldos finais ===");
        cc.exibirSaldo();
        cp.exibirSaldo();
    }
}
