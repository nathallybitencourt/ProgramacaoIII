package questao4;

public class Main {

    public static void main(String[] args) {
        Pagamento[] formas = {
            new PagamentoCartao(),
            new PagamentoPix(),
            new PagamentoBoleto()
        };

        System.out.println("=== Processando pagamentos ===");
        for (Pagamento p : formas) {
            p.processarPagamento(150.00);
        }

        System.out.println();
        System.out.println("=== Cancelando pagamentos ===");
        for (Pagamento p : formas) {
            p.cancelarPagamento();
        }
    }
}
