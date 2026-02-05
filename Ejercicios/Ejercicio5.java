package Ejercicios;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio5 {

    public static void main(String[] args) {

        // Creo mapa
        HashMap<Integer, String> m = new HashMap<Integer, String>();

        // Inserto valores
        m.put(924, "Amalia Núñez");
        m.put(235, "Cindy Nero");
        m.put(456, "Víctor Tilla");
        m.put(123, "Esteban Quito");
        m.put(700, "Ana Conda");

        System.out.println("Hash no guarda el orden"); 
        System.out.println("Todas las entradas del diccionario extraídas con entrySet(): ");

        System.out.println(m.entrySet());

        System.out.println("Para verlo ordenado sin usar treeMap puedo usar la api stream para hacer un recorrido ...");
        m.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey())
        .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

    }
}
