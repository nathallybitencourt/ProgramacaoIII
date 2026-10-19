package exercicio4;

public class PagamentoPix implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pix de R$ " + valor + " recebido na hora.");
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Pix cancelado. O valor foi devolvido para a conta de origem.");
    }
}
