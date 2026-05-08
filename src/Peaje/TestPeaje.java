package Peaje;

public class TestPeaje {
    
    public static void main(String[] args) {
        
        // Creamos a peajesito
        Peaje peajesito = new Peaje("Peaje de Rande", "Pontevedra");

        // Ahora creamos a hyundai, volskwagen y seat
        Carro hyundai = new Carro("7167 MAG");
        Carro volskwagen = new Carro("7822 NBC");
        Carro seat = new Carro("1904 MCK");

        // Continuamos creando a yamaraha, hondita y sizuka 
        Moto yamarada = new Moto("5794 KKW");
        Moto hondita = new Moto("6435 NPC");
        Moto sizuka = new Moto("8462 MFK");

        // Por último tocan los camionsitos 
        Camion pegado = new Camion("4682 NDC",  6);
        Camion escania = new Camion("2833 KWH", 5);
        Camion mercedes = new Camion("3394", 8);

        System.out.println("\nBienvenidos al peaje de Rande, ubicado en el departamento de Pontevedra. "
        + "Aquí se cobra un peaje a cada vehículo que pasa por él, dependiendo del tipo de vehículo y," 
        + "en el caso de los camiones, del número de ejes que tenga.\n");

        System.out.println("El vehículo con matrícula " + hyundai.placa + ", puede continuar su viaje, ha pagado un peaje de " + peajesito.calcularPeaje(hyundai) + " euros.\n");
        peajesito.anadirVehiculo(hyundai);

        System.out.println("El vehículo con matrícula " + volskwagen.placa + ", puede continuar su viaje, ha pagado un peaje de " + peajesito.calcularPeaje(volskwagen) + " euros.\n");
        peajesito.anadirVehiculo(volskwagen);

        System.out.println("El vehículo con matrícula " + seat.placa + ", puede continuar su viaje, ha pagado un peaje de " + peajesito.calcularPeaje(seat) + " euros.\n");
        peajesito.anadirVehiculo(seat);
        
        System.out.println("El vehículo con matrícula " + yamarada.placa + ", puede continuar su viaje, ha pagado un peaje de " + peajesito.calcularPeaje(yamarada) + " euros.\n");
        peajesito.anadirVehiculo(yamarada);
        
        System.out.println("El vehículo con matrícula " + hondita.placa + ", puede continuar su viaje, ha pagado un peaje de " + peajesito.calcularPeaje(hondita) + " euros.\n");
        peajesito.anadirVehiculo(hondita);
        
        System.out.println("El vehículo con matrícula " + sizuka.placa + ", puede continuar su viaje, ha pagado un peaje de " + peajesito.calcularPeaje(sizuka) + " euros.\n");
        peajesito.anadirVehiculo(sizuka);
        
        System.out.println("El vehículo con matrícula " + pegado.placa + ", puede continuar su viaje, ha pagado un peaje de " + peajesito.calcularPeaje(pegado) + " euros.\n");
        peajesito.anadirVehiculo(pegado);

        System.out.println("El vehículo con matrícula " + escania.placa + ", puede continuar su viaje, ha pagado un peaje de " + peajesito.calcularPeaje(escania) + " euros.\n");
        peajesito.anadirVehiculo(escania);
        
        System.out.println("El vehículo con matrícula " + mercedes.placa + ", puede continuar su viaje, ha pagado un peaje de " + peajesito.calcularPeaje(mercedes) + " euros.\n");
        peajesito.anadirVehiculo(mercedes);        

        peajesito.imprimir();
        
        System.out.println("----------------------------------------------------------------");

        hyundai.imprimir();
        volskwagen.imprimir();
        seat.imprimir();

        System.out.println("-------------------------------------------------------------");

        yamarada.imprimir();
        hondita.imprimir();
        sizuka.imprimir();

        System.out.println("-----------------------------------------------------------------");

        pegado.imprimir();
        escania.imprimir();
        mercedes.imprimir();
    }

}
