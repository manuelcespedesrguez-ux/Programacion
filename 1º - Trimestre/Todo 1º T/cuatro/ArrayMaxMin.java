package cuatro;

import java.util.Arrays;

public class ArrayMaxMin {

	public static void main(String[] args) {
		
		int[] datos = {1,2,3,3,4,4,5,2};
		int largo = datos.length;
		
		int max=datos[0];
		int min=datos[0];
		
		System.out.println(Arrays.toString(datos));
		
		for(Integer entero : datos) {
			if(entero>max)
				max=entero;
			if(entero<min)
				min=entero;
		}
		
		System.out.println("El máximo valor de los datos es "+max);
		System.out.println("El valor mínimo de los datos es "+min);
	}
	
	public static void encontrarMaxMinConStream(int[] array) {
	
	}
}
