package questao5;

public class Main {

    public static void main(String[] args) {
        Pedido p1 = new Pedido(1, 89.90);
        Pedido p2 = new Pedido(2, 250.00);
        Pedido p3 = new Pedido(3, 45.50);
        Pedido p4 = new Pedido(4, 300.00);

        p2.alterarStatus(StatusPedido.PAGO);
        p3.alterarStatus(StatusPedido.ENVIADO);
        p4.alterarStatus(StatusPedido.CANCELADO);

        Pedido[] pedidos = { p1, p2, p3, p4 };

        for (Pedido p : pedidos) {
            System.out.println("Status: " + p.getStatus());
            p.exibirMensagem();
            System.out.println();
        }

        System.out.println("=== Avancando o pedido 3 ===");
        p3.alterarStatus(StatusPedido.ENTREGUE);
        p3.exibirMensagem();
    }
}
