package questao3;

public class Main {

    public static void main(String[] args) {
        Triatleta t1 = new Triatleta("Marina");
        Triatleta t2 = new Triatleta("Rafael");

        Triatleta[] triatletas = { t1, t2 };

        for (Triatleta t : triatletas) {
            System.out.println("=== " + t.getNome() + " ===");
            t.mostrarModalidades();
            t.nadar();
            t.pedalar();
            t.correr();
            System.out.println();
        }

        Corredor c = t1;
        Nadador n = t1;
        Ciclista ci = t1;
        System.out.println("=== Usando o mesmo objeto por interfaces ===");
        c.correr();
        n.nadar();
        ci.pedalar();
    }
}
