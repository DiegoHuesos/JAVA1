//Diego Hernández Delgado
//Clave única: 176262
//Fecha: 14/11/2018
//Manejador Matrices Genérico

import java.util.Scanner;

public class ManejMatricesGenerico {
	
	public static <T> String matrizToString(T[][]matriz){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz[0].length; j++)
				sb.append(matriz[i][j]+"\t");
			sb.append("\n");
		}
		return sb.toString();
	}

//MAIN-CLASS:
	public static void main(String[]args){
		Integer[][] m1= { {1,2,3} , {4,5,6} };
		System.out.println(ManejMatricesGenerico.matrizToString(m1));
	}
}