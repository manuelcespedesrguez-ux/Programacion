package ExamenRecProgramacion;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static int sumaDivisores(int n) {

        int suma = 0;

        for(int i = 1; i <= n; i++){
            if (n % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static boolean sonNovios(int entero1, int entero2) {
        
        int suma1 = sumaDivisores(entero1);
        int suma2 = sumaDivisores(entero2);

        boolean novietes = suma1 == suma2 && suma1 == entero1+entero2+1;

        return novietes;
    }

       // if(entero1 == entero2 && suma1 == entero1+entero2+1){
      //      return true;
      //  }else 
       //     return false;
   // }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Introduce el primer número entero: ");
        int entero1 = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce el segundo número entero: ");
        int entero2 = Integer.parseInt(sc1.nextLine());

        System.out.println("El número " + entero1 + " tiene los siguientes divisores: ");

		for (int i = 1; i <= entero1; i++) {
			if (entero1 % i == 0)
				System.out.println(i + ", ");
		}

        System.out.println("El número " + entero2 + " tiene los siguientes divisores");
		
		for (int j = 1; j <= entero2; j++) {
			if (entero2 % j == 0)
				System.out.println(j + ", ");
		}

        if(sonNovios(entero1, entero2)) {
            System.out.println(entero1 + " y " + entero2 + " son números novios");
        }else 
            System.out.println(entero1 + " y " + entero2 + " no son números novios");
    }
}
