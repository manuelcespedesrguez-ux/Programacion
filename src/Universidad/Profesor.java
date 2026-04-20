package Universidad;

public class Profesor extends Persona {
    
    String departamento;
    String categoria;

    Profesor (String nombre, String direccion, String departamento, String categoria) {
        super(nombre, direccion);
        this.departamento = departamento;
        this.categoria = categoria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "El profesor " + nombre + ", que pertence al departamento de " + departamento + ", vive en " + direccion
                + " y pertenece a la categoría de " + categoria;
    }   

}
