package Ordenamiento;
import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    
    public static int[] selectionsort(int[] numbers){

            for (int i = 0; i < numbers.length - 1; i++){
        
                int index = i;
                for (int j = i + 1; j < numbers.length; j++)
                if (numbers[j] < numbers[index]) //Busca el número más pequeño
                    index = j;

                int smallerNumber = numbers[index];  //Swap
                numbers[index] = numbers[i];
                numbers[i] = smallerNumber;

            }

        return numbers;
    
    }

    public static void main(String[] args) {
        int[] datos = {2, 5, 0, 9, 3, 1, 8, 4, 7, 6, 2, 5, 9, 0, 3, 1, 4, 7, 8, 2};
        System.out.println(Arrays.toString(datos));
        datos = selectionsort(datos);
        System.out.println(Arrays.toString(datos));   

        int[] numeros = new int[10000];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(numeros));
        datos = selectionsort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}
