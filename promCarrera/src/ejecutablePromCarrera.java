import java.util.Scanner;

public class ejecutablePromCarrera{
	public static void main(String [] args){
		
		int i,e;
		double totalCarr, cal, maxSem, minCarr, promCarr, sumaPromSem;
		
		totalCarr=0;
		maxSem=0;
		minCarr=0;
		sumaPromSem=0;
		i=1;
		e=1;
		
		System.out.println("¡Bienvenido al calculador de promedios!" );
		System.out.println("" );
		System.out.println("Ingrese las calificaciones según corresponda." );
		System.out.println("" );
		System.out.println("");
		
		
		for(i=1; i<=8; i++){
			
			double totalSem=0;
			double promSem=0;
			Scanner lectura;
			lectura= new Scanner(System.in);
			
			System.out.println("Semestre "+i);
		
			
			for(e=1; e<=5; e++){
				
				System.out.print("  Cal "+e+": ");	
				cal= lectura.nextDouble();
				
			
				
				if(e==1)
					maxSem=cal;
				else
					if(maxSem<cal)
						maxSem=cal;
				
				if(i==1 & e==1)
					minCarr=cal;
				else
					if(minCarr>cal)
						minCarr=cal;
				
				totalSem=totalSem+cal;
			}
			
			totalCarr+=totalSem;
			promSem=totalSem/(e-1);
			
			
			System.out.println("");
			System.out.println("Promedio semestre"+i+":  "+promSem);
			System.out.println("");
			System.out.println("Calificación más alta del semestre"+i+":  "+maxSem);
			System.out.println("");
			System.out.println("");
		}
		promCarr=totalCarr/((i-1)*(e-1));
		
		System.out.println("");
		System.out.println("");
		System.out.println("Promedio final: "+promCarr);
		System.out.println("");
		System.out.println("Calificación más baja de la carrera: "+minCarr);
		System.out.println("");
		
	}
}