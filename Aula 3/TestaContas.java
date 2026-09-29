public class TestaContas {

    public static void main(String[] args) {
        Conta c1 = new Conta(1, "Jao", 0);
        Conta c2 = new Conta(2, "Hozier");
        ContaEspecial ce = new ContaEspecial(3, "José", 100.00);
        ContaPoupanca cp = new ContaPoupanca(4, "Maria");

        System.out.println("=== Polimorfismo: imprimirTipoConta() ===");
        Conta[] contas = { c1, c2, ce, cp };
        for (Conta c : contas) {
            c.imprimirTipoConta();
        }

        System.out.println("\n=== Depositar e sacar ===");
        ce.depositar(50);
        System.out.println("ContaEspecial saldo após depósito: " + ce.getSaldo());
        boolean sacouAlemDoSaldo = ce.sacar(120);
        System.out.println("Conseguiu sacar 120 usando o limite? " + sacouAlemDoSaldo);
        System.out.println("Saldo final da ContaEspecial: " + ce.getSaldo());

        System.out.println("\n=== Reajuste da poupança ===");
        cp.depositar(1000);
        cp.reajustar(0.01);
        System.out.println("Saldo da ContaPoupanca após reajuste de 1%: " + cp.getSaldo());

        System.out.println("\n=== toString() e equals() ===");
        Conta c3 = new Conta(1, "Outro nome", 500);
        System.out.println("c1: " + c1);
        System.out.println("c1 equals c3 (mesmo número)? " + c1.equals(c3));
        System.out.println("c1 equals c2 (números diferentes)? " + c1.equals(c2));
    }
}
