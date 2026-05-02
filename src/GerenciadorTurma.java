public class GerenciadorTurma {
    
    private String nomeTurma;
    private Aluno[] alunos;
    private int contador;
    public GerenciadorTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
        this.alunos = new Aluno[4];
        this.contador = 0;
    }
    public void cadastrarAluno(Aluno a) {
        if (contador == alunos.length) {
            System.out.println("Turma com capacidade maxima atingida.");
            return;
        }
        alunos[contador] = a;
        contador++;
    }
    public void emitirBoletins() {
        System.out.println("\n=== Boletins da turma: " + nomeTurma + " ===");
        for (int i = 0; i < contador; i++) {
            alunos[i].exibirBoletim();
        }
    }
    public int contarAprovados() {
        int total = 0;
        for (int i = 0; i < contador; i++) {
            if (alunos[i].getSituacao().equals("APROVADO")) {
                total++;
            }
        }
        return total;
    }
    public void exibirMaiorMedia() {
        if (contador == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        int indiceMaior = 0;
        for (int i = 1; i < contador; i++) {
            if (alunos[i].getMedia() > alunos[indiceMaior].getMedia()) {
                indiceMaior = i;
            }
        }
        System.out.println("\nAluno com maior media:");
        System.out.println("Nome:  " + alunos[indiceMaior].getNome());
        System.out.printf("Media: %.2f%n", alunos[indiceMaior].getMedia());
    }
    public Aluno getAluno(int indice) {
        if (indice >= 0 && indice < contador) {
            return alunos[indice];
        }
        return null;
    }
}