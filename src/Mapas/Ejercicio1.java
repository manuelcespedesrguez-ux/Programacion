package Mapas;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        // Creo mapa
        HashMap<Integer, String> m = new HashMap<Integer, String>();

        // Inserto valores
        m.put(924, "Amalia Núñez");
        if(m.containsKey(235))
            m.put(235, "Cindy Nero");

        m.put(456, "Víctor Tilla");
        m.put(123, "Esteban Quito");
        m.put(700, "Ana Conda");

        // Visualización sin ordenamiento
        System.out.println("Los elementos de m son: \n" + m);

        // Visualización por parejas recorriendo el mapa completo 
        for(Map.Entry<Integer, String> pareja : m.entrySet()) {
            System.out.println("Clave: " + pareja.getKey() + " --> Valor: " + pareja.getValue());
        }
    }
}
