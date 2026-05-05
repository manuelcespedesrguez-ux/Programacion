package Mamiferos;

public class Ballena extends Mamifero {
    
    void amamantarCrias() {
        System.out.println("La ballena amamanta a sus crías con leche materna");
    }

    @Override
    public void comer() {
        super.comer();
        System.out.println("La baallena se alimenta de krill y pequeños peces");
    }

}
