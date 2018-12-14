import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class EjecutableEstacionamiento {

	public static void main(String[] args) {
		
		File archivo = new File("Workbook1.txt");
		Estacionamiento miEstacionamiento = new Estacionamiento();
		Auto unAuto;
		
		try(Scanner lec=new Scanner(archivo)){
			for(int i=0; i<3; i++){
				String marca= lec.next();
				int anio= lec.nextInt();
				String modelo= lec.next();
				String placas= lec.next();
				char tipo= lec.next().charAt(0);
				int piso= lec.nextInt();
				int lugar= lec.nextInt();
				String color= lec.next();
				String nombre= lec.next();
				int edad= lec.nextInt();
				char sexo= lec.next().charAt(0);
				unAuto= new Auto(marca, anio, modelo, placas, tipo, piso, lugar, color, nombre, edad, sexo);	
				miEstacionamiento.altaCarro(piso, lugar, unAuto);
				System.out.println("¿Cuántas camionetas en elpiso 1?"+miEstacionamiento.cuantasCamionetas(1));
			}
				
		}
		catch(Exception e){
			System.out.println("Error debido a: "+e.getMessage());
		}

	}

}
