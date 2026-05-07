package Vehiculos;

public abstract class Vehiculo {
    
   protected int velocidad_actual;
   protected int velocidad_maxima;
   
   public Vehiculo(int velocidad_actual, int velocidad_maxima) {
    this.velocidad_actual = velocidad_actual;
    this.velocidad_maxima = velocidad_maxima;
   }

   public void imprimir() {
    System.out.println("La velocidad actual es de "+ velocidad_actual + "km/h");
    System.out.println("La velocidad máxima es de "+ velocidad_maxima + "km/h");
   }

   public abstract void acelerar(int incrementar);

   public abstract void frenar(int decrementar);

}
