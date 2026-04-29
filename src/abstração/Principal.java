package abstração;

public class Principal {
    public static void main(String[] args) {
        Funcionario joao = new Funcionario("Rua da Flores", "Sao Paulo", "1542", "SP",
                "9854596-000", "João Paulo da Silva", "00025487565", "Vendedor");
        Cliente joana = new Cliente("Rua das Rosas", "Rio de Janeiro", "RJ", "55487560-000",
                "Joana Almeida", "00054856520");

        System.out.println(joao);
        joao.mostrarEndereco();
        System.out.println(joana);
        joana.mostrarEndereco();
    }
}
