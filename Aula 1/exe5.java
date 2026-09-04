
import java.util.Scanner;

public class exe5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o inicio do intervalo: ");
        int inicio = entrada.nextInt();

        System.out.print("Digite o fim do intervalo: ");
        int fim = entrada.nextInt();

        System.out.println("Numeros primos entre " + inicio + " e " + fim + ":");

        for (int n = inicio; n <= fim; n++) {
            if (Primo(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
        entrada.close();

    }

    public static boolean Primo(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
