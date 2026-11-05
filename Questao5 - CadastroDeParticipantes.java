import java.util.HashSet;
import java.util.Scanner;

public class Questao5CadastroDeParticipantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> participantes = new HashSet<>();

        System.out.println("Digite os nomes dos participantes (digite \"fim\" para encerrar):");
        String nome = scanner.nextLine();
        while (!nome.equals("fim")) {
            if (!participantes.add(nome)) {
                System.out.println("Participante já registrado; o nome não foi adicionado novamente.");
            }
            nome = scanner.nextLine();
        }

        System.out.println("Participantes únicos:");
        for (String participante : participantes) {
            System.out.println(participante);
        }

        System.out.println("Participantes distintos: " + participantes.size());

        System.out.print("Digite o nome de um participante para verificar: ");
        String nomeConsulta = scanner.nextLine();
        if (participantes.contains(nomeConsulta)) {
            System.out.println("O participante está inscrito.");
        } else {
            System.out.println("O participante não está inscrito.");
        }

        scanner.close();
    }
}
