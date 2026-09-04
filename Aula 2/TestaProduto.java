public class TestaProduto {
  public static void main(String[] args) {
    Produto p1 = new Produto();
    p1.id = 1;
    p1.nome = "Notebook";
    p1.preco = 2000.00;

    Produto p2 = new Produto();
    p2.id = 2;
    p2.nome = "Celular";
    p2.preco = 1500.00;

    p1.aplicarDesconto(10);   
    p2.aplicarDesconto(15);  

    p1.exibirDetalhes();
    p2.exibirDetalhes();
  }
}