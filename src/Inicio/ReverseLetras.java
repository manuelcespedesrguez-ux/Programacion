package Inicio;

public class ReverseLetras {
    
    public static void main(String[] args) {
        
        String frase = "Hola, me llamo Luca, soy una persona algo tímida y vivo en el piso dos.";

        String[] arrayPalabras = frase.split("");
        String vuelta = "";
        for( int j = arrayPalabras.length-1;j>=0;j--) {
            vuelta += arrayPalabras[j];
        }

        System.out.println(vuelta);
    }
}
