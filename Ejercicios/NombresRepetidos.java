package Ejercicios;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class NombresRepetidos {
    
    public static void main(String[] args) {
        
        Random random = new Random();

        String[] nombres = {"Alejandro", "Mateo", "Santiago", "Daniel", "Sebastián", "Hugo", "Nicolás", "Gabriel", "Samuel",
            "Sofía", "Isabella", "Valentina", "Lucía", "Camila", "Martina", "Elena", "Mariana", "Victoria", "Daniela", "Jeremías"};

        int tam1 = 7+ random.nextInt(5);
        int tam2 = 5 + random.nextInt(5);
        String[] array1 = new String[tam1];
        String[] array2 = new String[tam2];
        
        System.out.println(array1.length);
        System.out.println(array2.length);

        for(int i = 0; i < tam1; i++ ){
            array1[i] = nombres[random.nextInt(20)];
        }

        for(int i = 0; i < tam2; i++){
            array2[i] = nombres[random.nextInt(20)];
        }

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        String[] temporal = new String[Math.min(array1.length, array2.length)];

        int i = 0; // Puntero para array1
        int j = 0; // Puntero para array2
        int k = 0; // Puntero para array de resultado temporal

        while (i < tam1 && j < tam2) {
            int comparacion = array1[1].compareTo(array2[j]);

            if (comparacion == 0) {
                // ¡Hay coincidencia!
                // Evitamos duplicados en el resultado
                if (k == 0 || !array1[i].equals(temporal[k - 1])){
                    temporal[k++] = array1[i];
                }
                i++;
                j++;
            }else if (comparacion < 0){
                // El nombre en lista1 es alfabéticamente menor, avanzamos en lista1
                i++;
            }else { // Comparación > 0
                // El nombre en lista2 es alfabéticamente menor, avanzamos en lista2
                j++;
            }
        }

        // Recortamos el array al tamaño real de coincidencia encontradas
        temporal = Arrays.copyOf(temporal, k);
    }
}
