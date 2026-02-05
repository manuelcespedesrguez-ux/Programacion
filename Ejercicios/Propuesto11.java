package Ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Propuesto11 {

    public static void main(String[] args) {

        HashMap<String, String> registro = new HashMap<String, String>();
        String user = "";
        String pass = "";
        Scanner sc = new Scanner(System.in);

        registro.put("Pepe Vazquez", "abcd");
        registro.put("Maria Lopez", "1234");
        registro.put("Juan Perez", "qwer");
        registro.put("Ana Gomez", "zxcv");
        registro.put("Luis Martinez", "5048");
        registro.put("Sofia Rodriguez", "8441");

        int veces = 0;
        boolean entra = false;
        do {
            System.out.println("Nombre de usuario: ");
            user = sc.nextLine().trim();

            System.out.println("Contraseña: ");
            pass = sc.nextLine().trim();

            if (registro.containsKey(user.trim()) && pass.equals(registro.get(user.trim()))) {
                System.out.println("Acceso concedido al Área 51.");
                entra = true;
            } else if (!registro.containsKey(user))  
                System.out.println("Usuario incorrecto.");
            else {
                System.out.println("Acceso denegado.");
                veces++;
                System.out.println("Te quedan " + (3 - veces) + " intentos.");
            }

        } while (veces < 3 && !entra);

        if (!entra) {
            System.err.println("Demasiados intentos fallidos. Acceso denegado.");

        }
    }
}
