package exercicio7.modelo;

import exercicio7.interfaces.Nadador;

public class NadadorProfissional extends Atleta implements Nadador {

    public NadadorProfissional(String nome, int idade, NivelAtleta nivel) {
        super(nome, idade, nivel);
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " esta nadando");
    }

    @Override
    public void exibirModalidades() {
        System.out.println("Modalidades de " + this.getNome() + ": natacao");
    }
}
