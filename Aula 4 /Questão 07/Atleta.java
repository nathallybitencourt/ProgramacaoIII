package questao7.modelo;

public abstract class Atleta {

    private String nome;
    private int idade;
    private NivelAtleta nivel;

    public Atleta(String nome, int idade, NivelAtleta nivel) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome nao pode ser vazio.");
        }
        if (idade < 0) {
            throw new IllegalArgumentException("A idade nao pode ser negativa.");
        }
        this.nome = nome;
        this.idade = idade;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public NivelAtleta getNivel() {
        return nivel;
    }

    public abstract void exibirModalidades();

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nivel: " + nivel);
        System.out.print("Modalidades: ");
        exibirModalidades();
    }
}
