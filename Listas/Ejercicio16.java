package Listas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Ejercicio 16
// Realiza un programa que sepa decir la capital de un país (en caso de conocer
// la respuesta) y que, además, sea capaz de aprender nuevas capitales. En
// principio, el programa solo conoce las capitales de España, Portugal y
// Francia.
// Estos datos deberán estar almacenados en un diccionario. Los datos sobre
// capitales que vaya aprendiendo el programa se deben almacenar en el mismo
// diccionario. El usuario sale del programa escribiendo la palabra “salir”.
//

public class Ejercicio16 {

    /**
     * Carga los datos almacenados en el archivo de texto al HashMap en memoria.
     *
     * @param mapa El diccionario donde se volcarán los datos leídos.
     */
    public static void cargaDesdeArchivo(Map<String, String> mapa) {
        // Definimos la ruta del archivo
        File archivo = new File("capitales.txt");

        // Verificamos si existe. Si es la primera vez que se corre el programa,
        // no habrá archivo y simplemente salimos para evitar errores.
        if (!archivo.exists())
            return;

        // try-with-resources: Abre el archivo y asegura que se cierre al terminar.
        // BufferedReader lee el texto de forma eficiente por líneas.
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            // Leemos línea a línea hasta que el archivo se acabe (null)
            while ((linea = br.readLine()) != null) {
                // Separamos la línea en dos partes usando el delimitador ": "
                String[] partes = linea.split(": ");

                // Si la línea tiene el formato correcto (clave y valor), la añadimos al mapa
                if (partes.length == 2) {
                    // .trim() elimina espacios innecesarios a los lados
                    mapa.put(partes[0].trim(), partes[1].trim());
                }
            }
        } catch (IOException e) {
            // Capturamos posibles errores de lectura (archivo dañado, sin permisos, etc.)
            System.err.println("Error al cargar el archivo: " + e.getMessage());
        }
    }

    /**
     * Guarda el contenido actual del HashMap en el archivo de texto.
     *
     * @param mapaCapitales El diccionario con toda la información (base +
     *                      aprendida).
     */
    public static void guardarEnArchivo(Map<String, String> mapaCapitales) {
        // try-with-resources: FileWriter crea o sobreescribe el archivo.
        // BufferedWriter mejora el rendimiento al no escribir byte a byte en el disco.
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("capitales.txt"))) {

            // Recorremos cada entrada (par clave-valor) del diccionario
            for (Map.Entry<String, String> entrada : mapaCapitales.entrySet()) {
                // Escribimos en el formato "País: Capital"
                bw.write(entrada.getKey() + ": " + entrada.getValue());
                // Insertamos un salto de línea específico del sistema operativo
                bw.newLine();
            }
            // Al salir del bloque try, el buffer se vacía (flush) y el archivo se cierra.

        } catch (IOException e) {
            // Capturamos errores de escritura (disco lleno, archivo protegido, etc.)
            System.err.println("Ocurrió un error al guardar: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, String> capitales = new HashMap<>();

        // --- 1. Inicialización de datos base ---
        capitales.put("España", "Madrid");
        capitales.put("Portugal", "Lisboa");
        capitales.put("Francia", "París");
        // ... (el resto de tus capitales.put irían aquí)

        // --- 2. Carga de memoria externa ---
        // Llamamos al método para que lo que aprendió el programa antes prevalezca
        cargaDesdeArchivo(capitales);

        // --- 3. Bucle de ejecución ---
        while (true) {
            System.out.print("Escribe el nombre de un país (o 'salir'): ");
            String pais = s.nextLine();

            if (pais.equalsIgnoreCase("salir")) {
                break;
            }

            if (capitales.containsKey(pais)) {
                System.out.println("La capital de " + pais + " es " + capitales.get(pais));
            } else {
                System.out.print("No conozco la respuesta ¿cuál es la capital de " + pais + "?: ");
                String nuevaCapital = s.nextLine();

                // Actualizamos el mapa en tiempo real
                capitales.put(pais, nuevaCapital);

                // Persistimos los cambios en el archivo inmediatamente
                guardarEnArchivo(capitales);

                System.out.println("Gracias por enseñarme.");
            }
        }

        System.out.println("¡Hasta luego!");
        s.close();
    }
}