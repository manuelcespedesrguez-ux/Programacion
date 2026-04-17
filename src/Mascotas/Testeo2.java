package Mascotas;

import java.util.ArrayList;

public class Testeo2 {
    
    public static void main(String[] args) {
        
        ArrayList <Gato> gatos = new ArrayList<Gato>();

        Gato cat1 = new Gato("Misifú", 3, "blanco", 0.25, 0.50);
        gatos.add(cat1);
  

        Gato cat2 = new Gato("Garfield", 5, "naranja", 0.30, 0.60);
        gatos.add(cat2);


        Gato cat3 = new Gato("Salem", 4, "negro", 0.20, 0.40);
        gatos.add(cat3);


        for (Gato gato : gatos) {
            System.out.println(gato);
            System.out.println("El gato tiene un precio de " + gato.calcularPrecio() + "$");
            gato.sonido();
            System.out.println();
        }

    }

}
