public class AlunoEx3 extends PessoaEx3 {

    private String matricula;

    public AlunoEx3(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public static void main(String[] args) {
        AlunoEx3 a1 = new AlunoEx3("Nathally", 20, "202411722021");

        System.out.println("Nome: " + a1.getNome());
        System.out.println("Idade: " + a1.getIdade());
        System.out.println("Matrícula: " + a1.getMatricula());

        a1.setNome("Nathally Bitencourt");
        a1.setIdade(21);
        a1.setMatricula("2024002");

        System.out.println("Depois da mudanca");
        System.out.println("Nome: " + a1.getNome());
        System.out.println("Idade: " + a1.getIdade());
        System.out.println("Matricula: " + a1.getMatricula());
    }
}
