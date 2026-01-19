import java.util.Arrays;

public class BubbleSort {
    
    public static int[] burbuja(int[] array) {

        int[] aux = array;
        for(int i=1;i<aux.length;i++){
            for(int j=0;j<aux.length-i;j++){
                if(aux[j]>aux[j+1]){
                    int swap = aux[j];
                    aux[j]=aux[j+1];
                    aux[j+1]=swap;
                }
            }
        }

        return aux;
    }

        public static double[] burbuja(double[] array) {

        double[] aux = array;
        for(int i=1;i<aux.length;i++){
            for(int j=0;j<aux.length-i;j++){
                if(aux[j]>aux[j+1]){
                    double swap = aux[j];
                    aux[j]=aux[j+1];
                    aux[j+1]=swap;
                }
            }
        }

        return aux;
    }

    public static void main(String[] args) {
        
    int[] datos = {2, 5, 0, 9, 3, 1, 8, 4, 7, 6, 2, 5, 9, 0, 3, 1, 4, 7, 8, 2}; 
        System.out.println(Arrays.toString(datos));
        
        datos = burbuja(datos);
        System.out.println(Arrays.toString(datos));

        // Parte 2
        double[] masDatos = {
            1.5, 4.2, 0.8, 9.1, 3.3, 1.9, 8.4, 4.7, 7.0, 6.2,
            2.1, 5.5, 9.9, 0.2, 3.8,
            1.1, 4.4, 7.6, 8.3, 2.9
        };

        System.out.println(Arrays.toString(masDatos));
        masDatos = burbuja(masDatos);
        System.out.println(Arrays.toString(masDatos));
}
}
