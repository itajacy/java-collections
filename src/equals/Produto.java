package equals;

// Entidade  --> tem um id unico

public class Produto {
    int id;
    String nome;

    Produto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
//  equals sem a implementacao
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }

    // equals comparando os ids
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Produto produto)) {
            return false;
        }
        return id == produto.id;
    }

    // criando outro método equals
//  deepEquals que compara todos os atributos id e nome
    public boolean deepEquals(Produto produto) {
        boolean mesmoId = (id == produto.id);
        boolean mesmoNome = (nome.equals(produto.nome));
        return mesmoId && mesmoNome;


    }

}
