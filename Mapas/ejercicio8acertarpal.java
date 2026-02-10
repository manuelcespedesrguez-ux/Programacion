package Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class ejercicio8acertarpal {
    
    public static HashMap<String, String> diccionario = crearDiccionario(); 

    public static HashMap<String, String> crearDiccionario() {
        
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
        return diccionario;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Creamos otro diccionario
        crearDiccionario();

        // Veo las palabras en castellano Keys
        System.out.println(diccionario.keySet());

        // Genero un array estático de palabras en castellano con el keyset
        String[] palabras = diccionario.keySet().toArray(new String[0]);

        // Contador de aciertos
        int cont = 0;

        // Vamos a generar palabras aleatorias
        for(int i = 0; i < 5; i++) {
            int indice = new Random().nextInt(palabras.length);
            String palabra = palabras[indice];
            System.out.println("Traduce la siguiente palabra aleatoria: " + palabra);
            String respuesta = sc.nextLine();
            if (respuesta.equals(diccionario.get(palabra))) {
                cont++;
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto. La traducción correcta es: " + diccionario.get(palabra));
            }
    }
    System.out.println("Has acertado " + cont + " de 5 palabras.");
}
}
