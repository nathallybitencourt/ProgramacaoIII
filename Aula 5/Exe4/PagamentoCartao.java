package exercicio4;

public class PagamentoCartao implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " aprovado no cartao de credito.");
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Pagamento no cartao cancelado. O estorno sera feito na proxima fatura.");
    }
}
