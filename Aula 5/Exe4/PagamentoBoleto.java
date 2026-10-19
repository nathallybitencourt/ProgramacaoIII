package exercicio4;

public class PagamentoBoleto implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Boleto de R$ " + valor + " gerado. Aguardando compensacao em ate 3 dias uteis.");
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Boleto cancelado. O codigo de barras nao pode mais ser pago.");
    }
}
