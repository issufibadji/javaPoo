package estruturarepeticao;

import java.util.ArrayList;
import java.util.List;

public class EstudoArrayList {
    public static void main(String[] args) {
        //Alt+Enter -> importa a classe
        List<String> listaDeCompras = new ArrayList<>();
        listaDeCompras.add("Mamão");
        listaDeCompras.add("Sabão em Pó");
        listaDeCompras.add("Macarrão");

        listaDeCompras.add(1, "Banana");

        for (String item : listaDeCompras){
            System.out.println(item);
        }

        String item = listaDeCompras.get(3);
        System.out.println("Na posição 3 eu tenho:" + item);

        listaDeCompras.remove("Sabão em Pó");

        for (String item2 : listaDeCompras){
            System.out.println(item2);
        }

        boolean eVazia = listaDeCompras.isEmpty();
        int tamanho = listaDeCompras.size();
        boolean contem = listaDeCompras.contains("Arroz");

        System.out.println("A lista esta vazia?: " + eVazia + ", qual o tamanho da lista? " +
                tamanho + ", a lista contem o item Arroz? " + contem);

//        listaDeCompras.clear();
//        System.out.println("A lista esta vazia?" + listaDeCompras.isEmpty());

        listaDeCompras.forEach(produto -> System.out.println(produto));


    }
}
