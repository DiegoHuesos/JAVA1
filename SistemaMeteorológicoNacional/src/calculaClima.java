/*
 * Diego Hernández Delgado  (176262)
 *  Fecha: 17(09/2018
 *  Retos Algorítmica.- Ejercicio 7 
 */
import java.util.Scanner;

public class calculaClima {
	public static void main(String[] args){
	
	double precTot;
	int larga, masLarga, mas10Prec, menosTarde;
	Scanner lectura;
	
	precTot=0;
	larga=masLarga=mas10Prec=menosTarde=0;
	lectura= new Scanner(System.in);
	
	
	for(int i=1; i<=31; i++){
		int numPrec, precTarde, precMan;
		int hora, prec, dura;
		numPrec=precTarde=precMan=0;
		
		System.out.println("Dame la hora: ");
		hora= lectura.nextInt();
		System.out.println("Dame la precipitación (m2): ");
		prec= lectura.nextInt();
		System.out.println("Dame la duración (min): ");
		dura= lectura.nextInt();
		
		while(hora>-1 && prec>-1 && dura>-1){
			
			numPrec++;
			precTot++;
			
			// IF-1
			if(hora>=12)
				precTarde++;
			else
				precMan++;
			
			// IF-2
			if(i==1){
				larga=dura;
				masLarga=i;
			}
			else
				if(dura>larga){
					larga=dura;
					masLarga=i;
			}	
		
		
		if(numPrec>=10)
			mas10Prec++;
		
		if(precTarde<precMan)
			menosTarde++;	
		
		System.out.println("Dame la hora: ");
		hora= lectura.nextInt();
		System.out.println("Dame la precipitación (m2): ");
		prec= lectura.nextInt();
		System.out.println("Dame la duración (min): ");
		dura= lectura.nextInt();
		}
	}
	
	System.out.println("La precipitación del mes fue: "+precTot);
	System.out.println("Número de días con menor precipitación en la tarde: "+menosTarde);
	System.out.println("El día con la precipitación más larga: "+masLarga);
	System.out.println("Días con 10 ó más precipitaciones: "+mas10Prec+"\n");
	
		
		
	}


}
