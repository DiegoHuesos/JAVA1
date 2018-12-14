//Diego Hernandez Delgado
//Clave Unica: 1762626
//Fecha:16/11/2018
//Examen 3er Parcial

//CLASE MABG:
public class MABG {

	//a) Método:
	public static <T> String regresaStringEnSerpiente(T[][]matriz, int filas, int columnas) {
		StringBuilder sb= new StringBuilder();
		for(int i=0; i<filas; i++) {
			if(i%2==0)
				for(int j=0; j<columnas; j++)
					sb.append(matriz[i][j]+"  ");
			else
				for(int j=columnas-1; j>=0; j--)
					sb.append(matriz[i][j]+"  ");
		}
		return sb.toString();
	}
	//*Imprime matriz:
	public static <T> String imprimeMatriz(T[][]matriz, int filas, int columnas) {
		StringBuilder sb= new StringBuilder();
		for(int i=0; i<filas; i++) {
			for(int j=0; j<columnas; j++)
				sb.append(matriz[i][j]+"\t");
			sb.append("\n");
		}
	return sb.toString();
	}
	
	//b)MAIBNN-EJECUTABLE:
	public static void main(String[]args) {
		String[][] matriz= { {"rojo", "verde", "azul"} , {"gris", "violeta", "blanco"} , {"negro", "amarillo", "anaranjado"}, {"carmesí", "café", "bermellón"}};
		System.out.println(MABG.imprimeMatriz(matriz, 4, 3));
		System.out.println("\n"+MABG.regresaStringEnSerpiente(matriz, 4, 3));
	}
	
	
}
