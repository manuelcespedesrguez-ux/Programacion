package Ordenamiento;
import java.util.Arrays;
import java.util.Random;

public class InsertionSort2 {
    
     public static String[] insertionsort(String[] numbers) {

    for (int i = 0; i < numbers.length; i++) {
        String copyNumber = numbers[i];
        int j = i;
        while (j > 0 && (copyNumber.compareTo(numbers[j-1])<0)) {
            numbers[j] = numbers[j-1];
            j--;
        }
        numbers[j] = copyNumber;
    }
    return numbers;
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
        nombresMezclados = insertionsort(nombresMezclados);

        // Vuelve a mostrar ya ordenado 
        System.out.println(Arrays.toString(nombresMezclados));
    }
}
