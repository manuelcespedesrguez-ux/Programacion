package Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Ecologico.cargarProductos();

        // Creo arrays para almacenar los productos del cliente
        ArrayList<String> productosComprados = new ArrayList<>();
        ArrayList<Integer> cantidadesCompradas = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        boolean t = true;

        System.out.println("Le damos la bienvenida a su mercado de confianza");
        while (t == true) {
            System.out.print("Producto: ");
            String producto = sc.nextLine().trim().toLowerCase();

            if (producto.equals("fin")) {
                break;
            }

            if (Ecologico.contar.containsKey(producto)) {
                System.out.print("Cantidad: ");
                int cantidad = Integer.parseInt(sc.nextLine());

                productosComprados.add(producto);
                cantidadesCompradas.add(cantidad);
            } else {
                System.out.println("El producto seleccionado no se encuentra en el catálogo.");
            }
        }

        // Ahora genero el ticket mediante un for
        System.out.printf("\n%-12s %-8s %-10s %s\n", "Producto", "Precio", "Cantidad", "Subtotal");
        System.out.printf("------------------------------------------\n");

        double total = 0;

        for (int i = 0; i < productosComprados.size(); i++) {
            String nombre = productosComprados.get(i);
            int cantidad = cantidadesCompradas.get(i);
            float precioUnidad = Ecologico.contar.get(nombre);
            float subtotal = precioUnidad * cantidad;
            total += subtotal;

           System.out.printf("%-12s %-8.2f %-10d %.2f\n", nombre, precioUnidad, cantidad, subtotal);
        }

        System.out.printf("------------------------------------------\n");
        System.out.printf("Total: %.2f$\n", total);

    }
}