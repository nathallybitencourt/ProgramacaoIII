public class exe3 {
    public static void main(String[] args) {
        long a = 1;
        long b = 1;

        System.out.println("1: " + a);
        System.out.println("2: " + b);

        for (int i = 3; i <= 30; i++) {
            long proximo = a + b;
            System.out.println(i + ": " + proximo);
            a = b;
            b = proximo;
        }
    }
}
