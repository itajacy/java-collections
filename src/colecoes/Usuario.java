package colecoes;

// classe criada para teste com listas

// Entidade --> com identificador único DDD
//

import java.util.Objects;

public class Usuario {
    int id;
    String nome;

    Usuario() {}

    Usuario(int id) {
        this(id,"");
    }

    Usuario(int id, String nome){
        this.id = id;
        this.nome = nome;
    }


    // Os métodos equals e hashcode no Usuario devem estar alinhados,
    // usando os mesmos atributos  e somente será feita a busca com o equals
    // se o hascode for compatível

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id;
    }



    @Override
    public int hashCode() {
        return Objects.hashCode(id);
//        return this.id;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

}

