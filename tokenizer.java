import java.util.StringTokenizer;

public class tokenizer {
 
    public static void main(String[] args) {
        String parrafo = "Hola, me llamo Luca, soy una persona algo tímida y vivo en el piso dos.";

        //Creamos el obejto StringTokenizer
        //El segundo parámetro indica los delimitadores
        StringTokenizer st = new StringTokenizer(parrafo, " ,.");
        int toques = st.countTokens();

        System.out.println(("--- Desglosando el párrafo ---"));

        //Los métodos principales son hasMoreTokens() y nextToken()
        while (st.hasMoreTokens()) {
            System.out.println("Palabra: "+ st.nextToken());
        }

        //también podemos saber cuántos tokens quedan por procesar
        System.out.println("Palabras: "+st.countTokens());

        //También podemos saber cuántos tokens quedan por procesar
        System.out.println("Total de elementos procesados: "+toques);
    }

}
