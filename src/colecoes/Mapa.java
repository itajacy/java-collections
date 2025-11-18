package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@SuppressWarnings("all")
public class Mapa {
    static void main() {
        // Map
        // Map é mais geral e HashMap é mais específico, aqui temos uma herança
        // HashMap herda de Map
        Map<Integer, String> usuarios = new HashMap<Integer, String>();

        usuarios.put(1, "Roberto");
        usuarios.put(20, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");
        usuarios.put(5, "Tiago");

        System.out.println();
        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Tiago"));

        System.out.println(usuarios.get(20));
        System.out.println(">>>>> " + usuarios.remove(1));
        System.out.println(usuarios.remove(5,"tiago"));



        // percorrendo mapa pela chave
        for (int id : usuarios.keySet()) {
            System.out.println(id);
        }

        // percorrendo mapa pelo valor
        for (String nome : usuarios.values()) {
            System.out.println(nome);
        }

        // percorrendo mapa por ambos: chave e valor
        for (Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.println(registro.getKey() + " = " + registro.getValue());
        }





    }
}
