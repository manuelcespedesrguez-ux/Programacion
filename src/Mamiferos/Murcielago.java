package Mamiferos;

public class Murcielago extends Mamifero implements Volador{
    
    @Override
    public void amamantarCrias(){
        System.out.println("Los murciélagos amamantan a sus crías colgados");
    }

    @Override
    public void comer(){
        super.comer();
        System.out.println("con colmillos poderosos succionantes");
    }

    public void volar() {
        System.out.println("El murciélago vuela con sus alas");
    }
    
}
