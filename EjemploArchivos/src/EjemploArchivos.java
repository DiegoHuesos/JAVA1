/*
 * Diego HD (176262)
 * (14-oct-2018)
 * Ejemplo de lectura de archivos:
 */
import java.io.*;
import java.util.Scanner;
import java.util.Scanner;
public class EjemploArchivos {
	
	//Método para imprimir los datos al final y comprobar:
	public static void imprimeArreglo(double [] arr){
		int l=arr.length;
		for(int i=0; i<l; i++)
			System.out.println("El dato "+i+" es: "+arr[i]);
	}

	//El main:
	public static void main(String[] args) {
		double[] numeros;
		int cantNum;
		File entradaArchivo;
		Scanner lecturaArchivo;
		
		entradaArchivo= new File("datos.txt");
		
		try{
			lecturaArchivo= new Scanner(entradaArchivo);
			cantNum=lecturaArchivo.nextInt();
			numeros=new double[cantNum];
			
			for(int i=0; i<cantNum; i++)
				numeros[i]=lecturaArchivo.nextDouble();
			
			lecturaArchivo.close();
			System.out.println("\nArreglo: ");
			
			EjemploArchivos.imprimeArreglo(numeros);
		}
		
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		

	}

}
