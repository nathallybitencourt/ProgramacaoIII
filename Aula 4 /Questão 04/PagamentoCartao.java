package questao4;

public class PagamentoCartao implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Cartao: pagamento de R$ %.2f aprovado na maquininha.%n", valor);
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Cartao: compra estornada na fatura.");
    }
}
