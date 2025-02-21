/*
* Analisis
* Descripcion del programa:
* Entradas:
* Salidas: 
* Ejemplo:
*/

package ui;

import java.util.Scanner;

public class Atlas {

	private Scanner escaner;

    // Declaracion de constantes (completar)
    final double COSTO_TRAYECTO_AVION = 250000;
    final double COSTO_TRAYECTO_BUS = 80000;
    final double COSTO_UNA_NOCHE = 150000;

	private Atlas() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{   
        String nombre;
        System.out.println("Bienvenido al programa de viajes EVENTOS ATLAS realizado por los estudiantes de Algoritmos y programacion I de la Universidad ICESI.");
        System.out.println("Cual es tu nombre?");
        nombre = escaner.nextLine();

        System.out.println("Cual es tu edad?");
        edad = escaner.nextLine();

        System.out.println("Digita tu numero de identidad");
        identidad = escaner.nextLine();

        System.out.println("Digita la cuidad de residencia");
        cuidad = escaner.nextLine();
        
        System.out.print("Ingrese cuantas noches desea hospedarse (min 1 noche - max 4 noches) ");
        int noches = scanner.nextInt();

        System.out.print("Ingrese su metodo de transporte preferido para este viaje (1: bus 2: avion)(para la vuelta): ");
        int transporteIda = scanner.nextInt();

        System.out.print("Ingrese su metodo de transporte preferido para este viaje (1: bus 2: avion)(para la ida): ");
        int transporteVuelta = scanner.nextInt();

        double costoHospedaje = calcularcostoHos(noches);
        double costoTransporte = calcularCostoTransporte(transporteIda, transporteVuelta);
        double costoTotal = calcularcosoTotal(costoHospedaje, costoTransporte);

        System.out.println("El costo total del paquete es: $" + costoTotal);

        System.out.println("Bienvenido" + nombre "tu edad: "+ edad "tu numero de indentidad es: " + identidad "y nos hablas desde la ciudad de: "+ ciudad );
    }



	public static void main(String[] args) {
		Atlas mainApp = new Atlas();
		mainApp.run();
	}
    public static double calcularCostoHos(int noches) {
        double costoTotal = COSTO_UNA_NOCHE * noches;
        return costoTotal;
    }

   public static double calcularCostoTransporte(int transporteIda, int transporteVuelta) {
        double TransporeteIda = (ida == 1) ? 80000 : 250000;
        double TransporteVuelta = (vuelta == 1) ? 80000 : 250000; 
        return transporteIda + TransporteVuelta;
    }

	    public static double calcularCostoTotal(double costoHospedaje, double costoTransporte) {
        double costoBase = costoHospedaje + costoTransporte;
        double costoServicio = costoBase * 0.2; 
        return costoBase + costoServicio;
    }

	
}
