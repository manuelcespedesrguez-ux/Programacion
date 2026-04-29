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
    // ... (código existente de super.imprimir())
    System.out.println("Tiempo Acumulado = " + tiempoAcumulado + " segundos");
    // Añadimos el formato hh:mm:ss
    	int h = tiempoAcumulado / 3600;
    	int m = (tiempoAcumulado % 3600) / 60;
    	int s = tiempoAcumulado % 60;
    	System.out.printf("Tiempo total = %02d:%02d:%02d%n", h, m, s);
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
