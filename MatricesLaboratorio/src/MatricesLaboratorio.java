import java.util.Scanner;

public class MatricesLaboratorio {
	
	public static double[][] resuelveMatrizGJ(double[][] m, int tR, int tC){
		if (m!=null && tR>0 && tC>0 && tR<=m.length && tC<=m[0].length && tR==tC-1) {
			for(int i = 0; i<tC-1; i++) {
				double div = m[i][i];
				for(int j=0; j<tC; j++)
					m[i][j] /= div;
				for (int k=0;k<tR; k++)
					if(i!=k && m[k][i]!=0) {
						double mult= m[k][i];
						for(int l = 0; l<tC; l++)
							m[k][l] -= m[i][l]*mult;
					}			
			}
		}
		return m;
	}
	
	public static <T> String imprimeMatriz(T[][] m, int tR, int tC){
		StringBuilder stb = new StringBuilder();
		for (int i=0; i<tR; i++) {
			for (int j=0; j<tC; j++) {
				if(m[i][j]!=null)
					stb.append(m[i][j].toString()+", ");
				else
					stb.append(", ");
			}
				
			stb.append("\n");
		}
		return stb.toString();
			
	}
	
	public static <T> String imprimeArreglo(T[] arr, int n) {
		StringBuilder stb = new StringBuilder();
		
		for ( int i = 0  ;  i < n  ;  i++ )
			stb.append(arr[i].toString()+", ");
		
		return stb.toString();
	}
	
	public static <T extends Comparable<T>> int busquedaOrdenada(T[] arr, int n, T dato) {
		int i = 0;
		
		while (i<n && arr[i].compareTo(dato)<0)
			i++;
		if (i == n || arr[i].compareTo(dato)>0)
			i = (i-1)*-1;
		
		return i;
	}
	
	public static <T> void swap(T[] arr, int x, int y) {
		T aux = arr[x];
		arr[x] = arr[y];
		arr[y] = aux;
	}
	
	public static <T extends Comparable<T>> int posMinima(T[] arr, int total, int inicio){
		int posMin = inicio;
		T min = arr[posMin];
		
		for (int i = inicio + 1; i<total; i++) {
			if (arr[i].compareTo(min)<0) {
				posMin = i;
				min = arr[posMin];
			}
		}
		
		return posMin;
	}
	
	public static <T extends Comparable<T>> void seleccionDirecta(T[] arr, int total) {
		int posMin;
		
		for (int i = 0; i < total; i++) {
			posMin = posMinima(arr, total, i);
			swap(arr, i, posMin);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lec=new Scanner(System.in);
		double[][] m = {{6,9,3,7,10},
				        {12,10,2,9,11},
						{3,20,1,8,20},
						{7,4,0,10,3}};
		//System.out.println(imprimeMatriz(resuelveMatrizGJ(m,4,5),4,5));
		int numMaterias =5;
		int maxAlumnos=10;
		Alumno[][] alumnos = new Alumno[numMaterias][maxAlumnos];
		String[] materias = {"Ideas", "Modulos", "Algoritmos", "Algebra", "Calculo"};
		seleccionDirecta(materias, 5);
		System.out.println(imprimeArreglo(materias,5));
		int[] numAl = {0,0,0,0,0};
		for(int i=0;i<5;i++) {	
			System.out.println("Escribe el nombre de la materia");
			int mat = busquedaOrdenada(materias, 5, lec.next());
			if (mat>=0) {
				System.out.println("Dame los datos del alumno: nombre edad sexo");
				String nombre=lec.next();
				int edad = lec.nextInt();
				char sexo = lec.next().charAt(0);
				if (numAl[mat]<maxAlumnos) {
					alumnos[mat][numAl[mat]]= new Alumno(nombre, edad, sexo);
					numAl[mat]++;
				}
			}
		}
		System.out.println(imprimeMatriz(alumnos, numMaterias, maxAlumnos));
		
		
	}

}