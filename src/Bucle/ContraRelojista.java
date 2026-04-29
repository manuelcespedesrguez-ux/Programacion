package Bucle;

import java.util.Random;

public class ContraRelojista extends Ciclista {
    
    // Atributo que define la velocidad máxima de un contrarrelojista
	private double velocidadMaxima;
	
	public ContraRelojista(int dorsal, String nombre, double velocidadMaxima) {
		super(dorsal, nombre);
		this.velocidadMaxima = velocidadMaxima;
	}
	
	protected double getVelocidadMáxima() {
	return velocidadMaxima;
	}
	
	protected void setVelocidadMáxima(double velocidadMaxima) {
	this.velocidadMaxima = velocidadMaxima;
	}
	
	protected void imprimir() {
		super.imprimir(); // Invoca el método imprimir de la clase padre
		System.out.println("Velocidad MAXIMA = " + 	velocidadMaxima);
	}
	
	protected String imprimirTipo() {
		return "Es un constraRelojista";
	}
	
	/* PODRIAMOS CAMBIAR LA FORMA EN QUE CORRE LA ETAPA Y CALCULA LOS TIEMPOS????? */
	@Override
	public void correrEtapa(int tiempoMinimo, int tiempoMaximo) {
		Random random = new Random();
		int tiempoBase = random.nextInt((tiempoMaximo - tiempoMinimo) + 1) + tiempoMinimo;
		
		// Restamos 10 * velocidadMaxima
		int tiempoDeEstaEtapa = tiempoBase - (int)(10 * velocidadMaxima);
		
		this.tiempo = tiempoDeEstaEtapa;
		this.tiempoAcumulado += tiempoDeEstaEtapa;
		
		System.out.println(nombre + " ha terminado la etapa en: " + tiempoDeEstaEtapa + " segundos (Base: " + tiempoBase + ")");
	}
	

}
