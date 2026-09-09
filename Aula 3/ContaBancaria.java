public class ContaBancaria {
    private int numero;

    public ContaBancaria(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Conta: " + this.numero;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (o.getClass() != this.getClass()) {
            return false;
        } else if (((ContaBancaria) o).getNumero() != this.getNumero()) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(150);
        ContaBancaria c2 = new ContaBancaria(131);

        System.out.println("c1 equals c2? " + c1.equals(c2));

        System.out.println(c1);
    }
}
