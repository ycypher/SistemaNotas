import java.util.Scanner;

public class TesteNotas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GerenciadorTurma turma = new GerenciadorTurma("3º Ano A");

        Aluno a1 = new Aluno("Lucas ", "2026001");
        Aluno a2 = new Aluno("Victor", "2026002");
        Aluno a3 = new Aluno();

        a1.lancarNotas(0.0, 0.0, 0.0);
        a2.lancarNotas(5.5, 7.0, 8.5);
        a3.lancarNotas(0.0, 0.0, 0.0);

        turma.cadastrarAluno(a1);
        turma.cadastrarAluno(a2);
        turma.cadastrarAluno(a3);

        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE NOTAS - 3o Ano A =====");
            System.out.println("1 - Emitir boletins de todos os alunos");
            System.out.println("2 - Exibir quantidade de alunos aprovados");
            System.out.println("3 - Exibir aluno com maior media");
            System.out.println("4 - Lancar notas para um aluno pelo indice");
            System.out.println("0 - Sair do sistema");
            System.out.print("Escolha uma opcao: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    turma.emitirBoletins();
                    break;

                case 2:
                    int aprovados = turma.contarAprovados();
                    System.out.println("\nQuantidade de alunos aprovados: " + aprovados);
                    break;

                case 3:
                    turma.exibirMaiorMedia();
                    break;

                case 4:
                    System.out.print("Informe o indice do aluno (0, 1 ou 2): ");
                    int indice = sc.nextInt();
                    Aluno aluno = turma.getAluno(indice);
                    if (aluno == null) {
                        System.out.println("Indice invalido.");
                    } else {
                        System.out.print("Nota 1: ");
                        double n1 = sc.nextDouble();
                        System.out.print("Nota 2: ");
                        double n2 = sc.nextDouble();
                        System.out.print("Nota 3: ");
                        double n3 = sc.nextDouble();
                        aluno.lancarNotas(n1, n2, n3);
                        System.out.println("\nBoletim atualizado:");
                        aluno.exibirBoletim();
                    }
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opcao invalida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
        sc.close();
    }
}