//Diego Hernandez Delgado
//Clave unica: 176262
//Fecha: 07-11-2018
//Matrices

import java.util.Scanner;
public class ManejadorMatrices {

	public static void leeMatriz(double [][] matriz){
		Scanner lectura= new Scanner(System.in);
		int y, x;
		System.out.println("Dame los datos de las matriz: ");
		y=matriz.length;
		x=matriz[0].length;
		
		for(int i=0; i<y; i++)
			for(int j=0; j<x; j++)
				matriz[i][j]=lectura.nextDouble();
	}
	
	public static void escribeMatriz(double [][] matriz){
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz[0].length; j++)
				System.out.print(matriz[i][j]+"	");
			System.out.println("");
		}		
	}
	
	public static String matrizToString(double [][] matriz){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz[0].length; j++)
				sb.append(matriz[i][j]+" ");
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public static double sumaColumna(double[][] matriz, int numColumna){
		double suma = 0;
		for(int i=0; i<matriz.length; i++)
			suma+=matriz[i][numColumna];
		return suma;
	}
	
	public static double sumaRenglon(double[][] matriz, int numRenglon){
		double suma = 0;
		for(int i=0; i<matriz[0].length; i++)
			suma+= matriz[numRenglon][i];
		return suma;
	}
	
	public static double sumaTodaLaMatriz(double [][] matriz){
		double suma = 0;
		for(int i=0; i < matriz.length; i++)
			for(int j=0; j < matriz[0].length; j++)
				suma+= matriz[i][j];
		return suma;
	}
	
	public static double sumaDiagonalPrincipal(double [][] matriz){
		double suma=0;
		
		int max;
		if(matriz.length<= matriz[0].length)
			max=matriz.length;
		else
			max=matriz[0].length;
		
		for(int i=0; i < max; i++){
			suma+=matriz[i][i];
		}
		return suma;
	}
	
	public static double sumaDiagonalSecundaria(double[][] matriz){
		double suma=0;
		int max;
		if(matriz.length<= matriz[0].length)
			max=matriz.length;
		else
			max=matriz[0].length;
		
		for(int i=0, e=matriz[0].length-1 ; i<max ; i++, e--){
			suma+=matriz[i][e];
		}
		return suma;
	}
	
	public static double mayorColumna(double[][] matriz, int numColumna){
		double mayor=0;
		for(int i=0; i<matriz.length; i++)
			if(i==0)
				mayor= matriz[i][numColumna];
			else
				if(mayor < matriz[i][numColumna])
					mayor= matriz[i][numColumna];
		return mayor;
	}
	public static double valorMayorFila(double[][] matriz, int numFila){
		double mayor=0;
		for(int i=0; i<matriz[0].length; i++)
			if(i==0)
				mayor= matriz[numFila][i];
			else
				if(mayor < matriz[numFila][i])
					mayor= matriz[numFila][i];
		return mayor;
	}
	
	public static int posMayorFila(double[][] matriz, int numFila){
		int mayor=0;
		for(int i=0; i<matriz[0].length; i++)
			if(i==0)
				mayor= i;
			else
				if(mayor < matriz[numFila][i])
					mayor= i;
		return mayor;
	}
	public static double valorMenorFila(double[][] matriz, int numFila){
		double menor=0;
		for(int i=0; i<matriz[0].length; i++)
			if(i==0)
				menor= matriz[numFila][i];
			else
				if(menor > matriz[numFila][i])
					menor= matriz[numFila][i];
		return menor;
	}
	
	public static int posMenorFila(double[][] matriz, int numFila){
		int menor=0;
		for(int i=0; i<matriz[0].length; i++)
			if(i==0)
				menor= i;
			else
				if(menor > matriz[numFila][i])
					menor= i;
		return menor;
	}
	
	public static double[][] sumaMatrices(double[][] matriz_1, double [][]matriz_2, int filas, int columnas){
		double [][] suma= new double[filas][columnas];
		for(int i=0; i<filas; i++){
			for(int j=0; j<columnas; j++)
				suma[i][j]= matriz_1[i][j] + matriz_2[i][j];
		}
		return suma;
	}
	
	public static double[][] multiplicaMatrices(double[][] matriz_A, int filas_A, int columnas_A, double[][] matriz_B, int filas_B, int columnas_B){
		double[][] producto = new double [filas_A][columnas_B];
		
		for(int i=0; i<filas_A; i++){
			for(int j=0; j<columnas_B; j++){
				double productElement = 0;
				for(int e=0; e<columnas_A; e++)
					productElement+= matriz_A[i][e] * matriz_B[e][j] ;
				producto[i][j]=productElement;
			}
		}
		return producto;
	}
	
	public static double[][] generaTranspuesta(double[][] matriz, int filas, int columnas){
		double[][] transpuesta = new double[columnas][filas];
		for(int i=0; i<filas; i++)
			for(int j=0; j<columnas; j++)
				transpuesta[j][i]=matriz[i][j];
		return transpuesta;
	}
	
	public static boolean esSimetrica(double[][] matriz, int filas, int columnas){
		int respParcial=0;
		boolean resp=false;
		if(filas==columnas){
			for(int w=0; w<filas; w++){
				int j=0;
				int i=0;
				while(matriz[w][j] == matriz[j][w]  && matriz[j].length<filas){
					System.out.println(matriz[w][j]+"  "+ matriz[j][w]);
					j++;
					}
				while(matriz[i][w] == matriz[w][i] && matriz[i].length<filas){
					System.out.println(matriz[w][i]+"  "+ matriz[i][w]);
					i++;
					}
				
				if(j==i)
					respParcial+=1;;
			}
			if(respParcial == filas)
				resp=true;
		}
		return resp;
	}
	
	public static boolean esIdentidad(double[][] matriz){
		boolean resp= false;
		int cont=0;
		int i=0;
		
		if(matriz.length == matriz[0].length){
			while( i<matriz.length && matriz[i][i] == 1 ){
				matriz[i][i]=0;
				i++;
			}
			if(i == matriz.length){
				for(int e=0; e<matriz.length; e++)
					for(int a=0; a<matriz.length; a++)
						if(matriz[e][a]== 0)
							cont+=1;
				if(cont == (matriz.length*matriz.length))
					resp=true;
			}
		}
				
		return resp;
	}
}
