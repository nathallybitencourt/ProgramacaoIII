package questao3;

public class Triatleta implements Corredor, Nadador, Ciclista {

    private String nome;

    public Triatleta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void correr() {
        System.out.println(nome + " esta correndo.");
    }

    @Override
    public void nadar() {
        System.out.println(nome + " esta nadando.");
    }

    @Override
    public void pedalar() {
        System.out.println(nome + " esta pedalando.");
    }

    public void mostrarModalidades() {
        System.out.println(nome + " pratica: natacao, corrida e ciclismo.");
    }
}
