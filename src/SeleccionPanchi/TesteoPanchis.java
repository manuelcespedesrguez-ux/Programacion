package SeleccionPanchi;

import java.util.ArrayList;
import java.util.List;

public class TesteoPanchis {
    
    public static void main(String[] args) {
        
        Tecnico Queiroz = new Tecnico("Carlos", "Queiroz", 66, 30, false);

        Porteros Ospina = new Porteros("David", "Ospina", 30, true, 10);

        List<Defensas> defensas = new ArrayList<Defensas>();
        List<Mediocampista> mediocentro = new ArrayList<Mediocampista>();
        List<Delantero> delantero = new ArrayList<Delantero>();

        Defensas defensa1 = new Defensas("Yerry", "Mina", 24, true, 5, 0);
        defensas.add(defensa1);

        Defensas defensa2 = new Defensas("Davison", "Sánchez", 23, true, 1, 2);
        defensas.add(defensa2);

        Defensas defensa3 = new Defensas("William", "Tesillo", 29, true, 8, 3);
        defensas.add(defensa3);

        Defensas defensa4 = new Defensas("Stefan", "Medina", 29, true, 3, 0);
        defensas.add(defensa4);

        Mediocampista mediocentro1 = new Mediocampista("Mateus", "Uribe", 28, true, 12);
        mediocentro.add(mediocentro1);

        Mediocampista mediocentro2 = new Mediocampista("Wilmar", "Barrios", 25, true, 12);
        mediocentro.add(mediocentro2);

        Mediocampista mediocentro3 = new Mediocampista("Juan Guillermo", "Cuadrado", 31, true, 10);
        mediocentro.add(mediocentro3);

        Mediocampista mediocentro4 = new Mediocampista("Juan", "Rodríguez", 28, true, 32);
        mediocentro.add(mediocentro4);

        Delantero delantero1 = new Delantero("Radamel", "Falcao García", 33, true, 15);
        delantero.add(delantero1);

        Delantero delantero2 = new Delantero("Duván", "Zapata", 28, true, 12);
        delantero.add(delantero2);

        // Tecnico (Floren traelo)
        Queiroz.imprimir();
        
        // Portero estrella
        Ospina.imprimir();
        
        // defensas parte piernas
        defensa1.imprimir();
        defensa2.imprimir();
        defensa3.imprimir();
        defensa4.imprimir();
        
        // medios cortahuevos
        mediocentro1.imprimir();
        mediocentro2.imprimir();
        mediocentro3.imprimir();
        mediocentro4.imprimir();

        // Delanteros pichichis
        delantero1.imprimir();
        delantero2.imprimir();


    }

}
