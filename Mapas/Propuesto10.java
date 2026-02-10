package Mapas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Propuesto10 {

    // * 10. Realiza un programa que cree un array de 100 posiciones
    // con números aleatorios entre 1 y 100. Una vez creado el array
    // el programa deberá ordenar lo y mostrar los números entre 1 y 100 que no han
    // aparecidodos. */

    public static void main(String[] args) {

        int[] enteros = new int[100];
        Random random = new Random();

        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = 1 + random.nextInt(100);
        }

        System.out.println(Arrays.toString(enteros));

        // Enteros
        Arrays.sort(enteros);
        System.out.println(enteros);

        // Recoge en alguna estructura de almacenamiento los números que no están

        List<Integer> faltantes = new ArrayList<>();

        // Reciclo un método de búsqueda binaria propio
        for (Integer num : enteros) {
            if (!busquedaNumero(enteros, num))
                faltantes.add(num);
            System.out.println(num);
        }

        System.out.println("No salen en la once hoy");
        System.out.println(faltantes);
    }

    public static boolean busquedaNumero(int[] enteros, int numero) {

        int indice = Arrays.binarySearch(enteros, numero);
        if (indice >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
