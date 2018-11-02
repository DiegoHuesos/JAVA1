/* Diego Hernández Delgado
 * (176262)
 * Retos Programación en JAVA
 * Ejercicio1.-LEGO
 * Fecha:08/10/2018
 *
 *Ejecutable: PlantaLegoMex
 */

public class PlantaLegoMex {
	
	public static void main (String[]args){
	Maquina maq1, maq2;                         
	String enc1, enc2;                     
	double[] en1, en2; 
	Encendido e1, e2;
	double costoTotal, tiempoTotal, costoTotal1, tiempoTotal1;
	
	//Instanciación de las máquinas:
	maq1=new Maquina("37-2018-AC");
	maq2=new Maquina("37-2018-AB");
	
	//Encendido de las máquinas con función "encender1" que regresa un String:
	System.out.println("__________CON FUNCIÓN 1__________");
	enc1=maq1.encender1('B', 75524, 4, 1.50);
	System.out.println(enc1);
	enc2=maq2.encender1('C', 3256, 5, 1.50);
	System.out.println(enc2);
	
	//Encendido de las máquinas con función "encender2" que regresa un arreglo:
	System.out.println("__________CON FUNCIÓN 2__________");
	en1=maq1.encender2('B', 75524, 4, 1.50);
	System.out.println("Encendido 1");
	System.out.println("  Tiempo: "+en1[0]+"min");
	System.out.println("  Costo: $"+en1[1]+"\n");
	
	en2=maq2.encender2('C', 3256, 5, 1.50);
	System.out.println("Encendido 2");
	System.out.println("  Tiempo: "+en2[0]+"min");
	System.out.println("  Costo: $"+en2[1]+"\n");

	//Resultado total del pedido:
	tiempoTotal1=en1[0]+en2[0];
	costoTotal1=en1[1]+en2[1];
	System.out.println("\nCosto total del pedido: "+costoTotal1);
	System.out.println("\nTiempo total entre las dos máquinas: "+tiempoTotal1+"\n\n");
		
		
	//Encendido de las máquinas con función "encender3" que regresa un objeto:
	System.out.println("__________CON FUNCIÓN 3__________");
	e1= maq1.encender3('B', 75524, 4, 1.50);
	System.out.println(e1.toString());
	
	e2=maq2.encender3('C', 3256, 5, 1.50);
	System.out.println(e2.toString());
		
	//Resultado total del pedido:
	costoTotal=e1.costo+e2.costo;
	tiempoTotal=e1.tiempo+e2.tiempo;
	System.out.println("\nCosto total del pedido: "+costoTotal);
	System.out.println("\nTiempo total entre las dos máquinas: "+tiempoTotal+"\n\n");	
	}
}
