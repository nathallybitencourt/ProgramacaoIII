package exercicio7.modelo;

import exercicio7.interfaces.Ciclista;
import exercicio7.interfaces.Corredor;
import exercicio7.interfaces.Nadador;

public class Triatleta extends Atleta implements Corredor, Nadador, Ciclista {

    public Triatleta(String nome, int idade, NivelAtleta nivel) {
        super(nome, idade, nivel);
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " esta correndo");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " esta nadando");
    }

    @Override
    public void pedalar() {
        System.out.println(this.getNome() + " esta pedalando");
    }

    @Override
    public void exibirModalidades() {
        System.out.println("Modalidades de " + this.getNome() + ": natacao, ciclismo e corrida");
    }
}
