package exercicio7.principal;

import exercicio7.interfaces.Ciclista;
import exercicio7.interfaces.Corredor;
import exercicio7.interfaces.Nadador;
import exercicio7.modelo.Atleta;
import exercicio7.modelo.CorredorProfissional;
import exercicio7.modelo.NadadorProfissional;
import exercicio7.modelo.NivelAtleta;
import exercicio7.modelo.Triatleta;

public class Principal {
    public static void main(String[] args) {
        Atleta[] atletas = new Atleta[4];
        atletas[0] = new CorredorProfissional("Joao", 28, NivelAtleta.PROFISSIONAL);
        atletas[1] = new NadadorProfissional("Beatriz", 22, NivelAtleta.AMADOR);
        atletas[2] = new Triatleta("Lucas", 31, NivelAtleta.PROFISSIONAL);
        atletas[3] = new Triatleta("Camila", 19, NivelAtleta.NOVATO);

        System.out.println("===== INFORMACOES DOS ATLETAS =====");
        for (int i = 0; i < atletas.length; i++) {
            System.out.println(atletas[i]);
            atletas[i].exibirModalidades();
            System.out.println();
        }

        System.out.println("===== NIVEL DE CADA ATLETA =====");
        for (int i = 0; i < atletas.length; i++) {
            switch (atletas[i].getNivel()) {
                case NOVATO:
                    System.out.println(atletas[i].getNome() + " esta comecando no esporte.");
                    break;
                case AMADOR:
                    System.out.println(atletas[i].getNome() + " pratica o esporte como amador.");
                    break;
                case PROFISSIONAL:
                    System.out.println(atletas[i].getNome() + " e um atleta profissional.");
                    break;
            }
        }
        System.out.println();

        System.out.println("===== EXECUTANDO MODALIDADES PELAS INTERFACES =====");
        Corredor corredor = (Corredor) atletas[0];
        corredor.correr();

        Nadador nadador = (Nadador) atletas[1];
        nadador.nadar();
        System.out.println();

        System.out.println("===== UMA CLASSE COM MULTIPLAS INTERFACES =====");
        Triatleta triatleta = (Triatleta) atletas[2];
        Corredor c = triatleta;
        Nadador n = triatleta;
        Ciclista ci = triatleta;
        n.nadar();
        ci.pedalar();
        c.correr();
        System.out.println();

        Triatleta outro = (Triatleta) atletas[3];
        outro.nadar();
        outro.pedalar();
        outro.correr();
        System.out.println();

        System.out.println("===== TESTANDO VALIDACOES =====");
        try {
            Atleta invalido = new CorredorProfissional("Rodrigo", -5, NivelAtleta.AMADOR);
            System.out.println(invalido);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            Atleta invalido = new NadadorProfissional("   ", 25, NivelAtleta.NOVATO);
            System.out.println(invalido);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            atletas[0].setIdade(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Idade de " + atletas[0].getNome() + " continua: " + atletas[0].getIdade());
        }
    }
}
