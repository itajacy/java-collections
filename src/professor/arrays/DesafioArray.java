package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        IO.print("Quantos alunos na turma: ");
        int qtdeDeAlunos = teclado.nextInt();
        teclado.nextLine();

        double[] notas = new double[qtdeDeAlunos];

        for(int i = 0; i < notas.length; i++) {
            System.out.printf("Informe a nota do aluno %d: ", i + 1);
            notas[i] = teclado.nextDouble();
            teclado.nextLine();
        }

        double total = 0;

        for(double nota: notas) {
            total += nota;
        }

        double media = total / qtdeDeAlunos;

        System.out.printf("A média da turma é %.2f!\n", media);
        IO.println(Arrays.toString(notas));

        teclado.close();
    }
}
