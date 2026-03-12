package Repaso;

public class Ejercicio5A {

    // Hacer un programa que al recibir como datos dos cadenas de caracteres
    // forme una tercera cadena intercalando los caracteres de las palabras de las cadenas recibidas

    public static void main(String[] args) {
        
    String cad1 = "Hola me llamo María Auxiliadora";
    String cad2 = "ójala les interese mi historia";

    char[] cadena1 = cad1.toCharArray();
    char[] cadena2 = cad2.toCharArray();
    
    char[] mix = new char[cadena1.length + cadena2.length];
    
    String resultado = "";

    for (int i= 0; i < mix.length; i++) {
        if (i <cad1.length())
            resultado += cad1.charAt(i);
        if (i <cad2.length())
            resultado += cad2.charAt(i);
    
    }

    System.out.println(resultado);


    }
}