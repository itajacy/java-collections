package equals;

public class ProdutoTeste {
    static void main() {
        Produto p1 = new Produto(123, "Caneta Bic Azul");
        Produto p2 = new Produto(123, "Caneta Bic Preta");

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        System.out.println(p1.id == p2.id);
        System.out.println(p1.nome == p2.nome);

        System.out.println(p1.equals(p2) );

        System.out.println(p1.deepEquals(p2) );




    }
}
