package questao4;

public class PagamentoBoleto implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Boleto: boleto de R$ %.2f gerado, aguardando compensacao.%n", valor);
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Boleto: boleto cancelado, nao podera mais ser pago.");
    }
}
