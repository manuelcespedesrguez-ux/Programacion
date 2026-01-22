package Ejercicios;

import java.util.Scanner;

public class Resuelto8 {
    
public static boolean esCapicua(int numero){
    
    boolean cap = false;
    String derecho = String.valueOf(numero);
    String reves =  new StringBuilder(derecho).reverse().toString();
    int oremun = Integer.parseInt(reves);
    if(numero == oremun)
        cap = true;
    return cap;    
    }

    public static void main(String[] args) {
        
        System.out.println("Dame un entero: ");
        Scanner sc = new Scanner(System.in);
        int lee = Integer.parseInt(sc.nextLine());

        System.out.println("El número es capicúa: "+esCapicua(lee));
    }
}
