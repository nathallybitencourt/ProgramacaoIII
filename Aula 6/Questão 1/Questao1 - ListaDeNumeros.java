import java.util.ArrayList;
import java.util.Scanner;

public class Questao1ListaDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            numeros.add(scanner.nextInt());
        }

        System.out.println("Números cadastrados:");
        int soma = 0;
        for (int numero : numeros) {
            System.out.println(numero);
            soma += numero;
        }

        double media = (double) soma / numeros.size();
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        numeros.removeIf(numero -> numero % 2 == 0);
        System.out.println("Lista sem os números pares: " + numeros);

        scanner.close();
    }
}
