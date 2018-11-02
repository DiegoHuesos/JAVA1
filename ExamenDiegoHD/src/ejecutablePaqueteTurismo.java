/*
 * Diego Hern�ndez Delgado
 * (176262)
 * Examen 
 */
import java.util.Scanner;

public class ejecutablePaqueteTurismo {

	public static void main(String[] args) {
		//Declaro clase y atributos:
		Scanner lectura;
		PaqueteTurismo paquete1, paquete2;
		double precio1, precio2;
		
		
		lectura=new Scanner(System.in);
		
		//Instancio objetos:
		paquete1= new PaqueteTurismo(2,300,'E',400); 
		paquete2= new PaqueteTurismo(2,300,'E',400);
		
		

		//Comparo precio para imprimir:
		if(paquete1.equals(paquete2))
			System.out.println("Los dos paquetes son el mismo!\n");
			else
				System.out.println("Los paquetes son diferentes!\n");
			
		
		precio1= paquete1.calculaPrecio("alta");
		precio2= paquete2.calculaPrecio("alta");
		
		if(precio1>precio2) {
			System.out.println("El paquete 1 es mas caro!\n");
			System.out.println(paquete1.toString());
			System.out.println("Precio1:"+precio1+"\n");	
		}
			else {
				System.out.println("El paquete 2 es m�s caro!\n");
				System.out.println(paquete2.toString());
				System.out.println("Precio2:"+precio2+"\n");
			}
		
		//Si el precio es mayor a 5000, cambio la duracion:
		
			//Opción A):
			/* if(precio1>5000) { 
				paquete1.setDuracion(5);
				System.out.println("Nuevo precio paquete1: "+precio1+"\n");
			}*/
		
		//Opción B):
		
		int dura;
		dura=paquete1.getDuracion();
		
		while(precio1>5000){
			dura=dura-1;
			paquete1.setDuracion(dura);
			precio1=paquete1.calculaPrecio("alta");
		}
		
		//Opción C):
		
			/*
			while(precio1>5000){
				System.out.print("Dame una duración menor:" );
				paquete1.setDuracion(lectura.nextInt());
				precio1=paquete1.calculaPrecio("alta");
			}
			*/
			
				
				
					
			
		
	

	}

}
