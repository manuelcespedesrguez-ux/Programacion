package Ejercicios;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio3 {
    
        public static void main(String[] args) {
        
        // Creo mapa
        HashMap<Integer, String> m = new HashMap<Integer, String>();

        // Inserto valores
        m.put(924, "Amalia Núñez");
        m.put(235, "Cindy Nero");
        m.put(456, "Víctor Tilla");
        m.put(123, "Esteban Quito");
        m.put(700, "Ana Conda");

        System.out.println("Todas las entradas del diccionario extraídas con entrySet(): ");
        
        System.out.println(m.entrySet());

        System.out.println("\nEntradas (PAREJAS K,V) del diccionario extraídas una a una: ");

        for(Map.Entry<Integer, String> pareja : m.entrySet()){
            System.out.println(pareja);
        }

        // Visualización personalizada
    }
}
