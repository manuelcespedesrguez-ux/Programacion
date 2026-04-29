package Bucle;

import java.util.Random;

public class Velocista extends Ciclista {
    
    private double potenciaPromedio; /* Atributo que define la potencia promedio de un velocista */
	private double velocidadPromedio; /* Atributo que define la velocidad promedio de un velocista */

	public Velocista(int dorsal, String nombre, double potenciaPromedio, double velocidadPromedio) {
		super(dorsal, nombre);
		this.potenciaPromedio = potenciaPromedio;
		this.velocidadPromedio = velocidadPromedio;
	}

	protected double getPotenciaPromedio() {
		return potenciaPromedio;
	}

	protected void setPotenciaPromedio(double potenciaPromedio) {
		this.potenciaPromedio = potenciaPromedio;
	}

	protected double getvelocidadPromedio() {
		return velocidadPromedio;
	}

	protected void setVelocidadPromedio(double velocidadPromedio) {
		this.velocidadPromedio = velocidadPromedio;
	}

	@Override
	protected void imprimir() {
		super.imprimir(); // Invoca al método imprimir de la clase padre
		System.out.println("Potencia promedio = " + potenciaPromedio);
		System.out.println("Velocidad promedio = " + velocidadPromedio);
	}

	protected String imprimirTipo() {
		return "Es un velocista";
	}
	
	/* PODRIAMOS CAMBIAR LA FORMA EN QUE CORRE LA ETAPA Y CALCULA LOS TIEMPOS?????*/
    @Override
	public void correrEtapa(int tiempoMinino, int tiempoMaximo) {
		Random rand = new Random();
		int tiempoBase = rand.nextInt((tiempoMaximo - tiempoMinino) + 1) + tiempoMinino;

		// Restamos 7 * potenciaPromedio
		int tiempoEtapa = tiempoBase - (int)(7 * potenciaPromedio);

		this.tiempo = tiempoEtapa;
		this.tiempoAcumulado += tiempoEtapa;

		System.out.println(nombre + " ha terminado la etapa en " + tiempoEtapa + " segundos (Base: " + tiempoBase + ")");
	}

}