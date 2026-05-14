package SeleccionPanchi;

import java.util.ArrayList;
import java.util.List;

public class TesteoCelta {
    
    public static void main(String[] args) {

        Tecnico giraldez = new Tecnico("Claudio", "Giráldez", 36, 10, true);

        Porteros guaita = new Porteros("Vicente", "Guaita", 37, true, 45);

        List<Defensas> defensas = new ArrayList<Defensas>();
        List<Mediocampista> mediocentro = new ArrayList<Mediocampista>();
        List<Delantero> delantero = new ArrayList<Delantero>();

        Defensas defensa1 = new Defensas("Oscar", "Mingueza", 25, true, 15, 2);
        defensas.add(defensa1);

        Defensas defensa2 = new Defensas("Carl", "Starfelt", 29, true, 20, 4);
        defensas.add(defensa2);

        Defensas defensa3 = new Defensas("Jailson", "Marques", 28, true, 12, 3);
        defensas.add(defensa3);

        Defensas defensa4 = new Defensas("Javi", "Rodríguez", 21, true, 10, 1);
        defensas.add(defensa4);

        Mediocampista mediocentro1 = new Mediocampista("Fran", "Beltrán", 25, true, 2);
        mediocentro.add(mediocentro1);

        Mediocampista mediocentro2 = new Mediocampista("Hugo", "Sotelo", 20, true, 5);
        mediocentro.add(mediocentro2);

        Mediocampista mediocentro3 = new Mediocampista("Williot", "Swedberg", 20, true, 8);
        mediocentro.add(mediocentro3);

        Mediocampista mediocentro4 = new Mediocampista("Luca", "de la Torre", 26, true, 4);
        mediocentro.add(mediocentro4);

        Delantero delantero1 = new Delantero("Iago", "Aspas", 36, true, 200);
        delantero.add(delantero1);

        Delantero delantero2 = new Delantero("Borja", "Iglesias", 31, true, 12);
        delantero.add(delantero2);

        // Tecnico (Floren traelo)
        giraldez.imprimir();
        
        // Portero (Bueno depende del día)
        guaita.imprimir();

        // Defensas (a veces coladeros)
        defensa1.imprimir();
        defensa2.imprimir();
        defensa3.imprimir();
        defensa4.imprimir();
        
        // Medios parte piernas
        mediocentro1.imprimir();
        mediocentro2.imprimir();
        mediocentro3.imprimir();
        mediocentro4.imprimir();

        // Delanteros pichichis
        delantero1.imprimir();
        delantero2.imprimir();
    }
}