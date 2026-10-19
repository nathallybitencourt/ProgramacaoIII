package exercicio3;

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
        System.out.println(this.nome + " esta correndo");
    }

    @Override
    public void nadar() {
        System.out.println(this.nome + " esta nadando");
    }

    @Override
    public void pedalar() {
        System.out.println(this.nome + " esta pedalando");
    }

    public void mostrarModalidades() {
        System.out.println("Modalidades de " + this.nome + ": corrida, natacao e ciclismo");
    }
}
