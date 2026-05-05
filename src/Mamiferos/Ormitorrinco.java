package Mamiferos;

public class Ormitorrinco extends Mamifero implements Oviparo {
    
    void amamantarCrias() {
        System.out.println("El ornitorrinco amamanta a sus crías con leche materna");
    }

    @Override
    public void comer() {
        super.comer();
        System.out.println("El ornitorrinco roba peras");
    }

    @Override
    public void ponerHuevos() {
        System.out.println("El ornitorrinco pone huevos");
    }

}
