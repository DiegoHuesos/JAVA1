/*
 * DiegoHernández Delgado
 * (176262)
 * Fecha:17/09/2018
 * Programación en JAVA.- Ejercicio 4
 */
import java.util.Scanner;
public class calculaEspacio2 {

	public static void main(String[] args) {
		
		//Declaro clases y variables:
		Scanner lectura;
		Rectangulo oficina;
		Circulo tapete1, tapete2, tapete3;
		double baseOf, alturaOf, areaTapetes, areaDisponible;
		
		//Instancio lectura:
		lectura=new Scanner(System.in);
		
		
		//Crear oficina:
		System.out.println("Dame la BASE de la oficina: ");
		baseOf= lectura.nextDouble();
		System.out.println("Dame la ALTURA de la oficina: ");
		alturaOf= lectura.nextDouble();
		oficina= new Rectangulo(baseOf, alturaOf);
		
		
		//Tapete1
		System.out.println("Dame el RADIO del TAPETE1: ");
		tapete1= new Circulo(lectura.nextDouble());
		
		
		//Tapete2
		System.out.println("Dame el RADIO del TAPETE2: ");
		tapete2= new Circulo(lectura.nextDouble());
		
		
		//Tapete3
		System.out.println("Dame el RADIO del TAPETE3: ");
		tapete3= new Circulo(lectura.nextDouble());
		
		//Calcular area tapetes y espacio disponible:
		areaTapetes=tapete1.calculaArea()+tapete2.calculaArea()+tapete3.calculaArea();
		areaDisponible=oficina.calculaArea()-areaTapetes;
		
		//Imprimir resultado:
		System.out.println("El área disponible es: "+areaDisponible+" m2");
		

	}

}
