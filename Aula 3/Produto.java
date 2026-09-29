public abstract class Produto implements Comparable<Produto> {

    protected String nome;
    protected double preco;
    private String codigoBarras;

    public Produto(String nome, double preco, String codigoBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoBarras = codigoBarras;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " | Preço: R$ " + this.preco
                + " | Cód. Barras: " + this.codigoBarras;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (!(o instanceof Produto)) {
            return false;
        } else {
            Produto outro = (Produto) o;
            return this.codigoBarras.equals(outro.getCodigoBarras());
        }
    }

    @Override
    public int compareTo(Produto outro) {
        return this.nome.compareTo(outro.getNome());
    }

}
