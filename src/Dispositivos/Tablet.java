package Dispositivos;

public class Tablet extends Dispositivoinformatico {
    
    Tablet(String marca) {
        System.out.println("Marca = " + marca);
    }

    @Override
    public String toString() {
        return "La tableta de la " + marca;
    }

}
