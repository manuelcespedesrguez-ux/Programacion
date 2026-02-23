package Listas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio15 {
    
    public static void main(String[] args) {

        Ecologico.cargarProductos();

        // Creo arrays para almacenar los productos del cliente
        HashMap<String, Integer> totalcesta = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        boolean t = true;

        System.out.println("Le damos la bienvenida a su mercado de confianza");
        while (t == true) {
            System.out.print("Producto: ");
            String producto = sc.nextLine().trim().toLowerCase();

            if (producto.equals("fin")) {
                break;
            }

            if(Ecologico.contar.containsKey(producto)){
                System.out.print("Cantidad: ");
                int cantidad = Integer.parseInt(sc.nextLine());

                //lo guarda
                totalcesta.put(producto, totalcesta.getOrDefault(producto, 0)+cantidad);
            }
            else{
                System.out.println("El producto seleccionado no se encuentra disponible");
            }
        }

        // AHora añadimos el descuento
        System.out.println("Introduzca código de descuento (INTRO si no tienes ninguno): ");
        String codigo = sc.nextLine();
        float descuento = 0;

        // Ahora genero el ticket mediante un for
        System.out.printf("\n%-12s %-8s %-10s %s\n", "Producto", "Precio", "Cantidad", "Subtotal");
        System.out.printf("------------------------------------------\n");

        float total = 0;

        for (String nombre : totalcesta.keySet()) {
            float precioUnidad = Ecologico.contar.get(nombre);
            int cantidad = totalcesta.get(nombre);
            float subtotal = precioUnidad * cantidad;
            total += subtotal;

           System.out.printf("%-12s %-8.2f %-10d %.2f\n", nombre, precioUnidad, cantidad, subtotal);
        }

        System.out.printf("------------------------------------------\n");
        if (codigo.equals("ECODTO")) {
            descuento = total * 0.1f;
        }
        System.out.println("Desuento: "+descuento);

        System.out.printf("------------------------------------------\n");
        System.out.printf("Total: %.2f$\n", total - descuento);

    }
}




