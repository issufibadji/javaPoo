public class Curso {
    private String nome;
    private int horas;

    public Curso(String nome, int horas) {
        this.nome = nome;
        setHoras(horas);
    }

    public String getNome() {
        return nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHoras(int horas) {
        if (horas <= 0) {
            System.out.println("Carga horária inválida. Definindo 1h por padrão.");
            this.horas = 1;
            return;
        }
        this.horas = horas;
    }

    public void exibir() {
        System.out.println(nome + " - " + horas + "h");
    }
}