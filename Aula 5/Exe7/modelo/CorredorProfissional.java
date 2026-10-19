package exercicio7.modelo;

import exercicio7.interfaces.Corredor;

public class CorredorProfissional extends Atleta implements Corredor {

    public CorredorProfissional(String nome, int idade, NivelAtleta nivel) {
        super(nome, idade, nivel);
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " esta correndo");
    }

    @Override
    public void exibirModalidades() {
        System.out.println("Modalidades de " + this.getNome() + ": corrida");
    }
}
