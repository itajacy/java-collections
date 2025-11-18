package colecoes;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

// FILA
public class Fila {
    static void main() {
        // fila

        // offer, peel e poll  não retornam exceção
        // FIFO


        Queue<String> fila = new ArrayBlockingQueue<>(5);
        // fila que temos que passar a capacidade

        fila.add("Ana"); // adiciona ou lança exeção
        fila.offer("Bia");  // para adicionar como o add, mas retorna falso caso seja maior q a capacidade da fila

        fila.add("Carlos");
        fila.add("Daniel");
        fila.add("Rafaela");

//        fila.add("Gui");
       System.out.println( fila.offer("Gui"));

       System.out.println(fila.peek()); // retorna nulo se lista vazio
       System.out.println(fila.peek());
       System.out.println(fila.element());  // em caso de nulo retorna uma exception

       System.out.println(">>>>> " + fila.poll()); //pega o primeiro da lista e remove
       System.out.println(">>>>> " + fila.remove()); //pega o primeiro da lista e remove
       System.out.println(">>>>> " + fila.poll()); //pega o primeiro da lista e remove
       System.out.println(">>>>> " + fila.remove()); //pega o primeiro da lista e remove
//       System.out.println(">>>>> " + fila.poll()); //pega o primeiro da lista e remove
//       System.out.println(">>>>> " + fila.poll()); //pega o primeiro da lista e remove
//       System.out.println(">>>>> " + fila.poll()); //Retorna o elemento ou nulo
//       System.out.println(">>>>> " + fila.remove()); //Retorna o Elemento ou lança exceção


//        System.out.println(fila.size());

    }
}
