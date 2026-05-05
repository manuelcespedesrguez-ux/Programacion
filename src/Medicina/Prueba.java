package Medicina;

import java.util.ArrayList;

public class Prueba {
    
    public static void main(String[] args) {

        ArrayList<Medico> listaMedicos = new ArrayList<>();
        
        Medico medico1 = new Medico("Dr. García Vaquero");
        listaMedicos.add(medico1);

        Ortopedista orto1 = new Ortopedista("Dr. Carlos Pineda", Ortopedista.tipologia.traumatologo);
        listaMedicos.add(orto1);

        Pediatra pedi1 = new Pediatra("Dra. Ana Moreno", Pediatra.tipologia.neurologo);
        listaMedicos.add(pedi1);

    }

}
