package questao5;

public class Pedido {

    private int numero;
    private double valor;
    private StatusPedido status;

    public Pedido(int numero, double valor) {
        this.numero = numero;
        this.valor = valor;
        this.status = StatusPedido.AGUARDANDO_PAGAMENTO;
    }

    public int getNumero() {
        return numero;
    }

    public double getValor() {
        return valor;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void alterarStatus(StatusPedido novoStatus) {
        this.status = novoStatus;
    }

    public void exibirMensagem() {
        System.out.printf("Pedido #%d (R$ %.2f) - ", numero, valor);
        switch (status) {
            case AGUARDANDO_PAGAMENTO:
                System.out.println("Aguardando pagamento. Finalize a compra para continuar.");
                break;
            case PAGO:
                System.out.println("Pagamento confirmado! Estamos preparando o envio.");
                break;
            case ENVIADO:
                System.out.println("Seu pedido saiu para entrega.");
                break;
            case ENTREGUE:
                System.out.println("Pedido entregue. Obrigado pela compra!");
                break;
            case CANCELADO:
                System.out.println("Pedido cancelado.");
                break;
        }
    }
}
