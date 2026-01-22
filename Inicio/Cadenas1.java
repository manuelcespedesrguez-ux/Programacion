package Inicio;
import java.util.Arrays;
public class Cadenas1 {
     public static void main(String[] args9) {

        char[] nombre1 = {'P','e','p','e'};
        char[] nombre2 = {112,101,112,101};
        char[] nombre3 = new char[4];

        System.out.println("nombre1: " + Arrays.toString(nombre1));
        System.out.println("nombre2: " + Arrays.toString(nombre2));
        System.out.println("nombre3: " + Arrays.toString(nombre3));


        //Como convierto directamente estos Arrays de caracteres a objetos String
        String cadena1 = new String(nombre1);
        System.out.println(cadena1);

        //usando String.valueOF()
        String cadena2 = String.valueOf(nombre2);
        System.out.println(cadena2);
         //a pelo con un recorrido

        for (int i = 0; i < nombre3.length; i++) {
        }

     }
}
