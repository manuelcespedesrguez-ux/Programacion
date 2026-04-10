package uno;

public class OperadorTernario {

	public static void main(String[]args) {
		
		//condición ? valor_si_verdadero : valor_si_falso;
		
		int edad = 20;
		String mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
		System.out.println(mensaje); //Eres mayor de edad
		
		String nombre = "Manuel";
		String nombreValido= (nombre != null) ? nombre : "Invitado";
		System.out.println("Holaa " + nombreValido); //Hola Invitado
		
		int a= 15;
		int b = 20;
		int menor = (a<b) ? a: b;
		System.out.println("El valor menor es: " + menor); // El valor menor es: 15
		
		int n= 4;
		a = 5 * a +3;
		System.out.println("Valor de n: " + n); //23
		
		int m= 4;
		m = 5 * (m + 3);
		System.out.println("Valor de m: " + m); //35		
				
	}
}
