package Dispositivos;

public class Dispositivoinformatico {
    
    String marca = "Acer";

    Dispositivoinformatico(){
        System.out.println("MArca = " +marca);
    }

    @Override
    public String toString() {
        return "El dispositivo informático de la "+ marca;
    }

}
