package equals;

public class ProdutoTeste {

    static void main() {
        Produto p1 = new Produto(123, "Caneta Bic Azul");
        Produto p2 = new Produto(123, "Caneta Bic Preta");

        IO.println(p1 == p2);
        IO.println(p1.equals(p2));

        IO.println(p1.id == p2.id);
        IO.println(p1.nome.equals(p2.nome));

        IO.println(p1.equals(p2));
        IO.println(p1.deepEquals(p2));

        IO.println(p1.hashCode());
        IO.println(p1.toString());

        IO.println(Integer.toString(123, 16));

    }
}
