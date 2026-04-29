public class ArrayIndexExample {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Tentando acessar índice inválido
        } catch (ArrayIndexOutOfBoundsException e) {
           throw new ArrayIndexOutOfBoundsException();
        }
    }
}