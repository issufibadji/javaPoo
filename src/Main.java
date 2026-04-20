import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Pessoa p1 = new Pessoa("Issufi Badji", 20);

        p1.adicionarCarro(new Carro("Ford", 2000));
        p1.adicionarCarro(new Carro("Fiat", 2010));
        p1.adicionarCarro(new Carro("Nissan", 2015));
        p1.adicionarCarro(new Carro("Gol", 2018));
        p1.adicionarCarro(new Carro("Range Rover", 2022));
        p1.adicionarCarro(new Carro("Sandero", 2024));

        p1.listarCarros();
        p1.carroMaisRecente();

        Aluno a1 = new Aluno("nome", 24);
        a1.adicionarCurso(new Curso("Informatica", 60));
        a1.adicionarCurso(new Curso("Língua Portuguesa", 60));
        a1.adicionarCurso(new Curso("Lingua Francesa", 80));
        a1.adicionarCurso(new Curso("Enfermagem", 130));
        a1.adicionarCurso(new Curso("Bioquimica", 280));
        a1.adicionarCurso(new Curso("Eletricidade", 90));
        a1.adicionarCurso(new Curso("Língua Inglesa", 60));


        a1.listarCursos();
        a1.cursoMaisLongo();
        a1.cursoMaisCurto();
        a1.mediaDeHoras();
        */


        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno("Issufi Badji", 20);

        int opcao;

        do {
            System.out.println("\n=== MENU DE CURSOS ===");
            System.out.println("1 - Adicionar curso");
            System.out.println("2 - Listar cursos");
            System.out.println("3 - Curso mais longo");
            System.out.println("4 - Média de horas");
            System.out.println("5 - Remover curso");
            System.out.println("6 - Editar curso");
            System.out.println("7 - Curso mais curto");
            System.out.println("8 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do curso: ");
                    String nomeCurso = sc.nextLine();

                    System.out.print("Digite a carga horária: ");
                    int horas = sc.nextInt();
                    sc.nextLine();

                    if (horas <= 0) {
                        System.out.println("A carga horária deve ser maior que zero.");
                        break;
                    }

                    aluno.adicionarCurso(new Curso(nomeCurso, horas));
                    System.out.println("Curso adicionado com sucesso.");
                    break;

                case 2:
                    aluno.listarCursos();
                    break;

                case 3:
                    aluno.cursoMaisLongo();
                    break;

                case 4:
                    aluno.mediaDeHoras();
                    break;

                case 5:
                    System.out.print("Digite o nome do curso que deseja remover: ");
                    String nomeRemover = sc.nextLine();
                    aluno.removerCurso(nomeRemover);
                    break;

                case 6:
                    System.out.print("Digite o nome do curso que deseja editar: ");
                    String nomeEditar = sc.nextLine();

                    System.out.print("Novo nome do curso: ");
                    String novoNome = sc.nextLine();

                    System.out.print("Nova carga horária: ");
                    int novaHoras = sc.nextInt();
                    sc.nextLine();

                    if (novaHoras <= 0) {
                        System.out.println("A carga horária deve ser maior que zero.");
                        break;
                    }

                    aluno.editarCurso(nomeEditar, novoNome, novaHoras);
                    break;

                case 7:
                    aluno.cursoMaisCurto();
                    break;

                case 8:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 8);

        sc.close();
    }



}