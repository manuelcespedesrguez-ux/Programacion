package Mapas;

import java.util.Arrays;
import java.util.Random;

public class Propuesto1 {

    public static void ordena(int array[]) {
        int aux;
        for (int i=array.length; i>0; i--) {
            boolean intercambiado = false; // Reset de la bandera en cada pasada
            for(int j= 0; j < i - 1;j++) {
                if (array[j] > array[j + 1]);
            }
        }
    }
    
     public static void main(String[] args) {

        // 1. Declaramos el array de 50 posiciones (capacidad fija)
		int[] numeros = new int [50];
        Random random = new Random();

        // 2. Llenamos el array con el bucle
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = 1 + random.nextInt(99);
        }
        System.out.println("Array desordenado");
        System.out.println(Arrays.toString(numeros));

        // Voy a ordenar en vez de por bubble por la patilla
        // Arrays.sort(numeros);

        System.out.println("Array ordenado");
        System.out.println("Ordenado: "+Arrays.toString(numeros));
    }

}
