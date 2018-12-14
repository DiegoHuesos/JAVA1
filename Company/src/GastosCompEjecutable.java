//Diego Hernández Delgado
//176262
//09/11/2018
import java.util.Scanner;
import java.io.*;

public class GastosCompEjecutable {

	public static void main (String [] args){
		GastosCompania miCompania;
		
		File miArchivo;
		double monto;
		double sumaGastoDia;
		
		miCompania= new GastosCompania("Ejemplo", "Río Hondo 1");
		
		miArchivo= new File("gastos.txt");
		
		try(Scanner lectura=new Scanner(miArchivo)){
			for(int i=0; i<5; i++){
				for(int j=0; j<3; j++){
					monto=lectura.nextDouble();
					miCompania.altaGasto(i, j, monto);
				}
			}
			lectura.close();
			System.out.println(miCompania.toStringGastos());
			System.out.println("La suma de los gastos del martes es de: "+miCompania.sumaGastos(02));
		}
		
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
}
