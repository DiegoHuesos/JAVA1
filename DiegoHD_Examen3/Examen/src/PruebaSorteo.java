//Diego Hernandez Delgado
//Clave Unica: 1762626
//Fecha:16/11/2018
//Examen 3er Parcial

import java.util.Scanner;
import java.io.*;

//CLASE PRUEBA SORTEO:
public class PruebaSorteo {

	public static void main(String[] args) {
		
		//a)Construir objeto Sorteo:
		Sorteo s1=new Sorteo("premioMayor");
		
		//b) Leer datos:
		File archivo= new File("Datos.txt");
		try(Scanner lectura=new Scanner(archivo)){
			for(int i=0; i<12; i++)
				for(int j=0; j<10; j++) {
					s1.getMatriz()[i][j]=lectura.nextInt();
				}
			System.out.println(s1.imprimeMatriz());
			lectura.close();
		}
		catch(Exception e) {
			System.out.println("Error debido a: "+e.getMessage());
		}
		
		//*Actualizar un número de la matriz:
		System.out.println("Mes 1, numGanador '0': "+s1.getMatriz()[0][0]);
		s1.actualizarMatriz(1, 0);
		System.out.println("Mes 1, numGanador '0' (actualizado): "+s1.getMatriz()[0][0]+"\n");
		
		//c)NoSalieronSorteados:
		System.out.println("Los digitos que no salieron premiados en todo el anio fueron:\n"+s1.noHayanSalido().toString()+"\n");
		System.out.println(s1.imprimeMatriz());

	}

}
