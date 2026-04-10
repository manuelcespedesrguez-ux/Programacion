package uno;

public class Resuelto1 {

	//Metodo estatico
	public static char getLetras() {
		return (char) (Math.random() * 26 + 'a');		
	}

	public static void main(String[] args) {
		
		/*
		 * for(int i=0; i<5; i++) { Sytem.out.println(getLetras()); }
		 */
		for(int i=0; i<20; i++) { 
			System.out.println( (char) (Math.random() *26  +   97)  );
	}
		
		
		
		

	}
}
