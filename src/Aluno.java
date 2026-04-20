import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int idade;
    private ArrayList<Curso> cursos;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        setIdade(idade);
        this.cursos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade inválida. Definindo 0 por padrão.");
            this.idade = 0;
            return;
        }
        this.idade = idade;
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println(nome + " não possui cursos cadastrados.");
            return;
        }

        System.out.println("Cursos de " + nome + ":");
        for (Curso curso : cursos) {
            curso.exibir();
        }
    }

    public void cursoMaisLongo() {
        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso cadastrado.");
            return;
        }

        Curso maior = cursos.get(0);

        for (Curso curso : cursos) {
            if (curso.getHoras() > maior.getHoras()) {
                maior = curso;
            }
        }

        System.out.println("Curso mais longo: " + maior.getNome() + " - " + maior.getHoras() + "h");
    }

    public void cursoMaisCurto() {
        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso cadastrado.");
            return;
        }

        Curso menor = cursos.get(0);

        for (Curso curso : cursos) {
            if (curso.getHoras() < menor.getHoras()) {
                menor = curso;
            }
        }

        System.out.println("Curso mais curto: " + menor.getNome() + " - " + menor.getHoras() + "h");
    }

    public void mediaDeHoras() {
        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso cadastrado.");
            return;
        }

        int soma = 0;

        for (Curso curso : cursos) {
            soma += curso.getHoras();
        }

        double media = (double) soma / cursos.size();

        System.out.println("Média de horas: " + media + "h");
    }

    public void removerCurso(String nomeCurso) {
        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso cadastrado.");
            return;
        }

        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getNome().equalsIgnoreCase(nomeCurso)) {
                cursos.remove(i);
                System.out.println("Curso removido com sucesso.");
                return;
            }
        }

        System.out.println("Curso não encontrado.");
    }

    public void editarCurso(String nomeCurso, String novoNome, int novaHoras) {
        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso cadastrado.");
            return;
        }

        for (Curso curso : cursos) {
            if (curso.getNome().equalsIgnoreCase(nomeCurso)) {
                curso.setNome(novoNome);
                curso.setHoras(novaHoras);
                System.out.println("Curso editado com sucesso.");
                return;
            }
        }

        System.out.println("Curso não encontrado.");
    }
}