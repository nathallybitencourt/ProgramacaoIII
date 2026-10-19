package exercicio7.modelo;

public abstract class Atleta {
    private String nome;
    private int idade;
    private NivelAtleta nivel;

    public Atleta(String nome, int idade, NivelAtleta nivel) {
        this.setNome(nome);
        this.setIdade(idade);
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.trim().equals("")) {
            throw new IllegalArgumentException("O nome do atleta nao pode ser vazio.");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws IllegalArgumentException {
        if (idade < 0) {
            throw new IllegalArgumentException("A idade do atleta nao pode ser negativa.");
        }
        this.idade = idade;
    }

    public NivelAtleta getNivel() {
        return nivel;
    }

    public void setNivel(NivelAtleta nivel) {
        this.nivel = nivel;
    }

    public abstract void exibirModalidades();

    @Override
    public String toString() {
        return "Nome: " + this.nome + " | Idade: " + this.idade + " | Nivel: " + this.nivel;
    }
}
