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

        for (int i = 0; i < listaMedicos.size(); i++) {
            Medico a = (Medico) listaMedicos.get(i);
            if (a instanceof Ortopedista) {
                System.out.println("El objeto en el índice " + i + " es un Ortopedista");
                continue;
            }
            if (a instanceof Pediatra) {
                System.out.println("El objeto en el índice " + i + " es un Pediatra");
                continue;
            }
            if (a instanceof Medico) {
                System.out.println("El objeto en el índice " + i + " es un Médico");
                continue;
            }
        }
    }
}
