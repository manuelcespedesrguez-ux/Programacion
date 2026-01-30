    package Ejercicios;

    import java.util.Arrays;
    import java.util.Random;

    public class Propuesto7B {

            public static int[] apretujaOrdenado(int[] arr1, int[] arr2){

                int[] mezcla = new int[arr1.length+arr2.length];

                int i=0, j=0, k=0;
                while(i<arr1.length && j<arr2.length){ 

                    if(arr1[i]<arr2[j]) {
                        mezcla[k] = arr1[i];
                        i++;
                    }
                    else{
                        mezcla[k] = arr2[j];
                        j++;
                    }
                    k++;
                }

                while(i<arr1.length){
                    mezcla[k] = arr1[i];
                    i++;
                    k++;
                }
                while (j<arr2.length) {
                    mezcla[k] = arr2[j];
                    j++;
                    k++;
                }
                System.out.println("indice i: "+i);
                System.out.println("indice j: "+j);
                System.out.println("indice k: "+k);

                return mezcla;
            }

            public static void main(String[] args) {

                int[] uno = new int[6];
                int[] otro = new int[7];

                Random rnd = new Random();
                for(int i=0; i<uno.length; i++) uno[i] = rnd.nextInt(20);
                Arrays.sort(uno);
                System.out.println(Arrays.toString(uno));

                for(int i=0; i<otro.length; i++) otro[i] = rnd.nextInt(20);
                Arrays.sort(otro);
                System.out.println(Arrays.toString(otro));

                int[] completo = apretujaOrdenado(uno, otro);
                System.out.println("Juntado y ordenado: "+Arrays.toString(completo));
            }
    }