package excecao.verificada;

import estruturarepeticao.While;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDocumentos {
    public static void main(String[] args) {

        //Identação CTRL + ALT + L

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(
                    new FileReader("C:\\Users\\angel\\Desktop\\Javanauta\\Docs\\Texto.txt"));

            //Ler linha por linha
            //null == inexistente
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo " + e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
