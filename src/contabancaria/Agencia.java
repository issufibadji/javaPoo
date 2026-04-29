package contabancaria;

public class Agencia {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Angelica", 500);
        System.out.println("O titular da conta é : " + minhaConta.getTitular() +
                " e o saldo Final é " + minhaConta.getSaldo());

        minhaConta.setTitular("Angelica Weiler");
        minhaConta.setSaldo(minhaConta.getSaldo() + 500);

        String titularConta = minhaConta.getTitular();
        double saldoFinal = minhaConta.getSaldo();

        System.out.println("O titular da conta é : " + titularConta + " e o saldo Final é " + saldoFinal);

        ContaBancaria contaMinhaMae = new ContaBancaria("Maria");
        System.out.println("O titular da conta é : " + contaMinhaMae.getTitular() +
                " e o saldo Final é " + contaMinhaMae.getSaldo());

    }
}
