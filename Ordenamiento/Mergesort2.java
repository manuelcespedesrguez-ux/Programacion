package Ordenamiento;
import java.util.Arrays;
import java.util.Random;
import java.lang.String;

public class Mergesort2 {
    
    public static String[] mergeSort(String array[]) {

        if(array.length > 1){

            int element1 = array.length / 2;
            int element2 = array.length - element1;

            
            String arr1[] = new String[element1];
            String arr2[] = new String[element2];

            for(int i = 0; i < element1; i++)
                arr1[i] = array[i];

            for(int i = element1; i < element1 + element2; i++)
                arr2[i - element1] = array[i];

            arr1 = mergeSort(arr1);
            arr2 = mergeSort(arr2);

            int i = 0, j = 0, k = 0;

            while(arr1.length != j && arr2.length != k){

                if (arr1[j].compareTo(arr2[k]) < 0 ){
                    array[i] = arr1[j];
                    i++;
                    j++;
                }

                else {
                    array[i] = arr2[k];
                    i++;
                    k++;
                }
            }
        }
        return array;
    }

         public static void main(String[] args) {
        
        //1. Lista base de nombres
        String[] hombres = {"Alejandro", "Mateo", "Luca", "Diego", "Hugo", "Leo", "Bruno", "Marcos", "Pablo", "Dante"};
        String[] mujeres = {"Lucía", "Sofía", "Martina", "Valeria", "Julia", "Alba", "Emma", "Carla", "Sara", "Noa"};

        //2. Creamos el array de 100 posiciones
        String[] nombresMezclados = new String[100];
        Random random = new Random();

        //3. Rellenamos el array de 100
        for (int i = 0; i < nombresMezclados.length; i++){
            
            // Decidimos al azar si toca hombre (0) o mujer (1)
            int genero = random.nextInt(2);

            // Elegimos un nombre al azar de la lista correspondiente
            int indexName = random.nextInt(10);
            if(genero == 0) nombresMezclados[i] = hombres[indexName];
            else nombresMezclados[i] = mujeres[indexName];
        }

        System.out.println(Arrays.toString((nombresMezclados)));

        // Ordena con insertionSort
        nombresMezclados = mergeSort(nombresMezclados);

        // Vuelve a mostrar ya ordenado 
        System.out.println(Arrays.toString(nombresMezclados));
      
    }
}
