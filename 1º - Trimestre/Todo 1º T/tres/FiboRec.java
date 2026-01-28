package tres;

import java.util.Scanner;

public class FiboRec {
	
	public static int Fibonacci(int ene) {
		
		if(ene==0)
			return 0;
		
		else if(ene==2) return 1;
		else return Fibonacci(ene-1)+Fibonacci(ene-2);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Término a obtener de la sucesión de Fibonacci");
		int ene = Integer.parseInt(sc.nextLine());
		System.out.println("El término "+ene+" es "+Fibonacci(ene));
		
		
		sc.close();   
	}

}
