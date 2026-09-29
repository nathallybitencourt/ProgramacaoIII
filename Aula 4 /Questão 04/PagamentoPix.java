package questao4;

public class PagamentoPix implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pix: transferencia instantanea de R$ %.2f realizada.%n", valor);
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Pix: devolucao enviada para a conta do pagador.");
    }
}
