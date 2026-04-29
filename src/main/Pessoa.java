import java.util.ArrayList;

public class Pessoa {
    String nome;
    int idade;
    ArrayList<Carro> carros;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.carros = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public void carroMaisRecente() {
      if(carros.isEmpty()){
          System.out.println("Nenhum carro encontrado");
          return;
      }

      Carro maisRecente = carros.get(0);

        for (Carro carro : carros) {
            if (carro.ano> maisRecente.ano){
                maisRecente = carro;
            }
        }
        System.out.println("O Carro mais Fabricado Recentimente é: " + maisRecente.modelo + " - " + "Ano" + maisRecente.ano);
    }

    public void listarCarros() {
        if (carros.isEmpty()) {
            System.out.println(nome + " não possui carros cadastrados.");
            return;
        }

        System.out.println("Carros de " + nome + ":");
        for (Carro carro : carros) {
            carro.exibir();
        }
    }
}