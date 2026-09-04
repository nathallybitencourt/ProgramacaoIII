import java.util.ArrayList;
import java.util.Iterator;

public class TestaContas {
  public static void main(String[] args) {
    ArrayList<ContaBancaria> contas = new ArrayList<>();

    ContaBancaria c1 = new ContaBancaria();
    c1.numero = 101;
    c1.titular = "Nathally";
    c1.saldo = 2000.00;

    ContaBancaria c2 = new ContaBancaria();
    c2.numero = 102;
    c2.titular = "Jongho";
    c2.saldo = 3000.50;

    ContaBancaria c3 = new ContaBancaria();
    c3.numero = 103;
    c3.titular = "Jihyo";
    c3.saldo = 5000.80;

    contas.add(c1);
    contas.add(c2);
    contas.add(c3);

    double saldoTotal = 0;

    Iterator<ContaBancaria> it = contas.iterator();
    while (it.hasNext()) {
      ContaBancaria conta = it.next();
      System.out.println("Numero: " + conta.numero + " | Titular: " + conta.titular);
      saldoTotal = saldoTotal + conta.saldo;
    }

    System.out.printf("Saldo total acumulado no banco: R$ %.2f%n", saldoTotal);
  }
}
