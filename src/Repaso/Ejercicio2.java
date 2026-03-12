package Repaso;

public class Ejercicio2 {
    
    // Ingresar una cadena y determinar cuantas palabras se encuentran en la cadena. 
    // Cada palabra se separa por medio de un espacio en blanco.

    public static void main(String[] args) {
     
        String cad = "Hola me llamo Sergio Estíbanez y me gusta la pasta";
        String [] result = cad.split("[ ]");

        System.out.println(cad);

        System.out.println("Está formada por "+result.length);

        for (int i=result.length - 1; i>=0; i--) {
            String palabraActual = result[i];
            for (int j=palabraActual.length()-1; j>=0; j--) {
                System.out.print(palabraActual.charAt(j));
            }
            System.out.print(" ");
        }
    }
}
