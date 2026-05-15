package Geografia;

import java.util.Vector;

public class Departamento {

    String nombre;
    private Vector<Municipio> municipios;

    public Departamento(String nombre, Vector<Municipio> municipios) {
        this.nombre = nombre;
        this.municipios = municipios;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMunicipio(Municipio municipio) {
        municipios.add(municipio);
    }

    public void eliminarMunicipio(String nombre) {
        Municipio municipio;
        for (int i = 0; i < municipios.size(); i++) {

            municipio = (Municipio) municipios.elementAt(i);

            if (nombre.equals(municipio.getNombre())) {
                municipios.remove(municipio);
                break; // No es necesario seguir buscando el municipio
            }
        }
    }

    public void buscarMunicipio(String nombre) {
        Municipio municipio;
            for (int i = 0; i < municipios.size(); i++) { 
                municipio = (Municipio) municipios.elementAt(i);

            if (nombre.equals(municipio.getNombre())) {
                municipio.imprimir(); 
                break;
            }
            if (!nombre.equals(municipio.getNombre())) { 
                System.out.println("Municipio no encontrado.");
            }
        }
	}

    public void buscarMunicipioConPoblacionMayor(int poblacion) {
        Municipio municipio;
        boolean encontroMunicipios = false;
        for (int i = 0; i < municipios.size(); i++) {
            municipio = (Municipio) municipios.elementAt(i);
            if (municipio.getPoblacion() >= poblacion) {
                System.out.println(municipio.getNombre()); 
                encontroMunicipios = true;
            }
        }

        if (!encontroMunicipios) {
            System.out.println("No existen municipios con esta poblacion");
        }
    }

    public int calcularCensoPoblacionDepartamento() {
        Municipio municipio;
        int totalCenso = 0; // El total a calcular se inicializa en cero
        for (int i = 0; i < municipios.size(); i++) {
            municipio = (Municipio) municipios.elementAt(i);
            totalCenso += municipio.getPoblacion();
        }
        return totalCenso; // Devuelve el total calculado
    }

}
