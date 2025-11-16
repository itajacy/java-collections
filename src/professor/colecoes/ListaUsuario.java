package colecoes;

import java.util.ArrayList;
import java.util.List;

public class ListaUsuario {
    static void main() {
        List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario(1, "Leonardo");

        lista.add(u1);
        lista.add(new Usuario(2, "Larisse"));
        lista.add(new Usuario(3, "Alexandre"));
        lista.add(new Usuario(4, "Jessica"));
        lista.add(new Usuario(5, "Ana"));
        lista.add(new Usuario(6, "Nicholas"));

        IO.println(lista.get(3));

        IO.println(">>>>> " + lista.remove(1));
        IO.println(">>>>> " + lista.remove(new Usuario(6, "Bla bla bla")));

        IO.println("Tem? " + lista.contains(new Usuario(1)));
        IO.println("Tem? " + lista.contains(new Usuario(6)));

        for(Usuario usuario: lista) {
            IO.println(usuario);
        }
    }
}
