public class DVD extends Produto {

    private int duracao;

    public DVD(String nome, double preco, String codigoBarras, int duracao) {
        super(nome, preco, codigoBarras);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return super.toString() + " | Duração: " + this.duracao + " min";
    }
}
