package GESTISIMAL;

import java.util.ArrayList;

/**
 *
 * Gestiona el conjunto de artículos del almacén.
 *
 *
 *
 */
public class Almacee {

    // MI ALMACEN es un arraylist de articulos???
    private static ArrayList<Articulor> arraylist = new ArrayList<>();

    /**

          ***** Añadir un articulo
          *****
          ***** @param codigo
          ***** @param descripcion

          ***** @param precioCompra

          ***** @param precioVenta

          ***** @param stock

          ***** @throws Exception

          ****
     */
    public static void annadir(String descripcion, double precioCompra, double precioVenta, int stock) throws Exception {

        Articulor articulo = new Articulor(descripcion, precioCompra, precioVenta, stock);

        if (!(arraylist.contains(articulo))) {
            arraylist.add(articulo);
        } else {
            throw new ArticuloYaExisteExcepti("El árticulo ya existe.");
        }

    }

    /**

          ***** Elimina el artículo del almacén

          *****

          ***** @param codigo Código del artículo a eliminar

          ***** @return true si se ha eliminado. false en otro caso.

          ****
     */
    public boolean baja(int codigo) throws CodigoNoValidoExceptionn {

        Articulor provisional = new Articulor(codigo);

        if (!arraylist.contains(provisional)) {

            throw new CodigoNoValidoExceptionn("El codigo " + codigo + " no existe");

        }

        return arraylist.remove(provisional);

    }

    /**

          ***** set articulo

          *****

          *****

          ***** @throws StockNegativoException

          ***** @throws PrecioVentaNegativoException

          ***** @throws PrecioCompraNegativoException

          ****
     */
    public void set(Articulor articulo, String descripcion, double precioCompra, double precioVenta, int stock)
            throws StockNegativoExceptionn, PrecioCompraNegativoExceptionn, PrecioVentaNegativoExceptioo {

        // busco posidicion objeto, no hace falta
        // int indice = arraylist.indexOf(articulo);
        // este metodo es de aeticulo, no de almacen, cambia el articulo
        // el objeto cambia pero en este punto, el objeto dentro del arraylist ya esta
        // actualizado
        articulo.set(descripcion, precioCompra, precioVenta, stock);

        // no hace fata -> arraylist.set(indice, arraylist.get(indice));
    }

    // para que hace lista.get(indice)? no seria guardar el articulo modificado,
    // revisar
    /**

          ***** Método toString

          ****
     */
    @Override

    public String toString() {

        if (arraylist == null || arraylist.isEmpty()) {

            return "la lista de artículos está vacía.";

        }

        StringBuilder sb = new StringBuilder();

        sb.append("--- listado de artículos ---\n");

        for (int i = 0; i < arraylist.size(); i++) {

            sb.append(String.format("%d. %s\n", (i + 1), arraylist.get(i)));

        }

        sb.append("----------------------------");

        return sb.toString().toLowerCase();

    }

    public ArrayList<Articulor> getArraylist() {

        return arraylist;

    }

    public static void setArraylist(ArrayList<Articulor> arraylist) {

        Almacee.arraylist = arraylist;

    }

    /**

          ***** Método get para obtener el codigo del artículo.

          *****

          ***** @param codigo

          ***** @return

          ***** @throws ArticuloNoExisteException

          ****
     */
    public Articulor get(int codigo) throws ArticuloNoExisteException {

        try {

            return arraylist.get(arraylist.indexOf(new Articulor(codigo))); // Con get lo que se hace es extraer el

            // código del
            // artículo.
        } catch (IndexOutOfBoundsException e) {

            throw new ArticuloNoExisteException("El código del artículo no existe en el almacén.");

            // si el codigo no lo devuelve es que no existe y salta la excepcion // devuelve
            // el indexOf es
        }

    }

    /**

          ***** Método incrementar, que aumenta las unidades de stock de un artículo.

          *****

          ***** @param codigo

          ***** @param cantidad

          ***** @throws CantidadNegativaException

          ***** @throws StockNegativoException

          ****
     */
    public void incrementar(int codigo, int cantidad) throws StockNegativoExceptionn, CantidadNegativaExceptioi {

        Articulor articulo = arraylist.get(arraylist.indexOf(new Articulor(codigo)));

        articulo.incrementaStock(cantidad);

    }

    /**

          ***** Método decrementar, que disminuye las unidades de stock de un
     * artículo.
          *****
          ***** @param codigo
          ***** @param cantidad
          ***** @throws CantidadNegativaException
          ***** @throws StockNegativoException
     */
    public void decrementar(int codigo, int cantidad) throws StockNegativoExceptionn, CantidadNegativaExceptioi {

        Articulor articulo = arraylist.get(arraylist.indexOf(new Articulor(codigo)));

        articulo.decrementaStock(cantidad);

    }

}
