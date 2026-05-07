package Competicion1;

public class PartidoFutbolLigaEsapnhola implements PartidoFutbol {
    
    private String equipoLocal;
    private String equipoVisitante;
    private int golesEquipoLocal;
    private int golesEquipoVisitante;

    public PartidoFutbolLigaEsapnhola(String equipoLocal, String equipoVisitante, int golesEquipoLocal,
        int golesEquipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesEquipoLocal = golesEquipoLocal;
        this.golesEquipoVisitante = golesEquipoVisitante;
    }

    @Override
    public void setGolesEquipoLocal(int numero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setGolesEquipoLocal'");
    }

    @Override
    public void setGolesEquipoVisitante(int numero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setGolesEquipoVisitante'");
    }
    @Override
    public String toString() {
        return "El partido de fútbol de la Liga entre el " + equipoLocal + " y el " + equipoVisitante + " terminó con un resultado de " 
        + golesEquipoLocal + " a " + golesEquipoVisitante;
    }

    

    

}
