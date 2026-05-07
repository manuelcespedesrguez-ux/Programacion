package Vehiculos;

public interface Motor {
    
    public default void calcularRevolucionesMotor(int fuerza, int radio) {
        int revoluciones = fuerza * radio;
        System.out.println("El motor esta trabajando a " + revoluciones + " revoluciones por minuto.");
    }

}
