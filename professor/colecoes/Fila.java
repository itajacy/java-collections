package colecoes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Fila {

    static void main() {
        // FIFO - First IN/First OUT
        Queue<String> fila = new ArrayBlockingQueue<>(5);
        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");

        // fila.add("Gui"); // Adiciona ou Lança uma Exceção
        IO.println(fila.offer("Gui")); // Adiciona ou Retorna false

        IO.println(fila.peek()); // Retorna o Elemento ou null
        IO.println(fila.peek());  // Retorna o Elemento ou null
        IO.println(fila.element()); // Retorna o Elemento ou Lança uma Exceção

        IO.println(">>>>> " + fila.poll());
        IO.println(">>>>> " + fila.remove());
        IO.println(">>>>> " + fila.poll());
        IO.println(">>>>> " + fila.remove());
        IO.println(">>>>> " + fila.poll());
        IO.println(">>>>> " + fila.poll());
        IO.println(">>>>> " + fila.poll()); // Retorna o Elemento ou null
        IO.println(">>>>> " + fila.remove()); // Retorna o Elemento ou Lança uma Exceção
    }
}
