package arrays;

import java.util.Scanner;

public class Matriz {

    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de Alunos: ");
        int qtdeAlunos = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Informe a quantidade de Notas/Aluno: ");
        int qtdeNotas = teclado.nextInt();
        teclado.nextLine();

        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
        double[] medias = new double[qtdeAlunos];


        for (int a = 0; a < qtdeAlunos; a++) {
            double total = 0;
            for (int n = 0; n < qtdeNotas; n++) {
                System.out.printf("informe a nota  %d do aluno %d: ", n + 1, a + 1);
                notasDaTurma[a][n] = teclado.nextDouble();
                teclado.nextLine();
                total += notasDaTurma[a][n];
            }
            medias[a] = total / qtdeNotas;
        }

        for (int a = 0; a < qtdeAlunos; a++) {
            System.out.printf("A media do aluno %d é %.2f! %n", a + 1, medias[a]);
        }
        teclado.close();
    }
}
