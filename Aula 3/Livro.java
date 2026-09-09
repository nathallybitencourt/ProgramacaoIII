public class Livro {
    private String titulo;
    private String autor;

    public Livro() {
        this.titulo = "Titulo desconhecido";
        this.autor = "Autor desconhecido";
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void exibirDados() {
        System.out.println("Titulo: " + this.titulo + " | Autor: " + this.autor);
    }

    public static void main(String[] args) {
        Livro l1 = new Livro(); 
        Livro l2 = new Livro("Por Alfie: Ate o Ultimo Acorde", "Jonnie Dantas"); 

        l1.exibirDados();
        l2.exibirDados();
    }
}