package Inicio;

public class bilder2 {
    
    public static void main(String[] args) {
        
        StringBuffer nombre = new StringBuffer("EMMA");
        String apellidos = new String(" MORENO");

        nombre.insert(nombre.length(), apellidos);
        System.out.println(nombre);

        StringBuffer nombre2 = new StringBuffer("RAÚL JESÚS TURRIÓN");
        nombre2 = nombre2.delete(4,10);
        System.out.println(nombre2);

        StringBuffer nombre3 = new StringBuffer("RAÚL JESÚS TURRIÓN");
        String turri = nombre3.substring(0, 4) + nombre3.substring(10);
        System.out.println("y sale: "+turri);

        StringBuffer nombre4 = new StringBuffer("TURRIÓN");
        nombre.append(0);
    }
}
