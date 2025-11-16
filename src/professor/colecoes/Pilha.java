package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    static void main() {
        // Last IN/First OUT (LIFO)
        Deque<String> livros = new ArrayDeque<>();
        livros.add("Don Quixote");
        livros.push("O Pequeno Príncipe");
        livros.push("O Hobbit");

        IO.println(livros.peek());
        IO.println(livros.peek());
        IO.println(livros.element());

        IO.println(livros.pop());
        IO.println(livros.poll());
        IO.println(livros.poll());
        // IO.println(livros.pop());
        //IO.println(livros.pop());
        IO.println(livros.poll());

        // livros.clear();
        // livros.contains();
        IO.println(livros.size());
        IO.println(livros.isEmpty());
    }
}
