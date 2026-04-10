package uno;

public class EjemploBucle {

	public static void main(String[] args) throws InterruptedException {
		
		//Contar numeros de 1 a 10
		
		for(int i=1; i<=10; i++) {
			System.out.println("repeticion => "+i);
		    Thread.sleep(1250);
		}
		
		//Cuenta descendente
		
		for (int j=100; j>=0; j--) {
			System.out.println("Descendiendo hacia zero =>"+j);
			Thread.sleep(1000);
		}
	}
	
	
}
