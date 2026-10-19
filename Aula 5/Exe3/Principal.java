package exercicio3;

public class Principal {
    public static void main(String[] args) {
        Triatleta t1 = new Triatleta("Marcos");
        Triatleta t2 = new Triatleta("Fernanda");

        t1.mostrarModalidades();
        t1.nadar();
        t1.pedalar();
        t1.correr();

        System.out.println();

        t2.mostrarModalidades();
        t2.nadar();
        t2.pedalar();
        t2.correr();
    }
}
