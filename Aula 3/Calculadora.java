public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Soma de 2 inteiros: " + calc.somar(2, 3));
        System.out.println("Soma de 2 doubles: " + calc.somar(2.5, 3.7));
        System.out.println("Soma de 3 inteiros: " + calc.somar(1, 2, 3));
    }
}