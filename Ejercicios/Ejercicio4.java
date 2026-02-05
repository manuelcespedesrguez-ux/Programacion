package Ejercicios;

import java.util.HashMap;
import java.util.TreeMap;

public class Ejercicio4 {
    
    
    public static void main(String[] args) {
                
        // Creo mapa
        TreeMap<Integer, String> m = new TreeMap<Integer, String>();

        // Inserto valores
        m.put(924, "Amalia Núñez");
        m.put(235, "Cindy Nero");
        m.put(456, "Víctor Tilla");
        m.put(123, "Esteban Quito");
        m.put(700, "Ana Conda");

        System.out.println("Todas las entradas del diccionario extraídas con entrySet(): ");
        
        System.out.println(m.entrySet());

    }
}
