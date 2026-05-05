package Ejercicios;

import java.util.Scanner;

public class Resuelto8 {
    
public static boolean esCapicua(int numero){
    
    @SuppressWarnings("unused")
    boolean cap = false;
    String derecho = String.valueOf(numero);
    String reves =  new StringBuilder(derecho).reverse().toString();
    @SuppressWarnings("unused")
    int oremun = Integer.parseInt(reves);
    return derecho.equals(reves);    
    }

    public static void main(String[] args) {
        
        System.out.println("Dame un entero: ");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int lee = Integer.parseInt(sc.nextLine());

        System.out.println("El número es capicúa: "+esCapicua(lee));
    }
}
