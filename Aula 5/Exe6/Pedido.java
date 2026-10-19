package exercicio5;

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

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public void exibirMensagem() {
        System.out.print("Pedido " + this.numero + " (R$ " + this.valor + "): ");
        switch (this.status) {
            case AGUARDANDO_PAGAMENTO:
                System.out.println("aguardando a confirmacao do pagamento.");
                break;
            case PAGO:
                System.out.println("pagamento confirmado, preparando para envio.");
                break;
            case ENVIADO:
                System.out.println("pedido enviado, a caminho do endereco de entrega.");
                break;
            case ENTREGUE:
                System.out.println("pedido entregue ao cliente.");
                break;
            case CANCELADO:
                System.out.println("pedido cancelado.");
                break;
        }
    }
}
