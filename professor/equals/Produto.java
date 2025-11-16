package equals;

import java.util.Objects;

// Entidade
public class Produto {
    int id;
    String nome;

    Produto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(!(obj instanceof Produto produto)) {
//            return false;
//        }
//
//        return id == produto.id;
//    }


    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Produto produto = (Produto) object;
        return id == produto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    public boolean deepEquals(Produto produto) {
        boolean mesmoId = id == produto.id;
        boolean mesmoNome = nome.equals(produto.nome);
        return mesmoId && mesmoNome;
    }
}
