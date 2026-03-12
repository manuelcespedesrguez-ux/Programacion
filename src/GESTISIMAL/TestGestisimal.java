package GESTISIMAL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestGestisimal {

    /**

          *** Se comunica con el usuario (E/S de datos por consola) Comprueba si
     * existe o

          *** no el artículo en el almacén Comprueba que el stock no sea negativo en
     * el

          *** almacén Comprueba que el articulo exista para borrarlo del almacén.

          ***

          *** Test para comprobar la clase Gestisimal.

          ***

          *** @author Rafael Miguel Cruz Álvarez

          *** @author Fco Javier Frías Serrano

          *** @version 1.0

          **
     */
    static Almacee almacen = new Almacee();

    static Scanner entrada = new Scanner(System.in);

    private static final Menuu menu = new Menuu("----MENÚ GESTISIMAL----", new String[]{"Listado", "Alta", "Baja",
        "Modificación", "Entada de mercancía", "Salida de mercancía", "Cargar", "Guardar", "Salir"});

    // cargar coleccion
    public static void cargardessearchivo() {

        File fichero = new File("almacen.vitrasa");

        if (!fichero.exists()) {

            System.out.println("archivo encontrado, procediendo a leer...");

            almacenDePrueba();

        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {

            // 4. Sacamos lo que haya dentro del archivo y lo guardamos en una variable
            // genérica.
            Object objetoleido = ois.readObject();
            if (objetoleido instanceof ArrayList) {

                ArrayList<Articulor> listacargada = (ArrayList<Articulor>) objetoleido;

                Almacee.setArraylist(listacargada);

                System.out.println("coleccion cargada con exito");

            }

        } catch (IOException | ClassNotFoundException e) {

            System.err.println("error al cargar la coleccion " + e.getMessage());

        }

    }

    private static void almacenDePrueba() {

        try {

            // Metemos unos artículos de prueba directamente en el almacén
            Almacee.annadir("tornillo de banco", 10.50, 15.00, 50);

            Almacee.annadir("martillo carpintero", 8.00, 12.50, 30);

            Almacee.annadir("taladro percutor", 45.00, 75.00, 10);

            Almacee.annadir("cinta metrica 5m", 3.20, 6.00, 100);

            System.out.println("almacen de prueba cargado correctamente.");

        } catch (Exception e) {

            System.err.println("error al crear el almacen de prueba: " + e.getMessage());

        }

    }

    public static void guardarColeccionEnAlmacenamiento() {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("almacen.obj"))) {

            ArrayList<Articulor> lista = almacen.getArraylist();

            Collections.sort(lista);

            oos.writeObject(lista);

            System.out.println("Coleccion guardada");

        } catch (IOException e) {

            System.err.println("Error al guardar " + e.getMessage());

            // TODO: handle exception
        }

    }

    public static void main(String[] args) throws Exception {


        cargardessearchivo();

        do {

            switch ((menu.gestionar())) {

                case 1 -> System.out.println(almacen);

                case 2 -> annadir();

                case 3 -> baja();

                case 4 -> modificar();

                case 5 -> entradaAlmacen();

                case 6 -> salidaAlmacen();

                case 7 -> cargardessearchivo();

                case 8 -> guardarColeccionEnAlmacenamiento();

                default -> {
                    System.out.println("Gracias por usar Gestisimal.");
                    return;
                }

            }

        } while (true);

    }

    /**

          *** Método añadir en el que se le pedirá al usuario los datos del artículo.

          **
     */
    @SuppressWarnings("static-access")
    private static void annadir() throws Exception {

        try {

            System.out.println("--AÑADIR ARTÍCULO--");

            String descripcion = Tecladoo.leerCadena("Introduzca la descripción del artículo:");
            double precioCompra = Tecladoo.leerDecimal("Introduzca el precio de compra del artículo:");

            double precioVenta = Tecladoo.leerDecimal("Introduzca el precio de venta del artículo:");

            int stock = Tecladoo.leerEntero("Introduzca el stock del artículo:");

            almacen.annadir(descripcion, precioCompra, precioVenta, stock); // Con almacen.annadir usamos el metodo

            // creado en
            // Almacen.
            System.out.println("Artículo añadido.");

        } catch (Exception e) {

            System.err.println("No se ha podido dar de alta al artículo. " + e.getMessage());// Si hay un error salta la

            entrada.nextLine();

        }

    }

    /**

          *** Método para dar de baja un artículo de la lista.

          ***
     */
    private static void baja() throws CodigoNoValidoExceptionn, NoEsEnteroException {

        try {

            int codigo = Tecladoo.leerEntero("Introduce el códido del artículo a eliminar.");

            if (almacen.baja(codigo)) {
                System.out.println("Artículo eliminado.");
            } else {
                System.err.println(
                        "El artículo no se ha podido eliminar. No existe un artículo con ese código en el almacen.");
            }

        } catch (NoEsEnteroException | CodigoNoValidoExceptionn n) {

            System.err.println(n.getMessage());

        }

    }

    /**

          *** Método para modificar los atributos de un artículo.

          ***

          **
     */
    private static void modificar() throws StockNegativoExceptionn, PrecioCompraNegativoExceptionn,
            PrecioVentaNegativoExceptioo, NoEsEnteroException, NoEsDecimalException {

        try {

            System.out.println("--MODIFICAR ARTÍCULO--");

            int codigo = Tecladoo.leerEntero("Introduce el códido del artículo a modificar.");

            Articulor articulo = almacen.get(codigo);

            System.out.println(articulo);

            String descripcion = Tecladoo.leerCadena("Introduzca la descripción del artículo:");

            double precioCompra = Tecladoo.leerDecimal("Introduzca el precio de compra del artículo:");

            double precioVenta = Tecladoo.leerDecimal("Introduzca el precio de venta del artículo:");

            int stock = Tecladoo.leerEntero("Introduzca el stock del artículo:");

            System.out.println("Articulo modificado");

            almacen.set(articulo, descripcion, precioCompra, precioVenta, stock);

        } catch (ArticuloNoExisteException | PrecioCompraNegativoExceptionn | PrecioVentaNegativoExceptioo
                | StockNegativoExceptionn | NoEsDecimalException | NoEsEnteroException e) {

            System.err.println("No se ha podido modificar el artículo." + e.getMessage());

            entrada.nextLine();

        }

    }

    /**

          ** Método para aumentar el stock de un artículo.

          **/
    private static void entradaAlmacen() throws NoEsEnteroException, StockNegativoExceptionn {

        try {
            System.out.println("--INCREMENTAR STOCK--");
            int codigo = Tecladoo.leerEntero("Introduce el códido del artículo a aumentar.");
            Articulor articulo = almacen.get(codigo);
            System.out.println(articulo);
            int cantidad = Tecladoo.leerEntero("Introduzca el número de artículos a aumentar del stock del almacen.");
            almacen.incrementar(codigo, cantidad);
            System.out.println("Stock aumentado");
        } catch (ArticuloNoExisteException | CantidadNegativaExceptioi e) {
            System.err.println("No se ha podido incrementar el stock del artículo." + e.getMessage() + "\n");
        }
    }

    /**

          ** Método para disminuir el stock de un artículo, este no puede ser
     * negativo.

          **/
    private static void salidaAlmacen() throws NoEsEnteroException, CantidadNegativaExceptioi {

        try {

            System.out.println("--DECREMENTAR STOCK--");
            int codigo = Tecladoo.leerEntero("Introduce el códido del artículo a reducir.");
            Articulor articulo = almacen.get(codigo);
            System.out.println(articulo);
            int cantidad = Tecladoo.leerEntero("Introduzca el número de artículos a eliminar del stock del almacen.");
            almacen.decrementar(codigo, cantidad);
            System.out.println("Stock reducido");
        } catch (ArticuloNoExisteException | StockNegativoExceptionn | CantidadNegativaExceptioi e) {
            System.err.println("No se ha podido decrementar el stock del artículo." + e.getMessage() + "\n");
        }
    }
}
