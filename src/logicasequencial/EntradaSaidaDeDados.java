package logicasequencial;

import java.util.Scanner;

public class EntradaSaidaDeDados {
    public static void main(String[] args) {

//        System.out.println("Olá eu faço impressão e pulo a linha");
//        System.out.print("Olá eu faço a impressão na mesma linha");
//        System.out.printf("Olá eu faço a impressão formatada"); CTRL + /


        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, digite o seu nome: " );
        String nome = scanner.nextLine();
        System.out.println("Nome: " + nome);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Idade: " + idade);

        System.out.println("Digite se você está empregado sim(true) ou não(false)");
        boolean empregado = scanner.nextBoolean();
        System.out.println("Olá, sou " + nome + " tenho " + idade + " estou empregado " + empregado);
    }
}
