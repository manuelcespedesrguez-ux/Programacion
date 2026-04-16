package Mascotas;

import java.util.ArrayList;

public class Testeo1 {
    
    public static void main(String[] args) {
        
        ArrayList <Perro> canes = new ArrayList<Perro>();

        Grande dog1 = new Grande("Rex", 5, "Marrón", 50.0, true, Grande.razaG.gran_danes);
        canes.add(dog1);

        Mediano dog2 = new Mediano("Luna", 3, "Blanco", 20.0, false, Mediano.razaM.galgo);
        canes.add(dog2);

        Pequenho dog3 = new Pequenho("Roma", 2, "Marrón", 5.0, false, Pequenho.razaP.caniche);
        canes.add(dog3);

        System.out.println("Perros en la lista:");

        for (Perro perro : canes) {
            System.out.println(perro);
            perro.sonido();
            System.out.println();
        }

    }
}
