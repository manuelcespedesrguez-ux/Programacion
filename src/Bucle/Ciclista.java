package Bucle;

import java.util.Random;

public class Ciclista {
        
        protected int dorsal; 
		protected String nombre; // Atributo que define el nombre del ciclista
		protected int tiempo=0;  // SEGUNDOS supongo parcial 
		protected int tiempoAcumulado = 0; /* Atributo que define el tiempo acumulado de un ciclista */
        protected int posicionGen = 0;
		
		public Ciclista(int identificador, String nombre) {
			this.dorsal = identificador;
			this.nombre = nombre;
		}
		
        // abstract String imprimirTipo();  //velo, crono y escala
		
		protected int getdorsal() {
		return dorsal;
		}
		
		protected void setdorsal(int dorsal) {
		this.dorsal = dorsal;
		}
		
		protected String getNombre() {
		return nombre;
		}
		
		protected void setNombre(String nombre) {
		this.nombre = nombre;
		}
		
		public int getTiempo() {
            return tiempo;
        }
        public void setTiempo(int tiempo) {
            this.tiempo = tiempo;
        }

        //METODOS PROPIOS
		protected int getPosicionGeneral() {
			return posicionGen;
		}
		
		protected void setPosicionGeneral(int posicionGen) {
			this.posicionGen = posicionGen;
		}

		protected int getTiempoAcumulado() {
			return tiempoAcumulado;
		}
		
		protected void setTiempoAcumulado(int tiempoAcumulado) {
			this.tiempoAcumulado = tiempoAcumulado;
		}
		
		protected void imprimir() {
            System.out.println("Posición General = " + posicionGen); // <--- Añade esta línea
            System.out.println("Identificador = " + dorsal);
            System.out.println("Nombre = " + nombre);
            System.out.println("Tiempo Parcial = " + tiempo);
            System.out.println("Tiempo Acumulado = " + tiempoAcumulado);
        }

        public void correrEtapa(int tiempoMinimo, int tiempoMaximo) {
            Random random = new Random();

            int tiempoDeEstaEtapa = random.nextInt((tiempoMaximo - tiempoMinimo) + 1 ) + tiempoMinimo;
 
            this.tiempo = tiempoDeEstaEtapa;

            this.tiempoAcumulado = tiempoDeEstaEtapa;

            System.out.println("El ciclista " + nombre + ", con el dorsal " + dorsal + ", terminó la etapa con un tiempo de " + tiempoDeEstaEtapa + " segundos");
        }

}
	