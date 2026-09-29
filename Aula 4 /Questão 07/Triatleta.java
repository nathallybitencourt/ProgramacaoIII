package questao7.modelo;

import questao7.interfaces.Ciclista;
import questao7.interfaces.Corredor;
import questao7.interfaces.Nadador;

public class Triatleta extends Atleta implements Corredor, Nadador, Ciclista {

    public Triatleta(String nome, int idade, NivelAtleta nivel) {
        super(nome, idade, nivel);
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " esta correndo.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " esta nadando.");
    }

    @Override
    public void pedalar() {
        System.out.println(getNome() + " esta pedalando.");
    }

    @Override
    public void exibirModalidades() {
        System.out.println("natacao, ciclismo e corrida");
    }
}
