package arrays;

import java.util.Scanner;

public class DesafioArray {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Numero de alunos tem na turma: ");
        int qtdAlunos = teclado.nextInt();

        double[] notaAlunos = new double[qtdAlunos];

        double mediaAluno;
        double total = 0;
        for (int aluno = 0; aluno < qtdAlunos; aluno++) {
            System.out.printf("Entre com a nota do aluno[%d]: ", aluno + 1);
            mediaAluno = teclado.nextDouble();
            notaAlunos[aluno] = mediaAluno;
            total += mediaAluno;
        }
        System.out.printf("Media da turma: %s ", total / qtdAlunos);
        teclado.close();
    }
}
