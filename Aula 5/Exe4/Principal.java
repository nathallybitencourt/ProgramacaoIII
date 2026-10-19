package exercicio4;

public class Principal {
    public static void main(String[] args) {
        Pagamento[] pagamentos = new Pagamento[3];
        pagamentos[0] = new PagamentoCartao();
        pagamentos[1] = new PagamentoPix();
        pagamentos[2] = new PagamentoBoleto();

        double[] valores = {150.0, 89.9, 320.5};

        for (int i = 0; i < pagamentos.length; i++) {
            pagamentos[i].processarPagamento(valores[i]);
            pagamentos[i].cancelarPagamento();
            System.out.println();
        }
    }
}
