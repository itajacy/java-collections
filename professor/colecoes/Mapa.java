package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@SuppressWarnings("all")
public class Mapa {

    static void main() {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(20, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");
        usuarios.put(5, "Tiago");

        IO.println(usuarios.size());
        IO.println(usuarios.isEmpty());

        IO.println(usuarios.keySet());
        IO.println(usuarios.values());
        IO.println(usuarios.entrySet());

        IO.println(usuarios.containsKey(20));
        IO.println(usuarios.containsValue("Tiago"));

        IO.println(usuarios.get(20));
        IO.println(">>> " + usuarios.remove(1));
        IO.println(">>> " + usuarios.remove(5, "tiago"));

        for(int id: usuarios.keySet()) {
            IO.println(id);
        }

        for(String nome: usuarios.values()) {
            IO.println(nome);
        }

        for(Entry<Integer, String> registro: usuarios.entrySet()) {
            IO.println(registro.getKey() + " = " + registro.getValue());
        }
    }
}
