package uno;

public class Oplogicos {

	public static void main (String[] args) {
		
		int m=2, n=5;
		boolean res;
		
		res =  (m > n) && (m >= n) ; //NO Y NO ----> NO
		System.out.println("la expresion evaluada es: "+res);
		
		res = !(  (m < n) ||  (m != n) ); // !  (SI O SI)
		System.out.println("la expresion evaluada es: "+res); 
	}
}
