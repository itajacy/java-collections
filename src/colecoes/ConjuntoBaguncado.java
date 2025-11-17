package colecoes;

import java.util.HashSet;

@SuppressWarnings("all")
public class ConjuntoBaguncado {
    static void main() {

        HashSet conjunto = new HashSet();
        conjunto.add(1.2); //double -> Double
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é "+ conjunto.size()); // metodo size para ver tamanho
        conjunto.add("Teste");
        conjunto.add('x');
        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));
        System.out.println("Tamanho é "+ conjunto.size());

        System.out.println(conjunto.contains("Teste"));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        HashSet nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(conjunto);
        System.out.println(nums);
//        conjunto.retainAll(nums);  //intercecção entre os 2 conjuntos
        conjunto.add(nums);  // união dos 2 conjuntos
        System.out.println(conjunto);

        conjunto.clear();  // limpa o conjunto
        System.out.println(conjunto);




    }
}
