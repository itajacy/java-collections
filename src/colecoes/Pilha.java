package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    static void main() {
        //Deque = pilha

        //Last in / First out  LIFO
        Deque<String> livros = new ArrayDeque<String>();
            livros.add("Don Quixote");
            livros.push("O pequeno principe");
            livros.push("O Hobbit");

            System.out.println(livros.peek());
            System.out.println(livros.peek());
            System.out.println(livros.element());

            System.out.println(livros.pop()); // vai trazendo os elementos  o Hobbit
            System.out.println(livros.pop()); // o pequeno principe
            System.out.println(livros.pop()); // don quixote

            System.out.println(livros.poll());
            System.out.println(livros.poll());
//            System.out.println(livros.pop());
//            System.out.println(livros.pop());
            System.out.println(livros.poll());

//            livros.clear();
//            livros.contains("O Hobbit");

            System.out.println(livros.size());
            System.out.println(livros.isEmpty());





    }

}
