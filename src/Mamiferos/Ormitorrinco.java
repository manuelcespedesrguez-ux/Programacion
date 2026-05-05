package Mamiferos;

public class Ormitorrinco extends Mamifero {
    
    void amamantarCrias() {
        System.out.println("El ornitorrinco amamanta a sus crías con leche materna");
    }

    @Override
    public void comer() {
        super.comer();
        System.out.println("El ornitorrinco roba peras");
    }

}
