package uno;

public class Intercambio {
	
    // TAMBIÉN LLAMADA técnica de swap
	
	public static void main(String[] args) {
		int a= 5, b= 8;
		int tmp;
		
		System.out.println("ANTES");
		System.out.println("El valor de a ahora es: "+a);
	 	
		tmp=a;                      // tmp  <--- a
		a=b;                        // a <--- b
		b=tmp;                      // b <--- tmp
		
		System.out.println("Despues");
		System.out.println("El valor de a ahora es: "+a);
		System.out.println("El valor de b ahora es: "+b);

	}

}
