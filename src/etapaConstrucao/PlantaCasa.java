package etapaConstrucao;

public class PlantaCasa implements Construcao {
    //Atributos
   public int metragem;
   public int numeroQuartos;
   public int numeroBanheiros;
   public String cor;
   public String material;

   @Override
    public void construir(){
        System.out.println("A casa foi construída, as características são: ");
        System.out.println("Metragem " + metragem);
        System.out.println("Numero de quartos " + numeroQuartos);
        System.out.println("Numero de banheiros " + numeroBanheiros);
        System.out.println("Material " + material);
    }


    //Anotação
    @Override
    public void pintar(String cor) {
       System.out.println("Pintando a casa com a cor " + cor);

    }

    @Override
    public int calcularCustoConstrucao(int custoPorMetro) {
        return metragem + custoPorMetro;
    }

    public void pintar(){
        System.out.println("A casa foi pintada de " + cor);
    }

    public void mudarCorParede(String novaCor){
        cor=novaCor;
        pintar();
    }

    public int somarMetragem(){
        return metragem * numeroBanheiros + numeroQuartos;
    }

    public void alterarCaracteristicas(int metros, int quartos, int banheiro, String mat){
        metragem = metros;
        numeroQuartos = quartos;
        numeroBanheiros = banheiro;
        material = mat;
        construir();
    }

    public static void main(String[] args) {
        //Criando o objeto casa
        PlantaCasa casa = new PlantaCasa();

        //Inicializando os atributos (variáveis) (características) casa
        casa.numeroBanheiros = 2;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "Cinza";

        //Chamada da função (método) da ordem;
        casa.construir();

        casa.pintar();

        casa.mudarCorParede("Branco");

        casa.alterarCaracteristicas(100, 2, 2, "Madeira");

        int resultado = casa.somarMetragem();
        System.out.println(resultado);

        PlantaCasa casaVizinho = new PlantaCasa();
        casaVizinho.metragem = 200;
        casaVizinho.material = "Alvenaria";
        casaVizinho.numeroBanheiros = 1;
        casaVizinho.numeroQuartos = 1;
        casaVizinho.cor = "Amarela";

        casaVizinho.construir();
        casaVizinho.pintar();


    }
}
