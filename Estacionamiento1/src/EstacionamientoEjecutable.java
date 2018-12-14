// Clase para probar el estacionamiento de varios pisos

import java.util.Scanner;

public class EstacionamientoEjecutable {

	public static void main(String[] args) {
		Estacionamiento miEstacionamiento;
		Scanner lectura= new Scanner(System.in);
		String nombre, direccion;
		int horaEnt, horaSal, minEnt, minSal;
		boolean resp;
		double cobro= 0.0;
		
		miEstacionamiento = new Estacionamiento("Guarda mi Auto", "Calle 1 no 123");
				
		resp = miEstacionamiento.altaAuto("uno", 'S', 8, 20);
		if (resp)
			System.out.println("Auto estacionado");
		else
			System.out.println("No hay lugar");
		
		resp = miEstacionamiento.altaAuto("dos", 'C', 10, 20);
		if (resp)
			System.out.println("Auto estacionado");
		else
			System.out.println("No hay lugar");
		
		resp = miEstacionamiento.altaAuto("tres", 'S', 8, 40);
		if (resp)
			System.out.println("Auto estacionado");
		else
			System.out.println("No hay lugar");
		
		resp = miEstacionamiento.altaAuto("cuatro", 'C', 18, 20);
		if (resp)
			System.out.println("Auto estacionado");
		else
			System.out.println("No hay lugar");
		
		resp = miEstacionamiento.altaAuto("cinco", 'S', 12, 20);
		if (resp)
			System.out.println("Auto estacionado");
		else
			System.out.println("No hay lugar");
		
		resp = miEstacionamiento.altaAuto("seis", 'S', 8,50);
		if (resp)
			System.out.println("Auto estacionado");
		else
			System.out.println("No hay lugar");
		
		resp = miEstacionamiento.altaAuto("siete", 'S', 10, 33);
		if (resp)
			System.out.println("Auto estacionado");
		else
			System.out.println("No hay lugar");
		
		resp = miEstacionamiento.altaAuto("ocho", 'S', 8, 00);
		if (resp)
			System.out.println("Auto estacionado");
		else
			System.out.println("No hay lugar");
		
		resp = miEstacionamiento.altaAuto("nueve", 'S', 13, 2);
		if (resp)
			System.out.println("Auto estacionado");
		else
			System.out.println("No hay lugar");
		
		resp = miEstacionamiento.altaAuto("diez", 'S', 12, 20);
		if (resp)
			System.out.println("Auto estacionado");
		else
			System.out.println("No hay lugar");
		
		resp = miEstacionamiento.altaAuto("once", 'S', 8, 10);
		if (resp)
			System.out.println("Auto estacionado");
		else
			System.out.println("No hay lugar");
		resp = miEstacionamiento.altaAuto("doce", 'C', 18, 20);
		if (resp)
			System.out.println("Auto estacionado");
		else
			System.out.println("No hay lugar");
		
		resp = miEstacionamiento.altaAuto("ETF", 'S', 12,20);
		if (resp)
			System.out.println("Auto estacionado");
		else
			System.out.println("No hay lugar");
		
		System.out.println(miEstacionamiento.toString());
		cobro = miEstacionamiento.saleAuto("cinco", 10, 50);
		System.out.println("Total a pagar: " +cobro);
		System.out.println(miEstacionamiento.toString());
		
		resp = miEstacionamiento.altaAuto("ZZZ", 'S', 3, 00);
		if (resp)
			System.out.println("Auto estacionado");
		else
			System.out.println("No hay lugar");
		cobro = miEstacionamiento.saleAuto("", 10, 50);
		System.out.println(cobro);
		System.out.println(miEstacionamiento.toString());
		
	}

}
