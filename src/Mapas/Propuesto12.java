package Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Propuesto12 {
    
    public static void main(String[] args) {
        
        HashMap<String, String> diccionario = new HashMap<String, String>();

        diccionario.put("Hola", "Hello");
        diccionario.put("Mesa", "Table");
        diccionario.put("Silla", "Chair");
        diccionario.put("Libro", "Book");
        diccionario.put("Coche", "Car");
        diccionario.put("Manzana", "Apple");
        diccionario.put("Agua", "Water");
        diccionario.put("Perro", "Dog");
        diccionario.put("Gato", "Cat");
        diccionario.put("Ventana", "Window");

        // Ejemplo: imprimir el diccionario completo
        System.out.println("--- Contenido del Diccionario---");
        for (Map.Entry<String, String> entrada : diccionario.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }

        System.out.println("\nClaves del diccionario: " + diccionario.keySet());
        
        String[] palabras = diccionario.keySet().toArray(new String[0]);
        // Ejemplo: Buscar una palabra específica
        System.out.println(palabras);
        String buscar = palabras[new Random().nextInt(palabras.length)];

        System.out.println("\nBúsqueda de "+buscar+" : "+diccionario.get(buscar));
        if (diccionario.containsKey(buscar)) {
            System.out.println("Traducción: " + diccionario.get(buscar));
        } else {
            System.out.println("La palabra no se encuentra en el diccionario.");
        }
        
    }
}
