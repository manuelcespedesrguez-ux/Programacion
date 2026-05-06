package Mamiferos;

import java.util.ArrayList;

public class testMamifero {
    
    public static void main(String[] args) {
        
        ArrayList<Mamifero> listaMamiferos = new ArrayList<>();

        Ballena b = new Ballena();
        listaMamiferos.add(b);

        Ormitorrinco o = new Ormitorrinco();
        listaMamiferos.add(o);

        for(Mamifero m : listaMamiferos) {
            m.comer();
            m.amamantarCrias();
            if (m instanceof Ormitorrinco) {
            ((Ormitorrinco) m).ponerHuevos();
            }
            if (m instanceof Murcielago) {
                ((Murcielago)m).volar();
            }
            System.out.println("-----------------------------");
        }
    }

}
