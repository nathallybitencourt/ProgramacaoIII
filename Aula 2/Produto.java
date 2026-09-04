public class Produto {
  int id;
  String nome;
  double preco;

  void aplicarDesconto(double porcentagem) {
    double desconto = preco * porcentagem / 100;
    preco = preco - desconto;
  }

  void exibirDetalhes() {
    System.out.println("ID: " + id);
    System.out.println("Nome: " + nome);
    System.out.printf("Preco: R$ %.2f%n", preco);
    System.out.println("------------------------");
  }
}
