package GESTISIMAL;

import java.util.ArrayList;

//Gestiona el conjunto de artículos del almacén.

public class Almacee {
  
	//MI ALMACEN es un arraylist de articulos??? 
        @SuppressWarnings("Convert2Diamond")
	private final ArrayList<Articulor> arraylist = new ArrayList<Articulor>();

  /**
   * Añadir un articulo
   * @param codigo
   * @param descripcion
   * @param precioCompra
   * @param precioVenta
   * @param stock
   * @throws Exception
   */
  public void annadir(String descripcion, double precioCompra, double precioVenta, int stock) throws Exception {
    Articulor articulo = new Articulor(descripcion, precioCompra, precioVenta, stock);
    if (!(arraylist.contains(articulo)))
      arraylist.add(articulo); //uso metodo ADD
    else
      throw new ArticuloYaExisteExcepti("El árticulo ya existe.");
  }
  /**
   * Elimina el artículo del almacén
   * 
   * @param codigo
   *          Código del artículo a eliminar
   * @return true si se ha eliminado. false en otro caso.
   */
  public boolean baja(int codigo) throws CodigoNoValidoExceptionn {
    Articulor provisional = new Articulor(codigo);
        if(!arraylist.contains(provisional)){
            throw new CodigoNoValidoExceptionn("El código "+codigo+" no existe en el almacen");
        }
    return arraylist.remove(new Articulor(codigo)); // Si el código que introducimos en el test es igual al código del
                                                 // artículo que hay en la lista se realiza el borrado.
  }

  /**
   * SET articulo
   * @throws StockNegativoException
   * @throws PrecioVentaNegativoException
   * @throws PrecioCompraNegativoException
   */
  //para setear un articulo, le paso el propio articulo
  
  public void set(Articulor articulo, String descripcion, double precioCompra, double precioVenta, int stock)
      throws StockNegativoExceptionn, PrecioCompraNegativoExceptionn, PrecioVentaNegativoExceptioo {
    int indice = arraylist.indexOf(articulo);
    articulo.set(descripcion, precioCompra, precioVenta, stock);
    arraylist.set(indice, arraylist.get(indice));
  }

  /**
   * Método toString //es un poco FLOJO
   */
  @Override
  public String toString() {
    StringBuilder listado = new StringBuilder("--- Listado del almacen ---\n");
    for(Articulor a : arraylist){
        listado.append(a.toString()).append("\n");
    }
    return listado.toString();
  }

  /**
   * Método get para obtener el codigo del artículo. que peternece al almacen
   * @param codigo
   * @return
   * @throws ArticuloNoExisteException
   */
  public Articulor get(int codigo) throws ArticuloNoExisteException {
    try {
      return arraylist.get(arraylist.indexOf(new Articulor(codigo))); // Con get lo que se hace es extraer el código del
                                                                 // artículo.
    } catch (IndexOutOfBoundsException e) {
      throw new ArticuloNoExisteException("El código del artículo no existe en el almacén.");// Si el código no lo
                                                                                             // devuelve el indexOf es
                                                                                             // que no existe y salta la
                                                                                             // excepción.
    }
  }
  /**
   * Método incrementar, que aumenta las unidades de stock de un artículo.
   * 
   * @param codigo
   * @param cantidad
   * @throws CantidadNegativaException
   * @throws StockNegativoException
   */
  public void incrementar(int codigo, int cantidad1) throws StockNegativoExceptionn, CantidadNegativaExceptioi {
    Articulor articulo = arraylist.get(arraylist.indexOf(new Articulor(codigo))); 
    articulo.incrementaStock(cantidad1);
  }

  /**
   * Método decrementar, que disminuye las unidades de stock de un artículo.
   * 
   * @param codigo
   * @param cantidad
   * @throws CantidadNegativaException
   * @throws StockNegativoException
   */
  public void decrementar(int codigo, int cantidad) throws StockNegativoExceptionn, CantidadNegativaExceptioi {
    Articulor articulo = arraylist.get(arraylist.indexOf(new Articulor(codigo)));
    articulo.decrementaStock(cantidad);
    
  }
}