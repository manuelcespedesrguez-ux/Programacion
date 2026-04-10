package uno;

public class Propuesto1 {

	static int n1 = 50; //Estática global
	
	public static void main(String[] args) {
     
		int n2 = 30, suma = 0, n3=15;  //n3 No esta inicializada (Ahora si tiene un valor inicial)
		suma = n1 + n2; //debe dar 80
		System.out.println("La suma es: " + suma);
		//Como n3 no tiene valor falla en esa línea
		suma= suma + n3;
		//muestra el nuevo valor
		System.out.println(suma);
	}

}
