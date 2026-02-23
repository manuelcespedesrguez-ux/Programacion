package Listas;

import java.util.Arrays;
import java.util.Objects;
import java.util.HashMap;
import java.util.Random;

public class Eurocoin implements Comparable<Eurocoin> {
    
    public static HashMap<String,Float> contar = new HashMap<String,Float>();
    
    public static void cargarContar() {
        contar.put("1 céntimo", 0.01f);
        contar.put("2 céntimos", 0.02f);
        contar.put("5 céntimos", 0.05f);
        contar.put("10 céntimos", 0.1f);
        contar.put("20 céntimos", 0.2f);
        contar.put("50 céntimos", 0.5f);
        contar.put("1 euro", 1f);
        contar.put("2 euros", 2f);
    }

    String[] valores = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos",
        "20 céntimos", "50 céntimos", "1 euro", "2 euros"};

    String[] lados= {"Cara", "Cruz"};
    
    String valor;
    String lado;
    

    Eurocoin(){
        Random r = new Random();
        this.valor = valores[ r.nextInt(8)] ;
        this.lado = lados[r.nextInt(2)];
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    

    public String getLado() {
        return lado;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Su valor es "+valor+" y "+lado+" su lado";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(valores);
        result = prime * result + ((valor == null) ? 0 : valor.hashCode());
        result = prime * result + ((lado == null) ? 0 : lado.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Eurocoin other = (Eurocoin) obj;
        return Objects.equals(lado, other.lado) && Objects.equals(valor, other.valor);
    }
    
    @Override
    public int compareTo(Eurocoin o) {
       int miPosicion = Arrays.asList(valores).indexOf(this.valor);
       int suPosicion = Arrays.asList(valores).indexOf(o.valor);

       if(miPosicion != suPosicion)
            return Integer.compare(miPosicion, suPosicion);
        else // si el valor es igual, comparamos el lado (cara/cruz)
            return this.lado.compareTo(o.getLado());
    }
}
