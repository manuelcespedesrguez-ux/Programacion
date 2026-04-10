package uno;

public class OpAsignación {
	
	public static void main(String[] args) {
		
		int num=5;
		
		num += 8; //num = 13, equivale a num = num +8
		System.out.println("La variable num vale: "+num);
		
		int a=2;
		int b=4;
		
		a*=b;  //a=a*b                 8   <---2*4
		System.out.println("La variable a vale: "+a);
		System.out.println("La variable b vale: "+b);
		
		
		System.out.println("en bucle for----------------------");
		
		int suma=0; 
		int contador=0;
		
		for (int i=contador+1; i<=100; i++) {
			suma=suma+i; //suma=suma+i;
			contador++;
			//System.out.println("Suma parcial: "+suma);
		}
        System.out.println("La suma da: "+suma
        		+ " para los primeros "+contador+ "numeros");
	}

}
