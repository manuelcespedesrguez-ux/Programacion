package tres;

import java.util.Scanner;

public class Propuesto8 {
	
	public static void main(String[] args) {
		
		int n=0;
		String res=" ";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número  entre 1 y 3999: ");
		n = Integer.parseInt(sc.nextLine());
		
		while(n > 0) {
			while(n >= 1000) {
				res+="M";
				n-=1000;
			}
			if(n >= 900) {
				res+="CM";
				n-=900;
			}
			while(n >= 500) {
				res+="D";
				n-=500;
			}
			if(n >= 400) {
				res+="CD";
				n-=400;
			}
			while(n >= 100) {
				res+="C";
				n-=100;
			}
			if(n >= 90) {
				res+="XC";
				n-=90;
			}
			while(n >= 50) {
				res+="L";
				n-=50;
			}
			if(n >=40) {
				res+="XL";
				n-=40;
			}
			while(n >= 10) {
				res+="X";
				n-=10;		
			}
			if(n >= 9) {
				res+="IX";
				n-=9;
			}
			while(n >= 5) {
				res+="V";
				n-=5;
			}
			if(n >= 4) {
				res+="IV";
				n-=4;
			}
			while(n >= 1) {
				res+="I";
				n-=1;
			}
		}
		
		System.out.println("El número introducido convertido a número romano es: "+res);
		
		sc.close();
	}

}
