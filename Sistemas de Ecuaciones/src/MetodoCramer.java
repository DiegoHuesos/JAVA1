
public class MetodoCramer {
	
//DETERMINANTE 2X2
	public static int Determinante2x2(int[][]m){
		int resp;
		resp= ( m[0][0] * m[1][1] ) - ( m[0][1] * m[1][0] ) ; 
		return resp;
	}
	
	//DETERMINANTE 3X3
	public static int Determinante3x3(int[][]m){
		int resp;	
		resp = (m[0][0]*(m[1][1]*m[2][2] - m[2][1]*m[1][2])) 
			- (m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0]))
			+ (m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]));
			
		return resp;
		}
		
//MÉTODO CRAMER 4X4
	/*
	public static int[] cramer4x4(int[][]m){
		int ren= m.length;
		int col=m[0].length;
		
		//Instancio la matriz para obtener el determinante del sistema:
		int[][] mds= new int[ren][col-1];
		
		//Instancio una matriz variable para generar los otros determinantes:
		int[][] mdx= new int[ren][col-1]; ;
		
		//Instancio un arreglo donde se guardaran las soluciones:
		int[] sol= new int[col-1];
		
		//Declaro la variable donde se almacenará el determinante del sistema:
		int ds;
		
	}
	*/
	
//MÉTODO DE CRAMER		
	public static int[] Cramer(int[][] m){
			//Defino el largo de renglones y columnas:
			int ren= m.length;
			int col=m[0].length;
			
			//Instancio la matriz para obtener el determinante del sistema:
			int[][] mds= new int[ren][col-1];
			
			//Instancio una matriz variable para generar los otros determinantes:
			int[][] mdx= new int[ren][col-1]; 
			
			//Instancio un arreglo donde se guardaran las soluciones:
			int[] sol= new int[col-1];
			
			//Declaro la variable donde se almacenará el determinante del sistema:
			int ds;
			
			//Asigno los valores de la matriz del sistema:
			for(int i=0; i<ren; i++)
				for(int j=0; j<col-1; j++){
					mds[i][j]=m[i][j];
				}
			//Resuelvo el dicho determinante para obtener el resultado del determinante del sistema:
			ds=MetodoCramer.Determinante3x3(mds);
			
			//For que repite dependiendo el número de variables:
			for(int e=0; e<col-1; e++){
				
				//La matiz MDS asigna todos los valores a la matriz MDX:
				for(int a=0; a<mds.length; a++)
					for(int d=0; d<mds[0].length; d++)
						mdx[a][d]=mds[a][d];
				
				//Dependiendo "e", es decir, la posición de la variable que se esté buscando,
				//será la columna que se sustituirá en MDX para generar su matriz determinante:
				for(int g=0; g<ren; g++)
					mdx[g][e]=m[g][m.length];
				
				//Finalmente, se obtiene el resultado de la variable  al dividir el resultado del 
				//determinante de dicha variable entre el del sistema... y se almacena en el arreglo solución: 
				sol[e]=MetodoCramer.Determinante3x3(mdx)/ds;			
				
			}
			return sol;
		}
	
	public static String imprimeArreglo(int []arr){
		String r="";
		for(int i=0; i<arr.length; i++)
			r+=arr[i]+"";
		return r;
	}
	public static String imprimeArregloDouble(double []arr){
		String r="";
		for(int i=0; i<arr.length; i++)
			r+=arr[i]+"";
		return r;
	}
	public static String imprimeMatriz(int[][] m){
		int tR= m.length;
		int tC= m[0].length;
		StringBuilder stb = new StringBuilder();
		for (int i=0; i<tR; i++) {
			for (int j=0; j<tC; j++) {
				if(m[i][j]!=0)
					stb.append(m[i][j]+" ");
				else
					stb.append(", ");
			}
				
			stb.append("\n");
		}
		return stb.toString();
			
	}
	public static String imprimeMatrizDouble(double[][] m){
		int tR= m.length;
		int tC= m[0].length;
		StringBuilder stb = new StringBuilder();
		for (int i=0; i<tR; i++) {
			for (int j=0; j<tC; j++) {
				if(m[i][j]!=0)
					stb.append(m[i][j]+" ");
				else
					stb.append(", ");
			}
				
			stb.append("\n");
		}
		return stb.toString();
			
	}
//MAIN-CLASS: EJECUTABLE
	public static void main (String [] args){
		int[][] sis= { {2,-1,1,3} , {0,2,-1,1} , {-1,1,0,1}  };
		/*
		System.out.println(MetodoCramer.Determinante3x3(m3x3));
		
		int[][] m2x2= { {3,-2} , {-4,8} };
		
		System.out.println(MetodoCramer.Determinante2x2(m2x2));
		*/
		//int[][] m5x5= { {3,0,-1,0,0}, {8,0,0,-2,0}, {0,2,-2,-1,0}, {0,0,0,0,0}, {0,0,0,0,0}};
		//int[][] m4x4= { {3,2,1,1}, {5,3,4,2}, {1,1,-1,1} };
		//int[][] m4x4= { {2,-1,1,3}, {0,2,-1,1}, {-1,1,0,1}, {0,0,0,0}};
		System.out.println(MetodoCramer.imprimeArreglo(MetodoCramer.Cramer(sis)));
	}
}
