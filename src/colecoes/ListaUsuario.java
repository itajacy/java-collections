package colecoes;

import java.util.ArrayList;

public class ListaUsuario {
    static void main() {

        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        Usuario u1 = new Usuario(1, "Leonardo");

        lista.add(u1);
        lista.add(new Usuario(2, "Larisse"));
        lista.add(new Usuario(3, "Alexandre"));
        lista.add(new Usuario(4, "Jessica"));
        lista.add(new Usuario(5, "Ana"));
        lista.add(new Usuario(6, "Nicholas"));

        System.out.println(lista.get(3));  // exibe o indice 3

        System.out.println(">>>>>> " + lista.remove(1));
        IO.println(">>>>> " + lista.remove(new Usuario(6, "Bla bla bla"))); // remove pelo id

        // o que define a identidade de um objeto é o seu equals e o hashcode

        IO.println("Tem? " + lista.contains(new Usuario(1))); //existe
        IO.println("Tem? " + lista.contains(new Usuario(6))); //não existe


        for (Usuario usuario : lista) {
            System.out.println(usuario);

        }
    }
}
