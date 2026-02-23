package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        // Cargo el hashmap para tener las conversiones de cadenas a floats
        Eurocoin.cargarContar();
        ArrayList<Eurocoin> duros = new ArrayList<>();

        for(int i = 0; i<20; i++){
            Eurocoin euro = new Eurocoin();
            System.out.println(euro);
            duros.add(euro);
        }

        Collections.sort(duros);
        System.out.println();
        System.out.println("Ordenado");
        duros.forEach(coin -> System.out.println(coin));

        float total = 0f;
        // Y cuanta pasta hay en las 20 monedas
        for (int i = 0; i < 20; i++) { 
            Eurocoin euro = duros.get(i);
            System.out.println(euro);
            total+= Eurocoin.contar.get(euro.getValor());
        }
        
        System.out.println("El número total de monedas es "+total);
    }

}
