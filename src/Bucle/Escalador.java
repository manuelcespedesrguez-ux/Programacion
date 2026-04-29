package Bucle;

import java.util.Random;

public class Escalador extends Ciclista{
    
    private double aceleracionPromedio;
	private double gradoRampa;

	public Escalador(int dorsal, String nombre, double aceleraciónPromedio, double gradoRampa) {
		super(dorsal, nombre);
		this.aceleracionPromedio = aceleraciónPromedio;
		this.gradoRampa = gradoRampa;
	}

	protected double getAceleraciónPromedio() {
		return aceleracionPromedio;
	}

	protected void setAceleraciónPromedio(double aceleraciónPromedio) {
		this.aceleracionPromedio = aceleraciónPromedio;
	}

	protected double getGradoRampa() {
		return gradoRampa;
	}

	protected void setGradoRampa(double gradoRampa) {
		this.gradoRampa = gradoRampa;
	}

	protected void imprimir() {
		super.imprimir(); // Invoca el método imprimir de la clase padre
		System.out.println("Aceleración promedio = " + aceleracionPromedio);
		System.out.println("Grado de rampa = " + gradoRampa);
	}

	protected String imprimirTipo() {
		return "Es un escalador";
	}

	/* PODRIAMOS CAMBIAR LA FORMA EN QUE CORRE LA ETAPA Y CALCULA LOS TIEMPOS????? */
	@Override
	public void correrEtapa(int tiempoMinimo, int tiempoMaximo) {
		Random random = new Random();
		int tiempoBase = random.nextInt((tiempoMaximo - tiempoMinimo) + 1) + tiempoMinimo;
		
		// Restamos (5 * aceleracionPromedio) + (4 * gradoRampa)
		int tiempoDeEstaEtapa = tiempoBase - (int)((5 * aceleracionPromedio) + (4 * gradoRampa));
		
		this.tiempo = tiempoDeEstaEtapa;
		this.tiempoAcumulado += tiempoDeEstaEtapa;
		
		System.out.println(nombre + " ha terminado la etapa en: " + tiempoDeEstaEtapa + " segundos (Base: " + tiempoBase + ")");
	}
}
