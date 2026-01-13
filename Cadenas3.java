public class Cadenas3 {
    
    public static void main(String[] args) {
        
        //1 Definimos dos objetos String
       String cadena1 = "Hola";
       String cadena2 = "Java";

        //2 Convertir a char arrays usando .toCharArray()
       char[] array1 = cadena1.toCharArray();
       char[] array2 = cadena2.toCharArray();

       //Verificación Imprimir los arrays
        System.out.println("Primer caracter de cadena1: " + array1[0]);
        System.out.println("Primer caracter de cadena2: " + array2[array2.length - 1]);

        //Tambien podemos ver el contenido completo usando un bulce o Arrays.toString()
        System.out.println(java.util.Arrays.toString(array1));
    }
}
