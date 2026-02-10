package Inicio;

import java.util.Arrays;
import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] temperaturas1;

        temperaturas1 = new int[10];

        System.out.println(Arrays.toString(temperaturas1));

        for(int i=0;i<temperaturas1.length;i++) {

            System.out.println("Dame un entero para el indice: "+i);
            temperaturas1[i]=Integer.parseInt(sc.nextLine());
        }

        System.out.println(Arrays.toString(temperaturas1));

        int[] temperaturas2 = (int[]) temperaturas1.clone();

        int[] temperaturas3 = temperaturas1;

        if (Arrays.equals(temperaturas1, temperaturas2)) {
            System.out.println("temperaturas1==temperaturas2");
        } else {
            System.out.println("temperaturas1!=temperaturas2");
        }

        if (Arrays.equals(temperaturas1, temperaturas3)) {
            System.out.println("temperaturas1==temperaturas3");
        } else {
            System.out.println("temperaturas1!=temperaturas3");
        }

        System.out.println("temp1");
        System.out.println(Arrays.toString(temperaturas1));

        System.out.println("temp2");
        System.out.println(Arrays.toString(temperaturas2));

        System.out.println("temp3");
        System.out.println(Arrays.toString(temperaturas3));
        
    }
}