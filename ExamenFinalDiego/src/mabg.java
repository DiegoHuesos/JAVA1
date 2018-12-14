/*Diego Hernandez Delgado
 * Clave unica: 176262
 * Fecha: 13/12/2018
 * EXAMEN FINAL
 */

//CLASE MANEJADOR ARREGLO BIDIMENSIONAL GENERICO (MABG)
public class mabg {
	
	//FUCNION: ES_TRIDIAGONAL
	public static <T> boolean esTridiagonal(T[][] matriz, int tRen, int tCol) {
		boolean resp=false;
		
		try {
			int j=0;
			while(j <matriz.length-1 && !matriz[j][j+1].equals(null) && !matriz[j+1][j].equals(null) && !matriz[j][j].equals(null))
				j++;
			if(j==matriz.length-1 && !matriz[j][j].equals(null))
				resp=true;

		}catch(Exception e) {	
			resp=false;
		}
		
		return resp;
	}
	
	//FUNCION MATRIZ TO_STRING
	public static <T> String mToString(T [][] matriz){
		StringBuilder sb= new StringBuilder();
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++)
				sb.append(matriz[i][j]+"   ");
			sb.append("\n");
		}
		return sb.toString();
	}
	
	//MAIN PARA PROBAR
	public static void main(String[] args) {
		
		String[][] matriz1= {{"uno ", "uno ",  null,  null,  null},
							 {"uno ", "uno ", "uno ",  null,  null},
							 { null, "uno ", "uno ", "uno ",  null},
							 { null,  null, "uno ", "uno ", "uno "},
							 { null,  null,  null, "uno ", "uno"},};
		
		String[][] matriz2= {{"uno ", "uno ",  null,  null,  null},
				 			 {"uno ", "uno ", "uno ",  null,  null},
				 			 { null, "uno ",  null, "uno ",  null},
				 			 { null,  null, "uno ", "uno ",  null},
				 			 { null,  null,  null, "uno ", "uno "},};
		
		System.out.println(mabg.mToString(matriz1));
		System.out.println("�La matriz1 tiene las tres diagonales diferentes a null?\n-->"+mabg.esTridiagonal(matriz1, 5, 5)+"\n");
		
		System.out.println(mabg.mToString(matriz2));
		System.out.println("�La matriz2 tiene las tres diagonales diferentes a null?\n-->"+mabg.esTridiagonal(matriz2, 5, 5)+"\n");
	}
}
