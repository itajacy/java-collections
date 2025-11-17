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


        System.out.println(p1.hashCode() );
        System.out.println(p1.toString() );  // base decimal
        System.out.println(Integer.parseInt("7b", 16) );  //base hexadecimal

        System.out.println(Integer.toString(123, 2) );  //base binaria
        System.out.println(Integer.toString(123, 10) );  //base decimal
        System.out.println(Integer.toString(123, 16) );  //base hexa



    }
}
