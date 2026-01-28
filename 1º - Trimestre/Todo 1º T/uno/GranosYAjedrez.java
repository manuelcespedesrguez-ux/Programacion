package uno;

import java.lang.Math;

public class GranosYAjedrez {

	public static void main(String[] args) {
		
		int cuadro=64;
		long suma=0;
		double x=2;
		
		//granos en cada cuadro = 2^casilla-1; x = 2^n-1 ; n-1 = i
		for (int i=0; i<=cuadro-1; i++) {
			x=Math.pow(2, i); //solución
			suma+=x;
		}
		
		/*for(int i=0; i<=cuadro-1; i++) {
		  
		 for(int j=0; j<i; j++){
		     x*=2; 
	}

}*/
		
		System.out.println("El total de granos que hay en un tablero es: "+suma);
		
	} 
	
}
	
