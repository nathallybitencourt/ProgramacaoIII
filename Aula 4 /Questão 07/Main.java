package questao7.app;

import questao7.interfaces.Ciclista;
import questao7.interfaces.Corredor;
import questao7.interfaces.Nadador;
import questao7.modelo.Atleta;
import questao7.modelo.CorredorProfissional;
import questao7.modelo.NadadorProfissional;
import questao7.modelo.NivelAtleta;
import questao7.modelo.Triatleta;

public class Main {

    public static void main(String[] args) {
        Atleta[] atletas = {
            new CorredorProfissional("Paulo", 28, NivelAtleta.PROFISSIONAL),
            new NadadorProfissional("Julia", 22, NivelAtleta.AMADOR),
            new Triatleta("Marina", 30, NivelAtleta.PROFISSIONAL),
            new Triatleta("Rafael", 19, NivelAtleta.NOVATO)
        };

        System.out.println("=== Informacoes dos atletas ===");
        for (Atleta a : atletas) {
            a.exibirInformacoes();
            System.out.println();
        }

        System.out.println("=== Executando modalidades pelas interfaces ===");
        for (Atleta a : atletas) {
            System.out.println("-- " + a.getNome() + " (" + a.getNivel() + ")");
            if (a instanceof Corredor) {
                Corredor c = (Corredor) a;
                c.correr();
            }
            if (a instanceof Nadador) {
                Nadador n = (Nadador) a;
                n.nadar();
            }
            if (a instanceof Ciclista) {
                Ciclista ci = (Ciclista) a;
                ci.pedalar();
            }
        }

        System.out.println();
        System.out.println("=== Testando validacoes ===");
        try {
            new Triatleta("Carlos", -5, NivelAtleta.NOVATO);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        try {
            new NadadorProfissional("   ", 20, NivelAtleta.AMADOR);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
