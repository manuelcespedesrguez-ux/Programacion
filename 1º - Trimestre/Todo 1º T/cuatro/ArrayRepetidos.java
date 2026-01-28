package cuatro;

public class ArrayRepetidos {

	public static void main(String[] args) {
		
		int [] datos = {1,2,3,3,4,4,5,5,2};
		
		int largo = 0;
		
		System.out.println("La longitud dell array de enteros es: "+datos.length);
		
		for (int i=0; i<largo; i++) {
			for( int j=1+1; j<largo; j++) {
				System.out.println("Comparo i="+i+" con el ejemplo j="+j);
			
				if(datos[i]==datos[j])
					System.out.println(datos[i]+ " está repetido");
				
			}
		}
	}
}
