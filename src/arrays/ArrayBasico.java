package arrays;

import java.util.Arrays;

public class ArrayBasico {
    static void main() {
        // array é uma estrutura estatica
        double[] notas = new double[5];
        System.out.println(Arrays.toString(notas));
        notas[0] = 7.9;
        notas[1] = 8;
        notas[2] = 6.7;
        notas[3] = 9.7;
        notas[4] = 10;
//        notas[5] = 9.7;   // está fora do range


        System.out.println(Arrays.toString(notas));

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
}
