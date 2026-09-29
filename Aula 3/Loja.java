import java.util.Arrays;

public class Loja {

    public static int buscar(Produto produtoProcurado, Produto[] produtos) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].equals(produtoProcurado)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Produto[] produtos = new Produto[5];
        produtos[0] = new LivroProduto("Dom Casmurro", 39.90, "111", "Machado de Assis");
        produtos[1] = new LivroProduto("O Hobbit", 45.50, "222", "J.R.R. Tolkien");
        produtos[2] = new CD("Thriller", 29.90, "333", 9);
        produtos[3] = new CD("Abbey Road", 34.90, "444", 17);
        produtos[4] = new DVD("Interestelar", 24.90, "555", 169);

        System.out.println("=== Produtos da Loja (ordem original) ===");
        for (Produto p : produtos) {
            System.out.println(p);
        }

        Produto original = produtos[2];
        Produto mesmoCodigo = new CD("Thriller (relançamento)", 39.90, "333", 9);
        Produto codigoDiferente = new CD("Thriller (relançamento)", 39.90, "999", 9);

        System.out.println("\n=== Busca por código de barras ===");
        System.out.println("Mesmo código encontrado na posição: " + buscar(mesmoCodigo, produtos));
        System.out.println("Código diferente encontrado na posição: " + buscar(codigoDiferente, produtos));

        System.out.println("\n=== Ordenado (compareTo atual: por nome) ===");
        Arrays.sort(produtos);
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
