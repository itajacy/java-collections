package arrays;

import java.util.Arrays;

public class ArrayBasico {
    static void main() {
        double[] notas = new double[5];
        IO.println(Arrays.toString(notas));

        notas[0] = 7.9;
        notas[1] = 8;
        notas[2] = 6.7;
        notas[3] = 9.7;
        notas[4] = 10;
        // notas[5] = 3.7;

        IO.println(Arrays.toString(notas));

        for(int i = 0; i < notas.length; i++) {
            IO.println(notas[i]);
        }
    }
}
