package questao7.modelo;

import questao7.interfaces.Nadador;

public class NadadorProfissional extends Atleta implements Nadador {

    public NadadorProfissional(String nome, int idade, NivelAtleta nivel) {
        super(nome, idade, nivel);
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " esta nadando.");
    }

    @Override
    public void exibirModalidades() {
        System.out.println("natacao");
    }
}
