//Diego Hernandez Delgado
//Clave unica: 176262
//Tarea: Pag.37 Ej.3
//Fecha: 07-12-2018
//Clase ejecutable: PruebaTarjeta

import java.util.Scanner;
public class PruebaTarjeta {
	
	public static void main(String[]args){
		
		Scanner lectura = new Scanner (System.in);

		//a) Crea 2 tarjetas:
		Tarjeta t1= new Tarjeta(89987634, "titular", 0, 2018);
		Tarjeta t2= new Tarjeta(89762345, "adicional", 2, 2018);
		
		//b)Activa una tarjeta:
		System.out.println("Ingrese nuevo nip para activar la tarjeta: ");
		if(t1.activaTarjeta(lectura.nextInt())== true)
			System.out.println("¡Tarjeta activada con éxito!\n");
		else
			System.out.println("No se pudo activar la tarjeta.\n");
			
		
		//c)Calcula e imprime comision:
		System.out.println("	Comisión t1: $"+t1.calculaComision()+"\n");
		
		//d)Imprime la informcaion de las dos tarjetas:
		System.out.println("	"+t1.toString()+"\n");
		System.out.println("	"+t2.toString()+"\n");
	
	}
}
