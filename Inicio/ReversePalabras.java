package Inicio;

import java.util.StringTokenizer;

public class ReversePalabras {
    
    @SuppressWarnings("StringConcatenationInsideStringBufferAppend")
    public static void main(String[] args) {
        
        String frase = "Hola, me llamo Luca, soy una persona algo tímida y vivo en el piso dos.";

        StringTokenizer st = new StringTokenizer(frase, ",.");
        @SuppressWarnings("unused")
        int toques = st.countTokens();  

        StringBuilder reves=new StringBuilder();
        while (st.hasMoreTokens()) {
            reves.append(""+st.nextToken());
        }

        String vuelta = reves.reverse().toString();
        System.out.println(vuelta);
    }
}
