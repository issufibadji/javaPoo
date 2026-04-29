public class Carro {
    String modelo;
    int ano;

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibir() {
        System.out.println(modelo + " - " + ano);
    }
}