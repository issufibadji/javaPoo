package estruturarepeticao;

import java.util.HashMap;
import java.util.Map;

public class EstudoHashMap {
    public static void main(String[] args) {
        HashMap<String, Double> notasAlunos = new HashMap<>();
        notasAlunos.put("Alice", 10.5);
        notasAlunos.put("Mateus", 8.0);
        notasAlunos.put("Maria", 9.9);

        for(String nome : notasAlunos.keySet()){
            double nota = notasAlunos.get(nome);
            System.out.println(nome + " : " + nota);
        }

        for(Map.Entry<String, Double> nota : notasAlunos.entrySet()){
            String nome = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nome + " : " + valorNota);
        }

        double nota = notasAlunos.get("Alice");
        System.out.println("A nota da Alice é " + nota);

        int tamanhoHash = notasAlunos.size();

        notasAlunos.remove("Maria");







    }
}
