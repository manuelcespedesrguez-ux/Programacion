package Ordenamiento;
import java.util.Arrays;

public class InsertionSort {
        
        public static int[] insertionsort(int[] numbers) {

    for (int i = 0; i < numbers.length; i++) {
        int copyNumber = numbers[i];
        int j = i;
        while (j > 0 && copyNumber < numbers[j-1]) {
            numbers[j] = numbers[j-1];
            j--;
        }
        numbers[j] = copyNumber;
    }
    return numbers;
    }

    public static void main(String[] args) {
        int[] datos = {2, 5, 0, 9, 3, 1, 8, 4, 7, 6, 2, 5, 9, 0, 3, 1, 4, 7, 8, 2};
        System.out.println(Arrays.toString(datos));
        datos = insertionsort(datos);
        System.out.println(Arrays.toString(datos));   
    }
}
