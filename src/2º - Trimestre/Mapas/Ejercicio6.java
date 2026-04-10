package Mapas;

import java.util.TreeMap;
import java.util.Map;

public class Ejercicio6{
    public static void main(String[] args) {
        // Creamos el TreeMap: la clave es el dorsal (Integer) y el valor el nombre (String)
        TreeMap<Integer, String> plantillaCelta = new TreeMap<>();

        // Añadimos algunos jugadores representativos
        plantillaCelta.put(10, "Iago Aspas");
        plantillaCelta.put(1, "Iván Villar");
        plantillaCelta.put(6, "Ilaix Moriba");
        plantillaCelta.put(8, "Fran Beltrán");
        plantillaCelta.put(17, "Jonathan Bamba");
        plantillaCelta.put(22, "Javier Manquillo");
        plantillaCelta.put(3, "Oscar Mingueza");
        plantillaCelta.put(2, "Carl Starfelt"); 
        plantillaCelta.put(7, "Borja Iglesias"); 
        plantillaCelta.put(23, "Tadeo Allende");

        // Imprimimos el equipo (saldrá ordenado por el número de dorsal)
        System.out.println("--- Plantilla del RC Celta (Ordenada por Dorsal) ---");
        for (Map.Entry<Integer, String> jugador : plantillaCelta.entrySet()) {
            System.out.println("Dorsal " + jugador.getKey() + ": " + jugador.getValue());
        }
    }
}
