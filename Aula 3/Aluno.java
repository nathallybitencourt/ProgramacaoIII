public class Aluno extends Pessoa {

    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade); 
        this.matricula = matricula;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Matricula: " + this.matricula);
    }

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Nathally", 21, "202411722021");
        a1.exibirInformacoes();
    }
}
