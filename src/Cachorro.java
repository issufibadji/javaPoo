public class Cachorro {
    String nome;
    String raca;
    int idade;

    public void exibirDados() {
        System.out.println("--- Cachorro ---");
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade + " anos");
    }

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;

    }
}
