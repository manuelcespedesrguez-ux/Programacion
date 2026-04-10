package uno;

import java.util.Scanner;

public class AritmeticaEnteros {

	//varios metodos
	private static int suma(int n1, int n2) {
		//suma
		int s=n1+n2;
		return s;
	}
	
	public static int resta(int a,int b) {
		int res = a-b;
		return res;
	}
	
	public static int producto(int numero1, int numero2) {
		return numero1*numero2;
	}
	
	public static int cocienteE(int n1, int n2) {	
		return n1/n2;
	}
	
	public static int modulo(int n1, int n2) {
		return n1%n2;
	}
	
	public static int pedirNumero() {
		Scanner lector = new Scanner(System.in);
			System.out.println("introduce un número entero: ");
			return lector.nextInt();
		}
	
	
	public static void main(String[] args) {		
		
		int num1,num2;
		Scanner q = new Scanner(System.in);
		String answer;
		
		do {	
			
			//repite todo el ejercicio mientras el bucle no acabe al final
			num1=    pedirNumero();
			num2=    pedirNumero();
		
		//suma
		int suma = suma(num1,num2);
		System.out.println("la suma de ambos numeros es: "+suma);
		
		//resta
		int resta = resta(num1,num2);
		System.out.println("la resta de ambos numeros es: "+resta);
		
		//producto
		int prod= producto(num1,num2);
		System.out.println("el producto de ambos numeros es: "+prod);
		
		//cociente
		int cociente = cocienteE(num1,num2);
		System.out.println("el cociente entero de ambos numeros es: "+cociente);
		
		//resto
		int modulo = modulo(num1,num2);
		System.out.println("el modulo o resto entero de ambos numeros es: "+modulo);
		
		//pregunta
		System.out.println("Repetir ejercicio? (S/N): ");
		answer = q.nextLine();
		
		}while (!answer.equalsIgnoreCase("n"));
		//para que solo se termine el bucle cuando la respuesta es distinta a N/n
		System.out.println("Vale adios");
		q.close();
		
	}


	
 }

