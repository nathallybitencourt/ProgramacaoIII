
import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double a = entrada.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double b = entrada.nextDouble();

        System.out.print("Digite a operacao (+, -, *, /): ");
        char operacao = entrada.next().charAt(0);

        double resultado;

        if (operacao == '+') {
            resultado = a + b;
        } else if (operacao == '-') {
            resultado = a - b;
        } else if (operacao == '*') {
            resultado = a * b;
        } else if (operacao == '/') {
            if (b == 0) {
                System.out.println("Erro: divisão por zero");
                entrada.close();
                return;
            }
            resultado = a / b;
        } else {
            System.out.println("Operação inválida");
            entrada.close();
            return;
        }

        System.out.println("Resultado: " + a + " " + operacao + " " + b + " = " + resultado);
        entrada.close();

    }
}
