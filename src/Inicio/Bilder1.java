package Inicio;

public class Bilder1 {
    
    public static void main(String[] args) {
        
        StringBuffer nombre = new StringBuffer("Renso");
        @SuppressWarnings("StringBufferMayBeStringBuilder")
        StringBuffer apellidos = new StringBuffer(80);
        @SuppressWarnings("unused")
        StringBuffer direccion = new StringBuffer();

        System.out.println(nombre.length());
        System.out.println(nombre.capacity());

        System.out.println(apellidos.length());
        System.out.println(apellidos.capacity());

        @SuppressWarnings("RedundantStringConstructorCall")
        String otrosapellidos = new String(" Moreno Pérez");
        nombre.append(otrosapellidos);
        nombre.append(" porque no saben preonunsiar el peruano");

        System.out.println(nombre);
        
        nombre.reverse();

        String experimento_finalizado=nombre.toString();

        System.out.println(experimento_finalizado);
        
    }
}
