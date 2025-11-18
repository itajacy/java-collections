package colecoes;

import java.util.HashSet;
import java.util.Set;

public class TesteHash {
    //  Lembre de ver a implementação do hashcode no Usuario

    // Os métodos equals e hashcode no Usuario devem estar alinhados,
    // usando os mesmos atributos  e somente será feita a busca com o equals
    // se o hascode for compatível

    static void main() {
        Set<Usuario> usuarios = new HashSet<>();
        usuarios.add(new Usuario(1, "Ana"));
        usuarios.add(new Usuario(2, "Bia"));
        usuarios.add(new Usuario(3, "Carlos"));
        usuarios.add(new Usuario(4, "Daniel"));
        usuarios.add(new Usuario(5, "Felipe"));
        usuarios.add(new Usuario(6, "Guilherme"));

        boolean encontrado = usuarios.contains(new Usuario(3));
        System.out.println(encontrado);
    }
}
