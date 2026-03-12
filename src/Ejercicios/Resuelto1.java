package Ejercicios;
import java.util.Arrays;

public class Resuelto1 {
    
    public static void main(String[] args) {
        
        int[][] matriz = new int[5][8];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++){
                matriz[i][j] = i + j;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <8; j++) {
                System.out.print(matriz[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        //Como podría usar Arrays.toString para sacar este array de dos dimensiones
        System.out.println();
        System.out.println(Arrays.deepToString(matriz));

        //A mi manera
        System.out.println(" a súa maneira");
        for(int i=0; i< matriz.length; i++)
            System.out.println(Arrays.toString(matriz[i]));
    }
}
