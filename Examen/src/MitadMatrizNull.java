
public class MitadMatrizNull {
	
	public static <T> String matrizToString( T [][]matriz){
		String resp="";
		for(int i=0; i<matriz.length;i++){
			for(int j=0; j<matriz[0].length; j++)
				resp+=matriz[i][j]+" ";
			resp+="\n";
		}
		return resp;
	}
	
	public static <T> boolean isUnderDiagonalNull(T [][] matriz){
		boolean respGeneral=false;
		//Parte superior de la matriz no null:
		boolean resp1=true;
		int i=0;
		int j=0;
		while(i<matriz.length && matriz[i][j]!=null){
			j=i;
			while(j<matriz[0].length && matriz[i][j]!=null){
				j++;
			}
			if(j==matriz[0].length)
				j--;
			i++;
		}
		
		if(i==matriz.length)
			i--;
		
		if(matriz[i][j]==null)
			resp1=false;
		
		//Parte inferior de la matriz null:
		boolean resp2=false;
		int a=1;
		int e=0;
		while(a<matriz.length && matriz[a][e]==null){
			e=0;
			while(e<a && matriz[a][e]==null){
				e++;
			}
			if(e==a)
				e--;
			if(matriz[a][e]==null)
				a++;
		}
		if(a==matriz.length )
			resp2=true;
		
		if(resp1==true && resp2==true)
			respGeneral=true;
		
		return respGeneral;
	}
	
	public static void main (String [] args) {
		
		String [] [] matriz = { {"ArAr", "BrBr", "CrCr"} , {null, "DrDr", "FrFr"} , {null, null, "GrGr"} } ;
		System.out.println(MitadMatrizNull.matrizToString(matriz));
		System.out.println("Is principal diagonal and over full and under is null? \n  -"+MitadMatrizNull.isUnderDiagonalNull(matriz));
	}
}
