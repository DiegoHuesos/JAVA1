/* Diego Hernández Delgado
 * (176262)
 * FuncionesEjecutable
 */
import java.util.Scanner;

public class FuncionesEjecutable {

	public static void main(String[] args) {
	Scanner lectura;
	double n1, n2, resul;
	String resulSerie;
	int n;
	
	lectura=new Scanner (System.in);
	/*
	System.out.println("Dame el primer numero:");	
	n1= lectura.nextDouble();
	System.out.println("Dame el segundo numero:");	
	n2= lectura.nextDouble();
	resul= FuncionesEstaticas.sumaNumeros(n1,n2);
	System.out.println("Resultado: "+resul+"\n");	
	
	System.out.println("Dame la cantidad de numeros de la serie ascendente:");	
	n=lectura.nextInt();
	resulSerie= FuncionesEstaticas.generaSerieAscendente(n);
	System.out.println("Serie ascendente de los primeros "+n+" numeros: ");
	System.out.println(resulSerie);*/
	
	System.out.println("Dame la cantidad de numeros de la serie descendente:");	
	n=lectura.nextInt();
	resulSerie= FuncionesEstaticas.generaSerieDescendente(n);
	System.out.println("Serie dscendente de los primeros "+n+" numeros: ");
	System.out.println(resulSerie);
	}
	

}
