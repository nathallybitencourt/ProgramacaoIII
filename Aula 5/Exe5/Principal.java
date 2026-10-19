package exercicio5;

public class Principal {
    public static void main(String[] args) {
        Pedido p1 = new Pedido(1, 250.0);
        Pedido p2 = new Pedido(2, 99.9);
        Pedido p3 = new Pedido(3, 480.0);
        Pedido p4 = new Pedido(4, 35.5);

        p2.setStatus(StatusPedido.PAGO);
        p3.setStatus(StatusPedido.PAGO);
        p3.setStatus(StatusPedido.ENVIADO);
        p4.setStatus(StatusPedido.CANCELADO);

        p1.exibirMensagem();
        p2.exibirMensagem();
        p3.exibirMensagem();
        p4.exibirMensagem();

        System.out.println();
        System.out.println("Atualizando o pedido 3...");
        p3.setStatus(StatusPedido.ENTREGUE);
        p3.exibirMensagem();
    }
}
