package Peaje;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    
    private String nombre;
    private String apellido;
    private String DNI;
    private String fechaNacimiento;
    private List<Vehiculo> vehiculosEnPropiedad;

    StringBuilder sb = new StringBuilder();

    public Persona(String nom, String ap, int DNI, int dia, int mes, int anno){
        this.nombre = nom;
        this.apellido = ap;

        sb.append(DNI);
        sb.append(calcularDNI(DNI));
        this.DNI = sb.toString();

        this.fechaNacimiento = dia+"/"+mes+"/"+anno;
        this.vehiculosEnPropiedad = new ArrayList<>();
    } //PD: no enseñarle este constructo a Angel

    public char calcularDNI(int num){
        int cifras = (int) (Math.log10(Math.abs(num))+1); //log10 +1 para sacar las cifras

        if(cifras == 8){ //si da 8 cifras hago esto, si no, me arriesgo a que esto explote
            char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
            return letras[num%23];
        }
        else{
            return 'Z';
        }
    }

    public void asignarVehiculo(Vehiculo veoculo){
        if(!vehiculosEnPropiedad.contains(veoculo)){
            vehiculosEnPropiedad.add(veoculo);
            System.out.println("Vehiculo con placa"+veoculo.placa+" asignado a " + nombre);
        }
    }

    public void desasignarVehiculo(Vehiculo veoculo){
        if(vehiculosEnPropiedad.isEmpty()){
            System.out.println(nombre+" no tiene vehiculos.");
        }
        else if(vehiculosEnPropiedad.remove(veoculo)){
            System.out.println("Vehiculo con placa "+veoculo.placa+" desasignado para " + nombre);
        }
        else{
            System.out.println("Este vehiculo no pertenece a " + nombre);
        }
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dNI) {
        this.DNI = dNI;
    }
    public String getfechaNacimiento() {
        return fechaNacimiento;
    }
    public void setfechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public List<Vehiculo> getvehiculosEnPropiedad() {
        return vehiculosEnPropiedad;
    }
    public void setvehiculosEnPropiedad(List<Vehiculo> vehiculosEnPropiedad) {
        this.vehiculosEnPropiedad = vehiculosEnPropiedad;
    }

    @Override
    public String toString() {
        return "La persona " + nombre + " " + apellido + " con DNI " + DNI + " y fecha de nacimiento " + fechaNacimiento 
        + " posee los siguientes vehículos:" + vehiculosEnPropiedad + ".";
    }


}
